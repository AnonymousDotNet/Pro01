package com.java1234.chap03.sec09;

public class Animal {

	/**
	 * 有参的父类构造方法
	 * @param name
	 * @param age
	 */
	public Animal(String name,int age) {
		System.out.println("有参的父类构造方法");
		this.name=name;
	}
	
	/**
	 * 无参父类构造方法
	 */
	public Animal() {
		System.out.println("无参的父类构造方法");
	}
	
	private String name;// 名字
	private int age;// 年龄

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void say() {
		System.out.println("我是一个动物，我叫：" + this.name + "我的年龄是：" + this.age);
	}
}
