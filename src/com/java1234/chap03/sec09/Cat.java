package com.java1234.chap03.sec09;

/**
 * 重写父类的say方法示例；及子类调用父类的方法，使用super；还有继承的用法
 * 
 * @author Murphy
 *
 */
public class Cat extends Animal {

	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Cat() {
		super();
		System.out.println("子类无参的构造函数方法");
	}

	public Cat(String name, int age, String address) {
		super(name, age);
		this.address = address;
		System.out.println("子类有参的构造函数方法");
	}

	public void say() {
		System.out.println("我是一只猫，我叫：" + this.getName() + "，我的年龄是：" + this.getAge() + "，我来自：" + this.getAddress());
	}

	public static void main(String[] args) {
		Cat cat = new Cat("Mini", 2, "火星");// 通过构造方法实例化
		/*
		 * cat.setName("Mini"); cat.setAge(2);
		 */
		cat.say();
	}

}
