package com.java1234.chap07.sec04;

//作业：通过反射获取父类
public class ZuoYeTest2 {
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("com.java1234.chap07.sec04.ZuoYeStudent");
			System.out.println(c.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Class<?> s = c.getSuperclass();// 获取父类的方法
		System.out.println(s);
	}
}
