package com.foreseers.tj.action;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.foreseers.tj.model.BusinessExpection;
import com.foreseers.tj.model.EmBussinsError;
import com.foreseers.tj.model.ResultType;

@Controller
@RequestMapping("/Image")
@CrossOrigin
public class ImageController extends BaseAction{

	private static final Logger log = LoggerFactory.getLogger(ImageController.class);
			
	@RequestMapping("/upload")
	@ResponseBody
	public ResultType upload(MultipartFile file) throws BusinessExpection, IllegalStateException, IOException {
		log.info("用户头像上传方法");	
		
	//	MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
	//	MultipartFile file= multipartRequest.getFile("file");
	//	JSONObject json = JSONObject.parseObject(result);
	//	String username = json.getString("username");
	//	log.info("用户名："+username);
		if(file == null) {
			 throw new BusinessExpection(EmBussinsError.UNKNOWN_ERROR,"参数不合法");	
		}
		String headload =  "e:/dt/image/";
		String name = file.getOriginalFilename();   //图片名称
		File savefile = new File(headload);
	//	String save = savefile.getAbsolutePath()+"/"+name;
		String rand =  getRandom();
		DateFormat bf = new SimpleDateFormat("yyyyMMddHHmmss");//多态
		Date date = new Date();
		
		String dateName = bf.format(date)+rand+".jpg";   //重命名
		
		String save = savefile.getAbsolutePath()+"/"+dateName;
		file.transferTo(new File(save));  ///保存图片
		String filepath = "http://192.168.1.73:80/"+name;   //图片路径地址
		log.info("保存图片成功");
		log.info("图片路径 ："+filepath);
		log.info("返回结果："+ResultType.creat("success"));
		return ResultType.creat("success");
	}
	
	// produces="application/jsom; utf-8"
	@RequestMapping(value = "/uploadJosn" )
	@ResponseBody
	public String uploadJosn(@RequestBody String result) {
		log.info("Base64上传多张图片");
		log.info("result:"+result.toString());
		JSONArray json = JSON.parseArray(result);
		for(int i= 0; i<json.size();i++) {
			
			JSONObject job = json.getJSONObject(i);
			String name = job.getString("name");
			String base64 = job.getString("base64");
			log.info("name:"+name);
			log.info("base64:"+base64);
		}
		
		
		return "success";
	}
	
	@RequestMapping("/message")
	@ResponseBody
	public ResultType message(HttpServletRequest request) {
		log.info("商品信息接口");
		String title =  request.getParameter("title");
		String price =  request.getParameter("price");
		String note =  request.getParameter("note");
		log.info("商品名称："+title);
		log.info("商品价格："+price);
		log.info("商品简介："+price);
		log.info("返回参数："+ResultType.creat("success"));
		return ResultType.creat("success");
	}
	
	/*
	 * 生成随意字符串
	 */
	public String getRandom() {
		Random random = new Random();
		String result="";
		for (int i=0;i<6;i++)
		{
			result+=random.nextInt(10);
		}
		return result;
	}
	
}
