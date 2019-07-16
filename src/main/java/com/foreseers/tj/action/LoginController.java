package com.foreseers.tj.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.http.client.ClientProtocolException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.foreseers.tj.http.RedisClient;
import com.foreseers.tj.http.httptest;
import com.foreseers.tj.mapper.UserinfoDao;
import com.foreseers.tj.model.Userinfo;
import com.foreseers.tj.redis.util.CheckUtil;
import com.foreseers.tj.redis.util.MessageUtil;
import com.foreseers.tj.redis.util.RedisUtil;
import com.foreseers.tj.redis.util.TextMessageUtil;

import redis.clients.jedis.Jedis;

@Controller
@RequestMapping("/weixin")
public class LoginController {

	private final Logger log = LoggerFactory.getLogger(LoginController.class);
//	
//	@Autowired
//	private RedisClient redisClient;
	@Autowired
	private UserinfoDao userinfoDao;
	
	@RequestMapping(value = "/login",method=RequestMethod.GET)
	public void login(HttpServletRequest request,HttpServletResponse reponse) {
		log.info("登录方法");
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String echostr = request.getParameter("echostr");
		PrintWriter out = null;
		
		try {
			out = reponse.getWriter();
			if(CheckUtil.checkSignature(signature, timestamp, nonce)){
				out.write(echostr);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			out.close();
		}
		
		//return null;
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public void dopost(HttpServletRequest request,HttpServletResponse response) {
		
		log.info("获得消息方法");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = null;
		//将微信请求xml转为map格式，获取所需的参数
		Map<String,String> map = MessageUtil.xmlToMap(request);
		String ToUserName = map.get("ToUserName");
		String FromUserName = map.get("FromUserName");
		String MsgType = map.get("MsgType");
		String Content = map.get("Content");
		
		String message = null;
		//处理文本类型，实现输入1，回复相应的封装的内容
		if("text".equals(MsgType)){
			if("1".equals(Content)){
				TextMessageUtil textMessage = new TextMessageUtil();
				message = textMessage.initMessage(FromUserName, ToUserName);
			}
		}
		try {
			out = response.getWriter();
			log.info("返回前端值");
			out.write(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.close();

	}
	
	/*
	 * 获得code
	 * https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code
	 */
	@RequestMapping("/wxLogin")
	@ResponseBody
	public String wxLogin(String code) throws ClientProtocolException, IOException, NoSuchAlgorithmException {
		log.info("获得的code:"+code);
		String appid = "wx446884751e647e06";
		String secret =  "6d2f7e30b4024b93db9974d35dd83c68";
		 
		String url = "https://api.weixin.qq.com/sns/jscode2session?appid="+appid+"&secret="+secret+"&js_code="+code+"&grant_type=authorization_code";
		String result = httptest.sendGetData(url, "utf-8"); 
		//JSONObject json  = JSONObject.parseObject(result)
		String  session_key = JSONObject.parseObject(result).getString("session_key");
		String openid = JSONObject.parseObject(result).getString("openid");
		log.info("session_key:"+session_key);
		log.info("openid:"+openid);
		
		if(openid != null) {

			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(openid.getBytes());
			byte[] b = messageDigest.digest();
			String md5openId = parseByte2HexStr(b);
			log.info("加密后的openid:"+md5openId);
			Jedis jedis = RedisUtil.getJedis();
			String token = jedis.get(md5openId);
			if(StringUtils.isNotBlank(token)) {
			//	jedis.deletekey(md5openId);
				jedis.del(md5openId);
			}
			//将openid保存到redis中
	///		redisClient.set(md5openId, openid);
			jedis.set("md5openId", openid);
			//将md5openId返回
			return md5openId;
		}else {
			return "code不合法";
		}
			
	}
	
	/*
	 * 二进制转换成16进制，加密后的字节数组不能直接转换为字符串
	 */
    static String parseByte2HexStr(byte buf[]) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < buf.length; i++) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }

    @RequestMapping("/getname")
    @ResponseBody
    public String getname() {
   	Jedis jedis = RedisUtil.getJedis();
    	
    	return jedis.get("my");
    }
    
    @RequestMapping("/setUser")
    @ResponseBody
    public String setUser(@RequestBody String userInfo) {
    	log.info("保存用户信息");
    	JSONObject json = JSONObject.parseObject(userInfo);
    	String nickName = json.getString("nickName");
    	String avatarUrl = json.getString("avatarUrl");
    	String gender = json.getString("gender");
    	String openid = json.getString("openid");   	
    	log.info("用户名称："+nickName);
    	log.info("openid："+openid);
    	
    	Userinfo userinfo = new Userinfo();
    	userinfo.setNickname(nickName);
    	userinfo.setAvatarurl(avatarUrl);
    	userinfo.setGender(gender);
    	userinfo.setOpenid(openid);
    	try{
    		Userinfo user = userinfoDao.selectByOpenid(openid);
    		if(user == null) {
    			userinfoDao.insertSelective(userinfo);
    		}
    		return "success";
    	}catch(Exception e) {
    		return "fail";
    	}
	
    }
}
