package com.java1234.chap03.sec11;

//抽象类和抽象方法的使用示例，abstract是声明一个抽象类
public abstract class People {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void say() {
		System.out.println("我的姓名是：" + this.getName());
	}

	/**
	 * 定义一个抽象方法，让子类具体实现
	 */
	public abstract void profession();
}
