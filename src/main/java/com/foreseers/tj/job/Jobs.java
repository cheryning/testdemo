package com.foreseers.tj.job;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.foreseers.tj.redis.util.DeleteLog;

@Component
public class Jobs {
					//0 0 1 * * ?(凌晨一点)
					//0 0 0 L * ?(每个月的最后一天的0时)
//	@Scheduled(cron="0 0,54 0,16 ? * ? ")
	public void getTest() {
		
		System.out.println("现在的时间是："+new Date());
		DeleteLog DeleteLog = new DeleteLog();
		String strPath = System.getProperty("user.dir");
		
		System.out.println("得到路径："+strPath);
		
		String geshi = ".gz";
		DeleteLog.refreshFileList(strPath, geshi);
	}
	
}
