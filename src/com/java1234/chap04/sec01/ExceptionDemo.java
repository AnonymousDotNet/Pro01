package com.java1234.chap04.sec01;

public class ExceptionDemo {
	public static void main(String[] args) {
		String str = "123a";
		/**
		 * �����try catch���зֲ㼶�ģ��������ƴ�С����ġ� ֻ����һ���һ�����С��һ���쳣�������С���쳣������ľͻ���ֱ��벻ͨ�������
		 */
		try {
			int a = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("����ִ��");
	}
}
