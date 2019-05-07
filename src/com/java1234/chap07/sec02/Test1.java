package com.java1234.chap07.sec02;

//反射的使用示例
public class Test1 {
	public static void main(String[] args) {
		// Student student = new Student("阿D", Integer.valueOf(18));
		// System.out.println(student.getClass().getName());// 获取class名称

		Student student = new Student("小锋", 18);
		System.out.println(student.getClass().getName());
	}
}
