package com.java1234.chap03.sec14;

//使用Object示例；调用Object类的ToString方法示例
public class People {
	private String name;

	/**
	 * 有参构造方法
	 * 
	 * @param name
	 */
	public People(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		String name = ((People) obj).getName();
		return this.name == name;
	}

	/**
	 * 调用父类的实现，进行重写
	 */
	@Override
	public String toString() {
		return this.getName();
	}

	public static void main(String[] args) {
		People p1 = new People("张三");
		People p2 = new People("张三");
		People p3 = new People("李四");
		System.out.println("p1.equals(p2):" + p1.equals(p2));
		System.out.println("p1.equals(p3):" + p1.equals(p3));

		/*
		 * System.out.println(p1);
		 *//**
			 * 上面的输出语句本质上是调用了toString方法，所以这两句是等同的
			 *//*
				 * System.out.println(p1.toString());
				 */
	}
}
