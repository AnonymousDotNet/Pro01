package com.java1234.chap03.sec17;

//װ�����ʾ��
public class Demo1 {
	public static void main(String[] args) {
		int a = 1;
		Integer i = new Integer(a);// װ�䣬��������ת������
		int b = i.intValue();// ���� ��������ת��������

		System.out.println("a=" + a);
		System.out.println("i=" + i);
		System.out.println("b=" + b);
	}
}
