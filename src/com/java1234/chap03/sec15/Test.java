package com.java1234.chap03.sec15;

//instanceof��ʹ�ã������ж϶����Ƿ�����ĳһ���������ʾ��
public class Test {

	public static void doSomeThing(Animal animal) {
		animal.say();
		if (animal instanceof Cat) {
			((Cat) animal).f2();
		} else if (animal instanceof Cat) {
			((Cat) animal).f2();
		}
	}

	public static void main(String[] args) {
		Animal dog = new Dog();
		System.out.println("dog�����Ƿ�����Animal�ࣺ" + (dog instanceof Animal));
		System.out.println("dog�����Ƿ�����Dog�ࣺ" + (dog instanceof Animal));
		System.out.println("dog�����Ƿ�����Dog�ࣺ" + (dog instanceof Cat));

		doSomeThing(new Dog());
		doSomeThing(new Cat());
	}
}
