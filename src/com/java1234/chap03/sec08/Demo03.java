package com.java1234.chap03.sec08;

//String 声明一个对象并实例化时验证值存在堆中的指向是否相同
public class Demo03 {
	public static void main(String[] args) {
		String name1 = "张三";// name1和name2的值在堆中都是指向同一个位置的
		String name2 = "张三";// name1和name2的值在堆中都是指向同一个位置的
		String name3 = new String("张三");// 这里的name3是重新在堆中创建一个存放空间的
		String name4 = new String("张三");// 这里的name4是重新在堆中创建一个存放空间的

		System.out.println("name1==name2:" + (name1 == name2));
		System.out.println("name1==name3:" + (name1 == name3));// 这里是不等的
		System.out.println("name3==name4:" + (name3 == name4));// 这里是不等的
	}
}
