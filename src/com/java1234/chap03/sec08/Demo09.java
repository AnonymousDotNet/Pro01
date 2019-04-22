package com.java1234.chap03.sec08;

//作业
//字符串反转，"abcdefg"通过变成得到一个新的字符串"gfedcba";
//要求不准用String的方法，只能用循环的遍历
public class Demo09 {
	public static void main(String[] args) {

		/**
		 * 不使用string方法的方式，这里只是使用了生成副本的方法，应该不算使用string下方法捷径吧
		 */
		String str = "abcdefg";
		char[] strs = str.toCharArray();// 生成str的新的副本
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
