package com.foreseers.tj.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.foreseers.tj.redis.util.CheckUtil;

@Controller
@RequestMapping("/weixin")
public class LoginController {

	private final Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping("/login")
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
}
