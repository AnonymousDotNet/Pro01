package com.java1234.chap02;

import java.util.*;

//����̨�������������string �����жϲ�����
public class Demo13 {
	public static void main(String[] args) {
		System.out.println("����������");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();// �ַ�������
		scanner.close();
		switch (str) {
		case "����": {
			System.out.println("�������������");
			break;
		}
		case "����": {
			System.out.println("����������ģ�");
			break;
		}
		case "С��": {
			System.out.println("�������С�壺");
			break;
		}
		default:{
			System.out.println("���������������ַ�");
			break;
		}
		}
	}
}
