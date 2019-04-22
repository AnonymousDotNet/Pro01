package com.java1234.chap03.sec14;

//ʹ��Objectʾ��������Object���ToString����ʾ��
public class People {
	private String name;

	/**
	 * �вι��췽��
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
	 * ���ø����ʵ�֣�������д
	 */
	@Override
	public String toString() {
		return this.getName();
	}

	public static void main(String[] args) {
		People p1 = new People("����");
		People p2 = new People("����");
		People p3 = new People("����");
		System.out.println("p1.equals(p2):" + p1.equals(p2));
		System.out.println("p1.equals(p3):" + p1.equals(p3));

		/*
		 * System.out.println(p1);
		 *//**
			 * ����������䱾�����ǵ�����toString�����������������ǵ�ͬ��
			 *//*
				 * System.out.println(p1.toString());
				 */
	}
}
