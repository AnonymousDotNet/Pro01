package com.java1234.chap03.sec06;

//调用含有内外部类结构的类时，调用其中的内部类的方式
public class TestInner {
	public static void main(String[] args) {
		Outer outer = new Outer();// 先声明外部类
		Outer.Inner inner = outer.new Inner();// 再从外部类调用内部类
		inner.show();
	}
}
