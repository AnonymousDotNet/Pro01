package com.java1234.chap03.sec03;

//��ͨ�����;�̬�����ĵ���ʾ��
public class Demo02 {
	void fun1() {
		System.out.println("����һ����ͨ����");
	}

	static void fun2() {
		System.out.println("����һ����̬����");
	}

	public static void main(String[] args) {
		Demo02 demo = new Demo02();
		//������ͨ���������󡢷���
		demo.fun1();
		
		//���þ�̬���������͡�����
		 Demo02.fun2();
		demo.fun2();
	}
}
