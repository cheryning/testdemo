package com.foreseers.tj.redis.util;

public class ClassB extends ClassA {

	static {
		System.out.println("ClassB的静态代码块");
	}
	public ClassB() {
		System.out.println("ClassB的构造方法");
	}
	
	{
		System.out.println("ClassB的构造代码快");
	}
	
	public static ClassC calssc = new ClassC();
	
	public void excute() {
		System.out.println("执行方法");
	}
}
