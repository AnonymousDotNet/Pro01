package com.java1234.chap03.sec09;

//继承的基本用法示例
public class Dog extends Animal {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("Pick");
		dog.setAge(1);
		dog.say();
	}
}
