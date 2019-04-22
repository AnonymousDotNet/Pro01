package com.java1234.chap03.sec13;

//展示多态的示例，可以多个实现方式
public class Test {
	public static void main(String[] args) {
		/**
		 * 父类引用指向Dog子类的具体实现，这个方法是先调用Dog里面的 用父类对象调用子类方法也是可以的，这是方式一
		 */
		Animal animal = new Dog();
		animal.say();

		/**
		 * 这是正常我们理解的实例化调用，这是方式二
		 */
		Dog dog = new Dog();
		dog.say();

		Cat cat = new Cat();
		cat.say();

		
		/**
		 * 向下转型的方式，方式三 这个是不建议使用的，因为类型不安全，容易出现异常报错
		 */
		/*
		 * Dog dog=(Dog)animal; dog.say();
		 * 
		 * Cat cat=(Cat)animal; cat.say();
		 */
	}
}
