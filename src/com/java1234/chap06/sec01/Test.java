package com.java1234.chap06.sec01;

//泛型的引入；对比示例
public class Test {
	public static void main(String[] args) {

		/**
		 * //不使用泛型的示例一；这种方式的话每出现一种状态就要写一个类，这是比较麻烦的
		 */
		C1 c1 = new C1(1);
		c1.print();
		int i = c1.getA();
		System.out.println("i=" + i);

		C2 c2 = new C2("Hi");
		c2.print();
		String s = c2.getA();
		System.out.println("s=" + s);

		/**
		 * /不使用泛型的示例二，解决示例一的方法就是使用多态，就使用一个类 ；但是这种方式有类型转换，就比较麻烦且消耗性能的问题
		 */
		C12 c12 = new C12(1);// 向上转型，安全的
		c12.print();
		int i2 = (Integer) c12.getObject();// 这里需要强制类型转换；向下转型，不安全的，但是我们已经知道了是Integer类型的
		System.out.println("i2=" + i2);

		C12 c122 = new C12("你好");
		c122.print();
		String s2 = (String) c122.getObject();
		System.out.println("s2=" + s2);

		/**
		 * 使用泛型的方式解决以上两个问题，这样就不需要定义多个类，也不用做类型转换就非常方便简单了
		 */
		CC<Integer> cc = new CC<Integer>(1);
		cc.print();
		int i3 = cc.getT();
		System.out.println("i3=" + i3);

		CC<String> cc2 = new CC<String>("我是泛型，好简单");
		cc2.print();
		String s3 = cc2.getT();
		System.out.println("s3=" + s3);
	}
}
