package com.java1234.chap02;

//起泡法排序,从小到大
public class Demo18 {
	public static void main(String[] args) {
		int arr[] = { 1, 21, 0, -12, -3 };
		int temp;
		// 循环次数 n-1次
		for (int i = 0; i < arr.length - 1; i++) {
			// 比较次数n-1-i
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// 加入前面的一个数大约后面的一个数，则交换数据
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
