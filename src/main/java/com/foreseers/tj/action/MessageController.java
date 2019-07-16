package com.foreseers.tj.action;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
import com.foreseers.tj.model.Goods;
import com.foreseers.tj.model.UserMessage;


/*
 * 评论
 */
@Controller
@RequestMapping("/message")
public class MessageController {

	private static final Logger log = LoggerFactory.getLogger(MessageController.class);
	
	@Autowired
	private UserMessageDao userMessageDao;
	
	@Autowired
	private GoodsDao goodsDao;
	
	@RequestMapping("/addMessage")
	@ResponseBody
	public Map addMessage(@RequestBody String messageObj) throws ParseException {
		
		log.info("留言·······");
		JSONObject json =  JSONObject.parseObject(messageObj);
		String comment = json.getString("comment");
		String goodsId = json.getString("goodsId");
		String userName = json.getString("userName");
		String userImage = json.getString("userImage");
		String openid = json.getString("openid");
		String replyCommentId = json.getString("replyCommentId");
		String replyUserName = json.getString("replyUserName");
		log.info("评论id："+replyCommentId);
		log.info("评论的对象："+replyUserName);

		UserMessage userMessage = new UserMessage();
		userMessage.setComment(comment);
		userMessage.setGoodsid(Integer.parseInt(goodsId));
		userMessage.setMsgauthorname(userName);
		userMessage.setMsgauthorimg(userImage);
		userMessage.setMsgauthoropenid(openid);
		Date date = new Date();
		 userMessage.setMsgdate(date);
		 
		if(replyCommentId != null ) {
			userMessage.setReplyCommentId(Integer.parseInt(replyCommentId));	
			userMessage.setReplyUserName(replyUserName);
		}
		Map<String,Integer> map = new HashMap<>();
		
		try {
			userMessageDao.insertSelective(userMessage);
			map.put("messageId", 1);
			//商品评论数加1
			Goods goods = new Goods();
			goods.setId(Integer.parseInt(goodsId));
			
			goodsDao.updateCount(Integer.parseInt(goodsId));
					
			return map;
			
		}catch(Exception e) {
			map.put("messageId", 0);
			return map;
		}
	}
	
	
}
