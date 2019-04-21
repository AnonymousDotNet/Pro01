package com.java1234.chap03.sec03;

//面向对象的基本概念
public class Person {
	int age;
	String name;
	public void speak() {
		System.out.println("我叫"+name+" 我今年"+age);
	}
public static void main(String[] args) {
	//定义一个Person类的对象张三
	Person zhangsan;
	//实例化对象
	zhangsan=new Person();
	zhangsan.name="张三";//给对象name属性赋值
	zhangsan.age=20;//给对象age属性赋值
	zhangsan.speak();//调用sperk方法
}
}
