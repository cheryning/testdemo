package com.foreseers.tj.websocket;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/checkcenter")
public class CheckCenterController {

	//页面请求
//	@GetMapping("/socket/{cid}")
//	public ModelAndView socket(@PathVariable String cid) {
//		ModelAndView mav=new ModelAndView("/socket");
//		mav.addObject("cid", cid);
//		return mav;
//	}
//	 
	
	//推送数据接口
	@ResponseBody
	@RequestMapping("/socket/push")
	public String pushToWeb(HttpServletRequest re ) {  
		 String zid =  re.getParameter("zid");
		 String fid =  re.getParameter("fid");
		 String message = zid;
		try {
			WebSocketServer.sendInfo(message,fid);
		} catch (IOException e) {
			e.printStackTrace();
		//	return ApiReturnUtil.error(cid+"#"+e.getMessage());
		}  
		return "success";
	}
	 
} 
