package com.java1234.chap02;


//�����ʼ�����������
public class Demo17 {
	public static void main(String[] args) {
		/*
		 * //�������������ַ�ʽ����һ�� int []arr; //�ڶ��֣� int arr2[];
		 */

		// �����ʼ�����Ƕ������õ����鸳ֵ
		// ����ʼ���ַ־�̬��ʼ���Ͷ�̬��ʼ��
		
		/*
		// ��̬��ʼ����
		int arr[] = new int[] { 1, 2, 3 };

		// ��ͨ�����������ʽ
		//for��ʽ
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println("----------------------");
		
		//foreach��ʽ
		for(int j:arr) {
			System.out.println(j);
		}*/
		
		//��̬��ʼ����ʽ
		int arr[] =new int[3];
		//��θ�ֵ
		arr[0]=1;
		arr[1]=3;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
