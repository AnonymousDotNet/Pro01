package com.java1234.chap03.sec07;

//代码块示例，是写在方法中的
public class Demo1 {
	public static void main(String[] args) {
		int a = 1;

		/**
		 * 普通代码块，实际开发中没有多大用出，跟普通的代码执行步骤一样
		 */
		{
			a = 2;
			System.out.println("普通代码块");
		}
		System.out.println("a=" + a);
	}
}
