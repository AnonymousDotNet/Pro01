package com.java1234.chap06.sec01;

//不使用泛型的示例二：
public class C12 {
	private Object object;

	/**
	 * 构造方法
	 * 
	 * @param object
	 */
	public C12(Object object) {
		super();
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	
	public void print() {
		System.out.println("object的类型是：" + object.getClass().getName());
		;
	}
}
