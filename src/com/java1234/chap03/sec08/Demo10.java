package com.java1234.chap03.sec08;

//��ҵ
//���ַ���"1��3��5��7��9"ת�������飬����Ԫ��������Ԫ��1,3,5,7,9��
//��׼��string����ķ���
public class Demo10 {
	public static void main(String[] args) {
		String str = "1,3,5,7,9";

		/**
		 * ѭ�������ķ�ʽ
		 */
		String[] a = str.split(",");// һ���Ų���ַ���
		int[] result = new int[a.length];// int��������
		for (int i = 0; i < a.length; i++) {// ѭ����ȡ�������ֲ�д�������õ�������
			// sum += Integer.parseInt(a[i]);
			result[i] = Integer.parseInt(a[i]);// ��������
		}
		System.out.println("�����������£�");
		for (int num : result) {
			System.out.print(num+" ");
		}
		
	}
}
