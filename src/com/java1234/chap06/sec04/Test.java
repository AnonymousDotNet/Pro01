package com.java1234.chap06.sec04;

//���ͷ�����ʹ��ʾ��
public class Test {
	public static <T> void f(T t) {
		System.out.print("T��������=" + t.getClass().getName());
	}

	/**
	 * ���ͷ�����ʹ��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		f("");
		f(1);
		f(11.0f);
		f(new Object());
	}
}
