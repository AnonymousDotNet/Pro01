package com.java1234.chap02;

public class Demo14 {
	public static void main(String[] args) {
		// ����̨���1��10
		// whileѭ����䣻���ж���ѭ��
		int i = 1;
		while (i < 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("---------------------");

		// do ```whileѭ����䣻������ѭ��һ���ٽ����ж�
		int j = 1;
		do {
			System.out.print(j + " ");
			j++;
		} while (j <= 10);

		System.out.println("----------------------");
		
		// for ѭ��
		for (int k = 1; k <= 10; k++) {
			System.out.print(k + " ");
		}
	}
}
