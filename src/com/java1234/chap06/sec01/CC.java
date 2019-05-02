package com.java1234.chap06.sec01;

//使用泛型的方式示例
public class CC<T> {
	private T t;

	/**
	 * 构造方法
	 * 
	 * @param t
	 */
	public CC(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public void print() {
		System.out.println("t的类型是：" + t.getClass().getName());
		;
	}
}
