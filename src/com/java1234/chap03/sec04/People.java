package com.java1234.chap03.sec04;

//构造方法和this示例
public class People {
	// 定义属性，并实例化对象
	private String name;
	private int age;

	/**
	 * 默认的无参构造方法
	 * 构造方法不写访问权限时是默认为“包”访问权限的，也就是只能包内访问
	 */
	public People() {
		System.out.println("默认构造方法");
	}

	/**
	 * 有参的构造方法
	 * @param name2
	 * @param age2
	 */
	People(String name2, int age2) {
		System.out.println("调用的是有参数的构造方法");
		this.name = name2;
		this.age = age2;
	}

	public void say() {
		System.out.println("我叫：" + name + ",我今年：" + age);
	}

	public static void main(String[] args) {
		People people = new People();
		People people2 = new People("张三", 20);
		people.say();
	}
}
