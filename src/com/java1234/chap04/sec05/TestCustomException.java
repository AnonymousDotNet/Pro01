package com.java1234.chap04.sec05;

//�Զ����쳣����ʾ��
public class TestCustomException {
	
	public static void test() throws CustomException {
		throw new CustomException("�Զ����쳣");
	}

	public static void main(String[] args) {
		try {
			test();
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
}
