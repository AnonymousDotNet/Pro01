package com.java1234.chap07.sec03;

import java.lang.reflect.Field;

//使用Field类中的getDeclaredFields方法获取Student类中的属性结构
public class Test2 {
	public static void main(String[] args) {

		Class<?> c = null;
		try {
			c = Class.forName("com.java1234.chap07.sec03.Student");
			System.out.println(c.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Field fs[] = c.getDeclaredFields();
		for (Field f : fs) {
			System.out.println("属性：" + f);
		}
	}
}
