package com.java1234.chap03.sec09;

/**
 * ��д�����say����ʾ������������ø���ķ�����ʹ��super�����м̳е��÷�
 * 
 * @author Murphy
 *
 */
public class Cat extends Animal {

	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Cat() {
		super();
		System.out.println("�����޲εĹ��캯������");
	}

	public Cat(String name, int age, String address) {
		super(name, age);
		this.address = address;
		System.out.println("�����вεĹ��캯������");
	}

	public void say() {
		System.out.println("����һֻè���ҽУ�" + this.getName() + "���ҵ������ǣ�" + this.getAge() + "�������ԣ�" + this.getAddress());
	}

	public static void main(String[] args) {
		Cat cat = new Cat("Mini", 2, "����");// ͨ�����췽��ʵ����
		/*
		 * cat.setName("Mini"); cat.setAge(2);
		 */
		cat.say();
	}

}
