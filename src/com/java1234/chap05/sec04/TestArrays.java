package com.java1234.chap05.sec04;

import java.util.Arrays;

//Arrays的使用示例
public class TestArrays {
	public static void main(String[] args) {
		int arr[] = { 1, 7, 3, 8, 2 };
		System.out.println(arr);
		System.out.println("以字符串形式输出数组：" + Arrays.toString(arr));

		// 给数组排序
		Arrays.sort(arr);
		System.out.println("排序后的数组：" + Arrays.toString(arr));

		// 搜索数组中的8这个数字的位置信息，而查不到的就是负数，-6
		System.out.println(Arrays.binarySearch(arr, 8));

		// 将指定内容填充到数组中
		Arrays.fill(arr, 0);
		System.out.println("填充后的数组字符串：" + Arrays.toString(arr));
	}
}
