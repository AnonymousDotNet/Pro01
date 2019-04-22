package com.java1234.chap03.sec08;

//作业
//将字符串"1，3，5，7，9"转换成数组，数组元素是整数元素1,3,5,7,9；
//不准用string里面的方法
public class Demo10 {
	public static void main(String[] args) {
		String str = "1,3,5,7,9";

		/**
		 * 循环遍历的方式
		 */
		String[] a = str.split(",");// 一逗号拆分字符串
		int[] result = new int[a.length];// int类型数组
		for (int i = 0; i < a.length; i++) {// 循环获取单个数字并写入声明好的数组中
			// sum += Integer.parseInt(a[i]);
			result[i] = Integer.parseInt(a[i]);// 整数数组
		}
		System.out.println("数组数字如下：");
		for (int num : result) {
			System.out.print(num+" ");
		}
		
	}
}
