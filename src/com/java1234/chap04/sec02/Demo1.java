package com.java1234.chap04.sec02;

//ʹ��Finally�����쳣�����þ���try catch֮������մ���
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
