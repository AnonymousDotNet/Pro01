package com.java1234.chap03.sec06;

//���ú������ⲿ��ṹ����ʱ���������е��ڲ���ķ�ʽ
public class TestInner {
	public static void main(String[] args) {
		Outer outer = new Outer();// �������ⲿ��
		Outer.Inner inner = outer.new Inner();// �ٴ��ⲿ������ڲ���
		inner.show();
	}
}
