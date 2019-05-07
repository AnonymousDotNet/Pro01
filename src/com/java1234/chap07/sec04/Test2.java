package com.java1234.chap07.sec04;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//通过反射获取方法并调用类、方法、操作属性
public class Test2 {
	public static void main(String[] args) {

		Class<?> c = null;
		try {
			c = Class.forName("com.java1234.chap07.sec04.Student");
			System.out.println(c.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Object obj = c.newInstance();
			Field nameField = c.getDeclaredField("name");
			nameField.setAccessible(true);//设置可以访问包括私有属性，如果不设置是不可以直接访问的
			nameField.set(obj, "阿D");
			System.out.println("name:" + nameField.get(obj));
			;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
