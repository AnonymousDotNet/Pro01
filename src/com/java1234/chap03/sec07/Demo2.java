package com.java1234.chap03.sec07;

//构造块示例，是写在类中的
public class Demo2 {

	/**
	 * 构造块，实际开发中是有用到的，可以写一些通用的公共代码块逻辑
	 */
	{
		System.out.println("通用构造块");
	}

	/**
	 * 构造方法一
	 */
	public Demo2() {
		System.out.println("构造方法一");
	}

	/**
	 * 构造方法二
	 */
	public Demo2(int i) {
		System.out.println("构造方法二");
	}

	/**
	 * 构造方法三
	 */
	public Demo2(int i, int j) {
		System.out.println("构造方法三");
	}

	public static void main(String[] args) {
		new Demo2();// 匿名类，是直接new的
		new Demo2(1);
		new Demo2(1, 2);
	}
}
