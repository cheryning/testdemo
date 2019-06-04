package com.foreseers.tj.job;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.foreseers.tj.huanxin.HttpHuanxin;


import ch.qos.logback.core.net.SyslogOutputStream;

public class Testutil {
/*
	public static boolean deleteDir(File dir) {
	    if (!dir.exists())
	            return false;
	    if (dir.isDirectory()) {
	        String[] childrens = dir.list();
	        System.out.println(JSONObject.toJSON(childrens));
	        // 递归删除目录中的子目录下
	        for (String child : childrens) {
	             System.out.println(child);
	             File file1 = new File(dir, child);
	             file1.delete();
	        }
	    }
	    // 目录此时为空，可以删除
	    return true;
	}
*/
	
	@Test
	public void iamefas() throws ClientProtocolException, IOException {
	
		HttpHuanxin httpHuanxin = new HttpHuanxin();
	
	       String hstr=  "http://a1.easemob.com/1106190114019314/foreseers/users";
	       Map<String,Object> maph = new HashMap<String, Object>();
	        maph.put("username",1);
	        maph.put("password", "123");
	        maph.put("nickname", "小花");
	        CloseableHttpResponse reponse =  httpHuanxin.sendPostDataByJson(hstr, JSON.toJSONString(maph), "utf-8",null);
	        int status = reponse.getStatusLine().getStatusCode();
	        System.out.println(status);
	
		    
	}
}
