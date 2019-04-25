package com.java1234.chap03.sec17;

//包装类的使用示例
public class Demo3 {
	public static void main(String[] args) {
		String a = "3";
		String b = "5";
		int m = Integer.valueOf(a);// 调用Integer类的valueof方法把字符串转成int类型
		int n = Integer.valueOf(b);
		System.out.println("a+b=" + (n + m));
	}
}
