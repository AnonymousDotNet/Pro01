package com.java1234.chap07.sec04;

import java.lang.reflect.Method;

//ͨ�������ȡ��������������
public class Test1 {
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
			Method m1 = obj.getClass().getMethod("setName", String.class);// ͨ�������ȡ����
			m1.invoke(obj, "��D");// ���÷���

			Method m2 = obj.getClass().getMethod("getName");
			String name = (String) m2.invoke(obj);
			System.out.println("name=" + name);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
