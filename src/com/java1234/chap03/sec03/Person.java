package com.java1234.chap03.sec03;

//�������Ļ�������
public class Person {
	int age;
	String name;
	public void speak() {
		System.out.println("�ҽ�"+name+" �ҽ���"+age);
	}
public static void main(String[] args) {
	//����һ��Person��Ķ�������
	Person zhangsan;
	//ʵ��������
	zhangsan=new Person();
	zhangsan.name="����";//������name���Ը�ֵ
	zhangsan.age=20;//������age���Ը�ֵ
	zhangsan.speak();//����sperk����
}
}
