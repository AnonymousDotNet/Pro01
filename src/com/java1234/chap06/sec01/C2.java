package com.java1234.chap06.sec01;

//��ʹ�÷��͵�ʾ��һ��
public class C2 {
	private String a;

	/**
	 * ���췽��
	 * @param a
	 */
	public C2(String a) {
		super();
		this.a = a;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public void print() {
		System.out.println("a�������ǣ�" + a.getClass().getName());
		;
	}
}
