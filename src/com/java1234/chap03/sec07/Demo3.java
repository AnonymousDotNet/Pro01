package com.java1234.chap03.sec07;

//��̬�����ʾ��
public class Demo3 {

	/**
	 * ��̬����飬��̬�������ֻ��ִ��һ�ε�
	 */
	static {
		System.out.println("��̬�����");
	}
	
	/**
	 * �����
	 */
	{
		System.out.println("ͨ�ù����");
	}
	
	/**
	 * ���췽��һ
	 */
	public Demo3() {
		System.out.println("���췽��һ");
	}

	/**
	 * ���췽����
	 */
	public Demo3(int i) {
		System.out.println("���췽����");
	}

	/**
	 * ���췽����
	 */
	public Demo3(int i, int j) {
		System.out.println("���췽����");
	}
	
	public static void main(String[] args) {
		new Demo3();// �����࣬��ֱ��new��
		new Demo3(1);
		new Demo3(1, 2);
	}
}
