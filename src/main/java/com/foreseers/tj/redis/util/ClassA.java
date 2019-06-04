package com.foreseers.tj.redis.util;

public class ClassA {

	public static ClassA calss = new ClassA();
	
	static {
		System.out.println("ClassA的静态代码快");
	}
	
	public ClassA() {
		System.out.println("ClassA的构造方法");
	}
	
	{
		System.out.println("ClassA的构造代码快");
	}
}
