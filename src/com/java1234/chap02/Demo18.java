package com.java1234.chap02;

//���ݷ�����,��С����
public class Demo18 {
	public static void main(String[] args) {
		int arr[] = { 1, 21, 0, -12, -3 };
		int temp;
		// ѭ������ n-1��
		for (int i = 0; i < arr.length - 1; i++) {
			// �Ƚϴ���n-1-i
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// ����ǰ���һ������Լ�����һ�������򽻻�����
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
