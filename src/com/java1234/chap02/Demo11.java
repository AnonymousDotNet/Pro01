package com.java1234.chap02;

//条件判断语句
public class Demo11 {
	public static void main(String[] args) {
		int a = -1;

		if (a > 0) {
			System.out.println(a + "是正数");
		} else {
			System.out.println(a + "是负数");
		}

		if (a > 0) {
			System.out.println(a + "是正数");
		} else if (a < 0) {
			System.out.println(a + "是负数");
		} else if (a == 0) {
			System.out.println(a + "是0");
		}
	}
}
