package com.java1234.chap05.sec02;

//String与StringBuffer的对比区别
//StringBuffer的使用
public class TestStringBuffer {
	public static void main(String[] args) {
		/**
		 * StringBuffer重新修改赋值之后是在原来的堆地址上修改的
		 */
		StringBuffer sb = new StringBuffer("123");
		sb.append("abc");
		System.out.println(sb.toString());
	}
}
