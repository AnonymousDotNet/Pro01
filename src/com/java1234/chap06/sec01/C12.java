package com.java1234.chap06.sec01;

//��ʹ�÷��͵�ʾ������
public class C12 {
	private Object object;

	/**
	 * ���췽��
	 * 
	 * @param object
	 */
	public C12(Object object) {
		super();
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	
	public void print() {
		System.out.println("object�������ǣ�" + object.getClass().getName());
		;
	}
}
