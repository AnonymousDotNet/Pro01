package com.java1234.chap03.sec13;

//��ʵ�ʿ����д󲿷���ʹ�ýӿڵķ�ʽ��ʵ�ֶ�̬�ģ�����ʾ��
public class Test2 {
public static void main(String[] args) {
	People p1=new Student();//���������ָ������ľ���ʵ��
	p1.say();
	
	p1=new Teacher();//Ҳ��������д
	p1.say();
}
}
