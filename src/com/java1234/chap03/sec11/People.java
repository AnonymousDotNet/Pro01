package com.java1234.chap03.sec11;

//������ͳ��󷽷���ʹ��ʾ����abstract������һ��������
public abstract class People {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void say() {
		System.out.println("�ҵ������ǣ�" + this.getName());
	}

	/**
	 * ����һ�����󷽷������������ʵ��
	 */
	public abstract void profession();
}
