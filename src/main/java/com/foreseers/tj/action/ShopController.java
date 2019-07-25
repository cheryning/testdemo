package com.foreseers.tj.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.foreseers.tj.mapper.GoodsDao;
import com.foreseers.tj.mapper.UserMessageDao;
import com.foreseers.tj.mapper.UserinfoDao;
import com.foreseers.tj.model.Goods;
import com.foreseers.tj.model.GoodsExample;
import com.foreseers.tj.model.UserMessage;
import com.foreseers.tj.model.Userinfo;

@Controller
@RequestMapping("/shop")
public class ShopController extends BaseAction{

	private static final Logger log = LoggerFactory.getLogger(ShopController.class);
	
	@Autowired
	private GoodsDao goodsDao;
	
	@Autowired
	private UserinfoDao userinfoDao;
	
	@Autowired
	private UserMessageDao userMessageDao;
	
	@RequestMapping("/publishShop")
	@ResponseBody
	public Map publishShop(HttpServletRequest request,@RequestBody String addressList) {
		JSONObject josn = JSONObject.parseObject(addressList);
		
		String goodsName = josn.getString("goodsName"); //商品名称
		String goodsDesc = josn.getString("goodsDesc"); //商品描述
		String newPrice = josn.getString("newPrice");  //
		String oldPrice = josn.getString("oldPrice");
		String mobile = josn.getString("mobile");  //；联系电话
		String authorName = josn.getString("authorName");  //发布的人
		String openid = josn.getString("openid");
		log.info("openid:"+openid);
		log.info("商品名称:"+goodsName+",商品描述"+goodsDesc+",价格："+newPrice+",联系电话:"+mobile+",发布的人："+authorName);
		Date date = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		String publishtime = dateformat.format(date);
		Goods goods = new Goods();
		goods.setGoodsname(goodsName);
		goods.setGoodsdesc(goodsDesc);
		goods.setNewprice(Double.parseDouble(newPrice));
		goods.setOldprice(Double.parseDouble(oldPrice));
		goods.setAuthorname(authorName);
		goods.setPublishtime(publishtime);
		goods.setOpenid(openid);
		goods.setStatus("在售");
		
		 goodsDao.insertSelective(goods);
		
		log.info("goodsid:"+goods.getId());
	//	Goods Goods = goodsDao.selectByPrimaryKey(1);
	//	log.info("Goods:"+Goods.getGoodsname());
		
		Map<String,Integer> map = new HashMap();
		map.put("goodsId", goods.getId());
		return map;
	}
	
	@RequestMapping("/listGoods")
	@ResponseBody
	public Map listGoods() {
		GoodsExample example = new GoodsExample();
		 List<Goods>  list = goodsDao.selectByExample(example);
		 Map<String,List> map = new HashMap<>();
		 map.put("goodsList", list);
		return map;
	}
	
	@RequestMapping("/getGoodsDetails")
	@ResponseBody
	public Map getGoodsDetails(String goodsId) {
		Goods goods = goodsDao.selectByPrimaryKey(Integer.parseInt(goodsId));
		String openid = goods.getOpenid();
		Userinfo user =  userinfoDao.selectByOpenid(openid);
		int goodsid = goods.getId();
		List<UserMessage> list = userMessageDao.selectByGoodskey(goodsid);
		log.info("评论列表："+list);
		
		log.info("评论数："+goods.getComcount());
		Map<String,Object> map = new HashMap<>();
		map.put("goodsId", goods.getId());
		map.put("goodsName", goods.getGoodsname());
		map.put("goodsDesc", goods.getGoodsdesc());
		map.put("newPrice", goods.getNewprice());
		map.put("oldPrice", goods.getOldprice());
		map.put("goodsCreateTime", goods.getPublishtime());
		map.put("goodsImageUrl", goods.getImg());
		map.put("goodsAuthorName", goods.getAuthorname());
		map.put("img", user.getAvatarurl());
		map.put("msgCount", goods.getComcount());
		map.put("messageList", list);
		return map;
	}
	
	@RequestMapping("/getGoodsByAuthor")
	@ResponseBody
	public Map getGoodsByAuthor(String openid) {
		
		log.info("获取自己的发布商品");
		log.info("authorName:"+openid);
	//	List<Goods> goods = goodsDao.selectByName(author);
		List<Goods> goods = goodsDao.selectByOpenid(openid);
		
		log.info("查询出来的商品:"+goods);
		Map<String,List> map = new HashMap<>();
		map.put("authorGoodsList", goods);
		return map;
	}
	
	@RequestMapping("/deleteMyGoods")
	@ResponseBody
	public Map deleteMyGoods(@RequestBody String data ) {
		JSONObject json = JSONObject.parseObject(data);
		int id = json.getIntValue("id");
		String openid = json.getString("openid");
		Map<String,Object> map = new HashMap<>();
		
		try {
			goodsDao.deleteByPrimaryKey(id);
			map.put("success", true);
		}catch(Exception e) {
			map.put("success", false);
		}	
		
		return map;
	}
	
}
