package com.foreseers.tj.huanxin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class HttpHuanxin {

	
	 public  CloseableHttpResponse sendPostDataByJson(String url, String json, String encoding,String token) throws ClientProtocolException, IOException {
	        String result = "";


	        // 创建httpclient对象
	        CloseableHttpClient httpClient = HttpClients.createDefault();

	        // 创建post方式请求对象
	        HttpPost httpPost = new HttpPost(url);

	        // 设置参数到请求对象中
	       if(json != null) {
	        StringEntity stringEntity = new StringEntity(json, ContentType.APPLICATION_JSON);
	        stringEntity.setContentEncoding("utf-8");
	        httpPost.setEntity(stringEntity);
	       }
	        httpPost.setHeader("Content-Type:","application/json");
	        if(token!= null) {
	        	httpPost.setHeader("Authorization", "Bearer "+token);
	        }
	        // 执行请求操作，并拿到结果（同步阻塞）
	        CloseableHttpResponse response = httpClient.execute(httpPost);
	        // 获取结果实体
	        // 判断网络连接状态码是否正常(0--200都数正常)
//	        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//	            result = EntityUtils.toString(response.getEntity(), "utf-8");
//	        }

	        // 释放链接
	    //    response.close();

	        return response;
	    }
	
	  /**
	     * get请求传输数据
	     * 
	     * @param url
	     * @param encoding
	     * @return
	     * @throws ClientProtocolException
	     * @throws IOException
	     */
	    public CloseableHttpResponse sendGetData(String url, String encoding,String token) throws ClientProtocolException, IOException {
	        String result = "";

	        // 创建httpclient对象
	        CloseableHttpClient httpClient = HttpClients.createDefault();

	        // 创建get方式请求对象
	        HttpGet httpGet = new HttpGet(url);
	        httpGet.addHeader("Content-type", "application/json");
	        if(token!= null) {
	        	httpGet.setHeader("Authorization", "Bearer "+token);
	        }
	        // 通过请求对象获取响应对象\
	       // httpGet.getAllHeaders().toString();
	     //   httpGet.getHeaders("Authorization").toString()
	        System.out.println( httpGet.getAllHeaders().toString());
	        CloseableHttpResponse response = httpClient.execute(httpGet);

	        // 获取结果实体
	        // 判断网络连接状态码是否正常(0--200都数正常)
//	        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//	            result = EntityUtils.toString(response.getEntity(), "utf-8");
//	        }
	        // 释放链接
	    //    response.close();

	        return response;
	    }
	    
	    
	 @Test
	  public void testSendPostDataByJson() throws ClientProtocolException, IOException {
		    
	       String hstr=  "http://a1.easemob.com/1106190114019314/foreseers/users";
	       Map<String, String> maph = new HashMap<String, String>();
	        maph.put("username", "2");
	        maph.put("password", "123");	
	        
	        String url=  "http://a1.easemob.com/1106190114019314/foreseers/token";
	        Map<String, String> map = new HashMap<String, String>();
	        map.put("grant_type","client_credentials");
	        map.put("client_id","YXA6HlxXgBiWEemPQ-MnLEqLUg");
	        map.put("client_secret","YXA6GloiOfyJ83aGrpEkFlIaQ3X1dsc");
	        
	        
	    //    CloseableHttpResponse rebody = sendPostDataByJson(url, JSON.toJSONString(map), "utf-8",null);
	        //  System.out.println(rebody.getStatusLine().getStatusCode());
	       //   String result =  EntityUtils.toString(rebody.getEntity(),"utf-8");
	       //   JSONObject job = JSON.parseObject(result);
	         // String token = job.getString("access_token");
	                        //YWMtwFnvMB7VEem35DXVz3YkmAAAAAAAAAAAAAAAAAAAAAEeXFeAGJYR6Y9D4ycsSotSAgMAAAFoeVXvbQBPGgBsgh7e4W7He7RM5rDlTYGATdKeCvzr3bP6YyMr-pgP9Q
	          String token = "YWMtwFnvMB7VEem35DXVz3YkmAAAAAAAAAAAAAAAAAAAAAEeXFeAGJYR6Y9D4ycsSotSAgMAAAFoeVXvbQBPGgBsgh7e4W7He7RM5rDlTYGATdKeCvzr3bP6YyMr-pgP9Q";
	          System.out.println(token);
	       //   rebody.close();															    //2018112717
	          String urll =  "http://a1.easemob.com/1106190114019314/foreseers/chatmessages/2019012310"; 
	          CloseableHttpResponse rebodyd = sendGetData(urll,"utf-8",token);
	          System.out.println(rebodyd.getStatusLine().getStatusCode());
	          String  mesurl = "";
	          String filePath = "/testmsg/";
	       //   String downloadUrl = HttpUtil.getEasemobChatMessageDownloadUrl(urll , token);
	          
	             if(rebodyd.getStatusLine().getStatusCode() == 200) {
	        	  String result = EntityUtils.toString(rebodyd.getEntity(), "utf-8");
	        	  System.out.println(result);
	        	  JSONObject job = JSON.parseObject(result);
	        	  JSONArray data = job.getJSONArray("data");
	        	  for(int i= 0;i<data.size();i++) {
	        	 JSONObject resultjson = JSON.parseObject(data.get(i).toString());
	        	 mesurl =   resultjson.getString("url");		  	        		  
	        	  }
	        	  System.out.println(mesurl);
	            
	          rebodyd.close();
	         //得到url   mesurl
	          System.out.println(mesurl);
	          if(mesurl != null) {
	        	  //下载文件到指定的文件夹
	        	  String filename = "2019012310.gz";
	        	  String downLoadResult = HttpUtil.downloadFileByUrls(mesurl, filename,filePath);
	        	  if("ok".equals(downLoadResult)) {
	        		  //解压文件
	        		  String outPutFilePath = unZipFile(filePath + filename);
	        		   //读取文件
	        		  if(outPutFilePath.length()>0) {
	        			  String content = readFile2String(outPutFilePath);
	        			  if(content.length()>0) {
	        				//  chatMessageService.handleContent(content);
	        				 // System.out.println(content);
	        				  handleContent(content);
	        			  }
	        		  }   
	        	  }
	        	  
	          }
	          
	       }  
	 }
	 //解压压缩包
     private String unZipFile(String filePath) {
         //解压gz压缩包
         String ouPutFile = "";
         try {
             //建立gzip压缩文件输入流
             FileInputStream fIn = new FileInputStream(filePath);
             //建立gzip解压工作流
             GZIPInputStream gzIn = new GZIPInputStream(fIn);
             //建立解压文件输出流
             ouPutFile = filePath.substring(0,filePath.lastIndexOf('.'));
             FileOutputStream fOut = new FileOutputStream(ouPutFile);
             int num;
             byte[] buf=new byte[1024];
  
  
             while ((num = gzIn.read(buf,0,buf.length)) != -1)
             {
                 fOut.write(buf,0,num);
             }
             gzIn.close();
             fOut.close();
             fIn.close();
         } catch (Exception e){
             e.printStackTrace();
         }
         return ouPutFile;
     }
     /**
      * 读取文件内容
     **/
     private String readFile2String(String outPutFilePath) {
         String content = "";
         String encoding = "UTF-8";
         File file = new File(outPutFilePath);
         Long fileLength = file.length();
         byte[] fileContent = new byte[fileLength.intValue()];
         try {
             FileInputStream in = new FileInputStream(file);
             in.read(fileContent);
             in.close();
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
         try {
             content = new String(fileContent, encoding).trim();
         } catch (UnsupportedEncodingException e) {
             e.printStackTrace();
         }
         return content;
     }
     public void handleContent(String content) {
         JSONArray jsonArray = JSON.parseArray("[" + content + "]");
         List<ChatMessage> chatMessageList = new ArrayList<ChatMessage>();
         for(int i = 0; i < jsonArray.size(); i++){
             ChatMessage chatMessage = new ChatMessage();
             JSONObject jsonObject = (JSONObject) jsonArray.get(i);
             JSONArray bodyJsons = (JSONArray)((JSONObject) jsonObject.get("payload")).get("bodies");
             for(int j = 0; j < bodyJsons.size(); j ++) {
                 JSONObject bodyJson = (JSONObject) bodyJsons.get(j);
                 chatMessage.setMsg_id(jsonObject.getString("msg_id"));
               //  chatMessage.setTimestamp(new Date(Long.parseLong(jsonObject.getString("timestamp"))).toString());
                 //chatMessage.setTimestamp(new Date(Long.parseLong(jsonObject.getString("timestamp"))).toString());
                 Date date = new Date(Long.parseLong(jsonObject.getString("timestamp")));
                 DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH");
                 String msgdate = df.format(date);
                 chatMessage.setTimestamp(msgdate);
                 chatMessage.setDirection(jsonObject.getString("direction"));
                 chatMessage.setTo_user(jsonObject.getString("to"));
                 chatMessage.setFrom_user(jsonObject.getString("from"));
                 chatMessage.setMsg(bodyJson.getString("msg"));
                 chatMessage.setType(bodyJson.getString("type"));
                 chatMessage.setUrl(bodyJson.getString("url"));
                 chatMessageList.add(chatMessage);
 //             System.out.println(bodyJson.getString("url"));
                 System.out.println(chatMessage);
            
             }
         }
         System.out.println(chatMessageList);
         //批量插入到数据库
//         getMapper().insertBatch(chatMessageList);
     }

     
}
