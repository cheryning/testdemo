package com.foreseers.tj.redis.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DeleteLog {

	static int count = 0;
		
	/*
	 * 删除上一个月的log文件
	 * @param strPath 文件夹路径
	 * @param geshi 要删除的文件的后缀名
	 */
	
	public static void refreshFileList(String strPath,String geshi) {
	    File dir = new File(strPath);
	    File[] files = dir.listFiles();
	    if (files == null)
	    {
	      System.out.println("该目录下没有任何一个文件！");
	      return;
	    }
	    for (int i = 0; i < files.length; i++) {
	   //   if (files[i].isDirectory()) {
	  //      refreshFileList(files[i].getAbsolutePath(),geshi);
	  //    }else {
	    if (!files[i].isDirectory()) {	
	        String strFileName = files[i].getAbsolutePath().toLowerCase();  //得到文件名称
	        if(strFileName.endsWith(geshi)){
	        
	        System.out.println("strFileName:"+strFileName);
//	        String[] strs = strFileName.split("\\\\");
//	        String str = strs[strs.length-1];
//	        System.out.println("切割得到文件具体的名称："+str);
//	        String[] dates = str.split(".");
//	        String  datetime = dates[dates.length-3];
//	        System.out.println("得到文件日期："+datetime);  //2019-05-15
	        
	        String[] months = strFileName.split("-");
	        String month = months[months.length-2]; //得到月份 05
	        
//	        Calendar calendar = Calendar.getInstance();
//	        calendar.setTime(new Date());
//	        int monthStr = calendar.get(calendar.MONTH);
	        String dateStr =  new SimpleDateFormat("yy-MM-dd").format(new Date()); //2019-06-14
	        String[] dateStrs = dateStr.split("-");
	        String monthStr = dateStrs[dateStrs.length-2];
	        if(!month.equals(monthStr)) {
	        	//如果不是这个月的文件
	        	System.out.println("正在删除：" + strFileName);
	        	  files[i].delete();
	        	  count++;
	        }
	        
//	        if(strFileName.endsWith(geshi)){
//	          
//	        
//	          
//	        }
	        }
	      }
	      
	    
	    }
	  }
} 
