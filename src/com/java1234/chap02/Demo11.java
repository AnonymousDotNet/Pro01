package com.java1234.chap02;

//�����ж����
public class Demo11 {
	public static void main(String[] args) {
		int a = -1;

		if (a > 0) {
			System.out.println(a + "������");
		} else {
			System.out.println(a + "�Ǹ���");
		}

		if (a > 0) {
			System.out.println(a + "������");
		} else if (a < 0) {
			System.out.println(a + "�Ǹ���");
		} else if (a == 0) {
			System.out.println(a + "��0");
		}
	}
}
