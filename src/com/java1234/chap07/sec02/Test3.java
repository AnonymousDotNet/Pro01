package com.java1234.chap07.sec02;

import java.lang.reflect.Constructor;

//反射示例:使用Constructor类来提供一个类的单个构造函数信息和访问示例
public class Test3 {
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("com.java1234.chap07.sec01.Student");
			System.out.println(c.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Student s = null;

		/**
		 * 添加此方法，提供了一个类的单个构造函数的信息和访问，如果不加这个方法漠然访问的是无参的构造方法就会报异常
		 */
		Constructor<?>[] cons = c.getConstructors();
		try {
			s = (Student) cons[0].newInstance("阿D", 28);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);
	}
}
