package com.java1234.chap07.sec02;

//反射的使用示例：获取类、实例
public class Test2 {
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("com.java1234.chap07.sec01.Student");
			System.out.println(c);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
