package com.java1234.chap03.sec13;

//չʾ��̬��ʾ�������Զ��ʵ�ַ�ʽ
public class Test {
	public static void main(String[] args) {
		/**
		 * ��������ָ��Dog����ľ���ʵ�֣�����������ȵ���Dog����� �ø������������෽��Ҳ�ǿ��Եģ����Ƿ�ʽһ
		 */
		Animal animal = new Dog();
		animal.say();

		/**
		 * ����������������ʵ�������ã����Ƿ�ʽ��
		 */
		Dog dog = new Dog();
		dog.say();

		Cat cat = new Cat();
		cat.say();

		
		/**
		 * ����ת�͵ķ�ʽ����ʽ�� ����ǲ�����ʹ�õģ���Ϊ���Ͳ���ȫ�����׳����쳣����
		 */
		/*
		 * Dog dog=(Dog)animal; dog.say();
		 * 
		 * Cat cat=(Cat)animal; cat.say();
		 */
	}
}
