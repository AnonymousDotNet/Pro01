package com.java1234.chap05.sec02;

//String与StringBuffer的对比区别
//String的使用
public class TestString {
	public static void main(String[] args) {
		/**
		 * String重新修改赋值之后是重新建立一个在堆中内存地址的，然后str对象在栈中指向最新的堆地址
		 */
		String str = "123";
		str += "abc";
		System.out.println(str);
	}
}
