package com.java1234.chap03.sec03;

public class Demo01 {
	int add(int a, int b) {
		System.out.println("方法一：");
		return a + b;
	}

	/**
	 * 方法的重载，参数个数不一样
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	int add(int a, int b, int c) {
		System.out.println("方法二：");
		return a + b + c;
	}
	
	/**
	 * 方法的重载，类型和个数不一样
	 * @param a
	 * @param b
	 * @return
	 */
	int add(int a,String b) {
		System.out.println("方法三：");
		return a+Integer.parseInt(b);
	}
	
	/**
	 * 这里需要注意的一点
	 * 同样的方式，如果返回类型不一样，方法类型、参数一样，是不算方法重载的，提示方法重名
	 * @param a
	 * @param b
	 * @return
	 */
	/*
	 * long add(int a,int b) { return a+b; }
	 */

	public static void main(String[] args) {
		Demo01 demo = new Demo01();
		System.out.println(demo.add(1, 2));
		System.out.println(demo.add(1, 2, 3));
		System.out.println(demo.add(1, "100"));
		
		
	}
}
