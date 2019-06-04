package com.foreseers.tj.websocket;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class test01 {

	
	@Test
	public void gettime() throws ParseException {
		
		String datestr = "2019-01-23 10";
		String str = "2019012310";
		DateFormat df = new SimpleDateFormat("yyyyMMddHH");
		Date date = df.parse(str);
		System.out.println(date);
	}

}
