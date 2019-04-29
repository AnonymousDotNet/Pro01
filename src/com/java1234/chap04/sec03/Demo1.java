package com.java1234.chap04.sec03;

//throws表示当前方法不处理异常，而是交给方法的调用者处理异常
//throw 表示直接抛出一个异常
public class Demo1 {
	/**
	 * 使用throws示例
	 * 
	 * @throws NumberFormatException
	 */
	public static void testThrows() throws NumberFormatException {
		String str = "123a";
		int a = Integer.parseInt(str);
		System.out.println(a);
	}

	public static void main(String[] args) {
		try {
			testThrows();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("我们在这里处理异常");
		}
		System.out.println("I'm here");
	}
}
