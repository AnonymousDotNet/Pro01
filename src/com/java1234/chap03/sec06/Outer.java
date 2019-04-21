package com.java1234.chap03.sec06;

//内外部类的示例
/**
 * 外部类
 * 
 * @author Murphy
 *
 */
public class Outer {
	private int a = 1;

	/**
	 * 内部类
	 * 
	 * @author Murphy
	 *
	 */
	class Inner {
		public void show() {
			System.out.println(a);// 可以方便的使用外部类的属性
		}
	}

	public void show() {
		Inner inner = new Inner();
		inner.show();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.show();
	}
}
