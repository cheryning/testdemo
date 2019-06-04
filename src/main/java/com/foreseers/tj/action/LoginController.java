package com.foreseers.tj.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.foreseers.tj.redis.util.CheckUtil;
import com.foreseers.tj.redis.util.MessageUtil;
import com.foreseers.tj.redis.util.TextMessageUtil;

@Controller
@RequestMapping("/weixin")
public class LoginController {

	private final Logger log = LoggerFactory.getLogger(LoginController.class);
	
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
	
}
