package com.java1234.chap04.sec04;

//Exception和RuntimeException的区别使用示例
public class Demo1 {
	/**
	 * 运行时异常，编译时不检查，可以不使用try catch捕获
	 * 
	 * @throws Exception
	 */
	public static void testRuntimeException() throws RuntimeException {
		throw new RuntimeException("RuntimeException异常");
	}

	/**
	 * Exception异常，编译时检查，必须使用try catch捕获
	 * 
	 * @throws Exception
	 */
	public static void testException() throws Exception {
		throw new Exception("Exception异常");
	}

	public static void main(String[] args) {

		try {
			testException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testRuntimeException();
	}
}
