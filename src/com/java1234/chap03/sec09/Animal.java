package com.java1234.chap03.sec09;

public class Animal {

	/**
	 * �вεĸ��๹�췽��
	 * @param name
	 * @param age
	 */
	public Animal(String name,int age) {
		System.out.println("�вεĸ��๹�췽��");
		this.name=name;
	}
	
	/**
	 * �޲θ��๹�췽��
	 */
	public Animal() {
		System.out.println("�޲εĸ��๹�췽��");
	}
	
	private String name;// ����
	private int age;// ����

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void say() {
		System.out.println("����һ������ҽУ�" + this.name + "�ҵ������ǣ�" + this.age);
	}
}
