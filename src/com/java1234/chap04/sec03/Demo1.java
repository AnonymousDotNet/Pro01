package com.java1234.chap04.sec03;

//throws��ʾ��ǰ�����������쳣�����ǽ��������ĵ����ߴ����쳣
//throw ��ʾֱ���׳�һ���쳣
public class Demo1 {
	/**
	 * ʹ��throwsʾ��
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
			System.out.println("���������ﴦ���쳣");
		}
		System.out.println("I'm here");
	}
}
