package com.java1234.chap02;

import java.util.*;

//����̨�������������int �����жϲ�����
public class Demo12 {
	public static void main(String[] args) {
		System.out.println("������һ�����֣�");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		switch (n) {
		case 1: {
			System.out.println("�û��������1");
			break;
		}
		case 2: {
			System.out.println("�û��������2");
			break;
		}
		case 3: {
			System.out.println("�û��������3");
			break;
		}
		default:{
			System.out.println("�û����������������");
		}
		}
	}
}
