package com.java1234.chap03.sec08;

//String的使用
public class Demo02 {

	public static void main(String[] args) {
		/**
		 * 这里考的是同样的String字符，所指向堆的值位置是不同的
		 */
		String name1 = "张三";// 比如，值存放在堆1中
		String name2 = new String("张三");// 比如，值存放在堆2中
		String name3 = name2;// 比如，值存放在堆2中

		// ==比较的是引用
		System.out.println("name1==name2:" + (name1 == name2));
		System.out.println("name1==name3:" + (name1 == name3));
		System.out.println("name2==name3:" + (name2 == name3));

		// equals比较的是具体的内容
		System.out.println("name1.equals(name2):" + (name1.equals(name2)));
		System.out.println("name1.equals(name3):" + (name1.equals(name3)));
		System.out.println("name2.equals(name3):" + (name2.equals(name3)));
	}
}
