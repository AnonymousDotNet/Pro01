package com.java1234.chap04.sec05;

//自定义异常测试示例
public class TestCustomException {
	
	public static void test() throws CustomException {
		throw new CustomException("自定义异常");
	}

	public static void main(String[] args) {
		try {
			test();
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
}
