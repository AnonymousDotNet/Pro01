package com.java1234.chap02;

public class Demo14 {
	public static void main(String[] args) {
		// 控制台输出1到10
		// while循环语句；先判断再循环
		int i = 1;
		while (i < 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("---------------------");

		// do ```while循环语句；至少先循环一次再进行判断
		int j = 1;
		do {
			System.out.print(j + " ");
			j++;
		} while (j <= 10);

		System.out.println("----------------------");
		
		// for 循环
		for (int k = 1; k <= 10; k++) {
			System.out.print(k + " ");
		}
	}
}
