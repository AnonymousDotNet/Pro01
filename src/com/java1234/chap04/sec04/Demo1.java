package com.java1234.chap04.sec04;

//Exception��RuntimeException������ʹ��ʾ��
public class Demo1 {
	/**
	 * ����ʱ�쳣������ʱ����飬���Բ�ʹ��try catch����
	 * 
	 * @throws Exception
	 */
	public static void testRuntimeException() throws RuntimeException {
		throw new RuntimeException("RuntimeException�쳣");
	}

	/**
	 * Exception�쳣������ʱ��飬����ʹ��try catch����
	 * 
	 * @throws Exception
	 */
	public static void testException() throws Exception {
		throw new Exception("Exception�쳣");
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
