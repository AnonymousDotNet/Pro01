package com.java1234.chap07.sec03;

import java.lang.reflect.Constructor;

//ʹ��Constructor���е�getConstructors������ȡ������ͬ�����Ĺ��췽��
public class Test1 {
	public static void main(String[] args) {
		// Student student = new Student("С��", 18);
		// System.out.println(student.getClass().getName());

		Class<?> c = null;
		try {
			c = Class.forName("com.java1234.chap07.sec03.Student");
			System.out.println(c.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Constructor<?> cons[] = c.getConstructors();
		for (Constructor<?> con : cons) {
			System.out.println("���췽����" + con);
		}
	}
}
