package com.java1234.chap03.sec08;

//��ҵ
//�ַ�����ת��"abcdefg"ͨ����ɵõ�һ���µ��ַ���"gfedcba";
//Ҫ��׼��String�ķ�����ֻ����ѭ���ı���
public class Demo09 {
	public static void main(String[] args) {

		/**
		 * ��ʹ��string�����ķ�ʽ������ֻ��ʹ�������ɸ����ķ�����Ӧ�ò���ʹ��string�·����ݾ���
		 */
		String str = "abcdefg";
		char[] strs = str.toCharArray();// ����str���µĸ���
		System.out.println(strs);
		int i = 0;
		int j = strs.length - 1;
		while (i <= j) {
			char temp = strs[i];
			strs[j] = temp;
			i++;
			j--;
		}
		System.out.println(strs);
	}
}
