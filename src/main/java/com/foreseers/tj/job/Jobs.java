package com.foreseers.tj.job;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Jobs {
					//0 0 1 * * ?(凌晨一点)
	@Scheduled(cron="0 0,45 0,13 ? * ? ")
	public void getTest() {
		
		System.out.println("现在的时间是："+new Date());
	}
	
}
