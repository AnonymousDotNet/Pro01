package com.java1234.chap07.sec03;

import java.lang.reflect.Method;

//ʹ��Method���е�getMethods������ȡStudent���е�˵�з�����������������ķ���
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
			System.out.println("������" + md);
		}
	}
}
