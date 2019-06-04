package com.foreseers.tj.huanxin;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class huanxin {

	StringBuffer  huanxinurl = new StringBuffer("http://a1.easemob.com/1106190114019314/foreseers");
	
	String org_name = "1106190114019314";
	
	String app_name = "foreseers";
	
	
//	
//	public void getMessage() {
//		
//		   String urll =  "http://a1.easemob.com/1106190114019314/foreseers/chatmessages/2019012310"; 
//	          CloseableHttpResponse rebodyd = sendGetData(urll,"utf-8",token);
//	       //   System.out.println(rebodyd.getStatusLine().getStatusCode());
//	          String  mesurl = "";
//	          String filePath = "/chatFiles/";
//	          if(rebodyd.getStatusLine().getStatusCode() == 200) {
//	        	  String result = EntityUtils.toString(rebodyd.getEntity(), "utf-8");
//	        	  System.out.println(result);
//	        	  JSONObject job = JSON.parseObject(result);
//	        	  JSONArray data = job.getJSONArray("data");
//	        	  for(int i= 0;i<data.size();i++) {
//	        	 JSONObject resultjson = JSON.parseObject(data.get(i).toString());
//	        	 mesurl =   resultjson.getString("url");		  	        		  
//	        	  }
//	        	  System.out.println(mesurl);
//	          }
//	          rebodyd.close();
//	         //得到url   mesurl
//	          if(!"fail".equals(mesurl)) {
//	        	  String filename = "2019012310.gz";
//	        	  String downLoadResult = HttpUtil.downloadFileByUrls(mesurl, filename,filePath);
//	        	  
//	          }
//		
//	}
	
	@Test
	public void userFriend() throws ClientProtocolException, IOException {
		
		HttpHuanxin httphuanxinn = new HttpHuanxin();
		String url = huanxinurl+"/users/87/contacts/users/88";
		String token = "YWMtwFnvMB7VEem35DXVz3YkmAAAAAAAAAAAAAAAAAAAAAEeXFeAGJYR6Y9D4ycsSotSAgMAAAFoeVXvbQBPGgBsgh7e4W7He7RM5rDlTYGATdKeCvzr3bP6YyMr-pgP9Q";
		CloseableHttpResponse reponse = httphuanxinn.sendPostDataByJson(url, null, "utf-8", token);
		  System.out.println(reponse.getStatusLine().getStatusCode());
		  String result = EntityUtils.toString(reponse.getEntity(), "utf-8");
		  System.out.println(result);
	}
	
	
}
