package com.java1234.chap09.sec01;

//�����ö��̵߳ķ�ʽ
public class Test01 {
	/*
	 * ������
	 */
	private static void music() {
		for (int i = 0; i < 100; i++) {
			System.out.println("��" + i + "������");
		}
	}

	/*
	 * �Է�
	 */
	private static void eat() {
		for (int i = 0; i < 100; i++) {
			System.out.println("��" + i + "�Է�");
		}
	}

	public static void main(String[] args) {
		music();
		eat();
	}
}
