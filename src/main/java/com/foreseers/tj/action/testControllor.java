package com.foreseers.tj.action;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;



@Controller
public class testControllor {

	@RequestMapping("test01")
	@ResponseBody
	public String test(HttpServletRequest re) {
		
		String name =  re.getParameter("name");
		System.out.println(name);
		String pathurl = System.getProperty("user.dir"); //E:\workspace\testdemo-1 (得到的项目路径)
		String result = "";
		Random random = new Random();
		for(int i = 0;i<8; i++) {
			result +=random.nextInt(10);
		}
		System.out.println(result);
		
		String resultStr =  md5(result,"110");
		System.out.println("加密后的str:"+resultStr);
		boolean verifyresult =  verify(result,"110",resultStr);
		System.out.println(verifyresult);
		
		return  result;
	}
	
	/*
	 * MD5加密方法
	 */
	public static String md5(String text,String key) {
		String encodeStr = DigestUtils.md5Hex(text+key);
		return encodeStr;
	}
	/*
	 * MD5解密方法
	 */
	public static boolean  verify(String text,String key,String md5) {
		
		String md5Text = md5(text,key);
		if(md5Text.equals(md5)) {
			
			return true;
		}
		
		return false;
	}
	
	
	@RequestMapping("/uploadhead")
	@ResponseBody
	public String uploadtou(HttpServletRequest request,MultipartFile file) throws  IllegalStateException, IOException {
		

		try {
		String name = file.getOriginalFilename();
		String pathurl = System.getProperty("user.dir");
		//String pathurl = request.getSession().getServletContext().getRealPath("/image\\userhead");
		String url = pathurl+"\\image\\userhead\\"+01;
		System.out.println(url);
		File savefile = new File(url);
		if(!savefile.exists()) {
			savefile.mkdirs();
		}
		String save = url+"\\"+name;
		System.out.println(save);
		file.transferTo(new File(save));
//		User user = new User();
//		user.setFacebook(facebook);
//		user.setHead(save);
//		userService.updateByFaceIDSelective(user);
		}catch (Exception e) {
			// TODO: handle exception
			return "fail";
		}
		return "success";
	}
	
	@RequestMapping("/testname")
	@ResponseBody
	public String nametest() {
		DateFormat bf = new SimpleDateFormat("yyyyMMddHHmmss");//多态
		Date date = new Date();

		String name = bf.format(date);
		System.out.println(name);
		return name;
	}
	
	@RequestMapping("/getday")
	@ResponseBody
	public String getday() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String day1 = "2019-01-12 12:00:00";
		Date date1 = format.parse(day1);
		Date date = new Date();
		long nd = 1000 * 24 * 60 * 60;//一天的毫秒数
		long nh = 1000 * 60 * 60;//一小时的毫秒数
	    long nm = 1000 * 60;//一分钟的毫秒数
		long diff = date1.getTime()-date.getTime();
		long day = diff / nd ;
		long hour = diff % nd / nh;//计算差多少小时
		long min = diff % nd % nh / nm;//计算差多少分钟
		
		if(day ==0 ) {
			if(hour == 0) {
				if(min > 0) {
					day = 1;
				}
			}
		}else {
			if(day > 0) {
				day++;
			}else {
				day = 0;
			}
		}
		return "还剩天数为："+day+"还剩时间为："+hour+"asda:"+min;
	}
	
}
