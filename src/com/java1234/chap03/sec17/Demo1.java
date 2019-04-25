package com.java1234.chap03.sec17;

//装箱拆箱示例
public class Demo1 {
	public static void main(String[] args) {
		int a = 1;
		Integer i = new Integer(a);// 装箱，基本类型转类类型
		int b = i.intValue();// 拆箱 ，类类型转基本类型

		System.out.println("a=" + a);
		System.out.println("i=" + i);
		System.out.println("b=" + b);
	}
}
