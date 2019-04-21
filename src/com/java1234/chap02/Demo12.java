package com.java1234.chap02;

import java.util.*;

//控制台输入输出操作（int 类型判断操作）
public class Demo12 {
	public static void main(String[] args) {
		System.out.println("请输入一个数字：");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		switch (n) {
		case 1: {
			System.out.println("用户输入的是1");
			break;
		}
		case 2: {
			System.out.println("用户输入的是2");
			break;
		}
		case 3: {
			System.out.println("用户输入的是3");
			break;
		}
		default:{
			System.out.println("用户输入的是其他数字");
		}
		}
	}
}
