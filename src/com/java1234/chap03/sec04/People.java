package com.java1234.chap03.sec04;

//���췽����thisʾ��
public class People {
	// �������ԣ���ʵ��������
	private String name;
	private int age;

	/**
	 * Ĭ�ϵ��޲ι��췽��
	 * ���췽����д����Ȩ��ʱ��Ĭ��Ϊ����������Ȩ�޵ģ�Ҳ����ֻ�ܰ��ڷ���
	 */
	public People() {
		System.out.println("Ĭ�Ϲ��췽��");
	}

	/**
	 * �вεĹ��췽��
	 * @param name2
	 * @param age2
	 */
	People(String name2, int age2) {
		System.out.println("���õ����в����Ĺ��췽��");
		this.name = name2;
		this.age = age2;
	}

	public void say() {
		System.out.println("�ҽУ�" + name + ",�ҽ��꣺" + age);
	}

	public static void main(String[] args) {
		People people = new People();
		People people2 = new People("����", 20);
		people.say();
	}
}
