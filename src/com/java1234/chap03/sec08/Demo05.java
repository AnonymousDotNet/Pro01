package com.java1234.chap03.sec08;

//String类的方法使用
public class Demo05 {
	public static void main(String[] args) {
		String str = "dfadfsfddfd";
		System.out.println("D在字符串中第一次出现的索引位置：" + str.indexOf("f"));
		System.out.println("D在字符串中第一次出现的索引位置：" + str.indexOf("f", 4));
	}
}
