package com.java1234.chap05.sec02;

//String��StringBuffer�ĶԱ�����
//StringBuffer��ʹ��
public class TestStringBuffer {
	public static void main(String[] args) {
		/**
		 * StringBuffer�����޸ĸ�ֵ֮������ԭ���Ķѵ�ַ���޸ĵ�
		 */
		StringBuffer sb = new StringBuffer("123");
		sb.append("abc");
		System.out.println(sb.toString());
	}
}
