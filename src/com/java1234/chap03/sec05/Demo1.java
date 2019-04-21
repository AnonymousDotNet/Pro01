package com.java1234.chap03.sec05;

public class Demo1 {

	//如果是私有的级别如何访问呢？只能通过公有的方法接口来进行访问
	//示例如下：
	private int a;

	/**
	 * 自动生成get set方法alt+shift+s 弹出菜单 选择 generate get setter
	 * @return
	 */
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	
	//手动的方式写get set
	/*
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}*/
}
