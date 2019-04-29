package com.java1234.chap04.sec02;

//使用Finally处理异常，作用就是try catch之后的最终处理
public class Demo1 {
	public static void testFinally() {
		String str = "123a";
		try {
			int a = Integer.parseInt(str);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("Exception");
			return;
		} finally {
			System.out.print("Exception End");
		}
		System.out.print("Exception a");
	}

	public static void main(String[] args) {
		testFinally();
	}
}
