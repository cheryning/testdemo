package com.foreseers.tj.redis.util;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Test {

	static {
		System.out.println("Test的静态代码快");
	}
	
	public static void main(String[] args) {
		System.out.println("执行main方法");
		
		ClassB b = new ClassB();  //实例化ClassB
		b.excute();
	}
	
	
}
