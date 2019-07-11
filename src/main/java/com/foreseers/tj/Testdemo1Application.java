package com.foreseers.tj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;



@SpringBootApplication
@EnableScheduling   //定时任务
@MapperScan("com.foreseers.tj.mapper")
@ComponentScan(basePackages = "com.foreseers.tj.*")
@EnableCaching  //缓存
public class Testdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Testdemo1Application.class, args);
	}



}

