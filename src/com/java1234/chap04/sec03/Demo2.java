package com.java1234.chap04.sec03;

//使用Throws的另一种方式，传参示例
public class Demo2 {
	public static void testThrow(int a) throws Exception {
		if (a == 1) {
			// 直接抛出一个异常类
			throw new Exception("有异常");
		}
		System.out.println(a);
	}

	public static void main(String[] args) {
		try {
			testThrow(0);//测试数字：1
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
