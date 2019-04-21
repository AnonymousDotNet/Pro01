package com.java1234.chap02;

//作业
//打印九九乘法表，使用for嵌套循环
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
