package com.java1234.chap06.sec01;

//不使用泛型的示例一：
public class C1 {
	private Integer a;

	/**
	 * 构造方法
	 * 
	 * @param a
	 */
	public C1(Integer a) {
		super();
		this.a = a;
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public void print() {
		System.out.println("a的类型是：" + a.getClass().getName());
	}
}
