package com.java1234.chap03.sec07;

//静态代码块示例
public class Demo3 {

	/**
	 * 静态代码块，静态代码块是只会执行一次的
	 */
	static {
		System.out.println("静态代码块");
	}
	
	/**
	 * 构造块
	 */
	{
		System.out.println("通用构造块");
	}
	
	/**
	 * 构造方法一
	 */
	public Demo3() {
		System.out.println("构造方法一");
	}

	/**
	 * 构造方法二
	 */
	public Demo3(int i) {
		System.out.println("构造方法二");
	}

	/**
	 * 构造方法三
	 */
	public Demo3(int i, int j) {
		System.out.println("构造方法三");
	}
	
	public static void main(String[] args) {
		new Demo3();// 匿名类，是直接new的
		new Demo3(1);
		new Demo3(1, 2);
	}
}
