package com.java1234.chap07.sec03;

import java.lang.reflect.Method;

//使用Method类中的getMethods方法获取Student类中的说有方法，包括结成下来的方法
public class Test3 {
	public static void main(String[] args) {

		Class<?> c = null;
		try {
			c = Class.forName("com.java1234.chap07.sec03.Student");
			System.out.println(c.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Method mds[] = c.getMethods();
		for (Method md : mds) {
			System.out.println("方法：" + md);
		}
	}
}
