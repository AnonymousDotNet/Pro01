package com.java1234.chap05.sec04;

import java.util.Arrays;

//Arrays��ʹ��ʾ��
public class TestArrays {
	public static void main(String[] args) {
		int arr[] = { 1, 7, 3, 8, 2 };
		System.out.println(arr);
		System.out.println("���ַ�����ʽ������飺" + Arrays.toString(arr));

		// ����������
		Arrays.sort(arr);
		System.out.println("���������飺" + Arrays.toString(arr));

		// ���������е�8������ֵ�λ����Ϣ�����鲻���ľ��Ǹ�����-6
		System.out.println(Arrays.binarySearch(arr, 8));

		// ��ָ��������䵽������
		Arrays.fill(arr, 0);
		System.out.println("����������ַ�����" + Arrays.toString(arr));
	}
}
