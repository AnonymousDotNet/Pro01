package com.java1234.chap02;

//��ҵ
//��ӡ�žų˷���ʹ��forǶ��ѭ��
public class Demo16 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + '\t');
			}
			System.out.println();
		}
	}
}
