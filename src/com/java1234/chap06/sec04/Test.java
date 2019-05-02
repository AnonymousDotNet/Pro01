package com.java1234.chap06.sec04;

//泛型方法的使用示例
public class Test {
	public static <T> void f(T t) {
		System.out.print("T的类型是=" + t.getClass().getName());
	}

	/**
	 * 泛型方法的使用
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		f("");
		f(1);
		f(11.0f);
		f(new Object());
	}
}
