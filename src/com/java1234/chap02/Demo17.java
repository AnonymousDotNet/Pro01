package com.java1234.chap02;


//数组初始化、数组遍历
public class Demo17 {
	public static void main(String[] args) {
		/*
		 * //定义数组有两种方式，第一： int []arr; //第二种： int arr2[];
		 */

		// 数组初始化就是对声明好的数组赋值
		// 而初始化又分静态初始化和动态初始化
		
		/*
		// 静态初始化：
		int arr[] = new int[] { 1, 2, 3 };

		// 普通的数组遍历方式
		//for方式
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println("----------------------");
		
		//foreach方式
		for(int j:arr) {
			System.out.println(j);
		}*/
		
		//动态初始化方式
		int arr[] =new int[3];
		//如何赋值
		arr[0]=1;
		arr[1]=3;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
