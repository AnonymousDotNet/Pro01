package com.java1234.chap07.sec04;

//��ҵ��ͨ�������ȡ����ʵ�ֵ����нӿ�
public class ZuoYeTest1 {
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("com.java1234.chap07.sec04.ZuoYeStudent");
			System.out.println(c.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Class<?>[] ifs = c.getInterfaces();// ��ȡ����ʵ�ֵ����нӿ�
		for (Class<?> i : ifs) {
			System.out.println(i);
		}
	}
}
