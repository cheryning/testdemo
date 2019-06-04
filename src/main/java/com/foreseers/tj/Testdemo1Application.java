package com.foreseers.tj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Testdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Testdemo1Application.class, args);
	}

}

