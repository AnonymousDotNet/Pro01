package com.java1234.chap03.sec06;

//���ⲿ���ʾ��
/**
 * �ⲿ��
 * 
 * @author Murphy
 *
 */
public class Outer {
	private int a = 1;

	/**
	 * �ڲ���
	 * 
	 * @author Murphy
	 *
	 */
	class Inner {
		public void show() {
			System.out.println(a);// ���Է����ʹ���ⲿ�������
		}
	}

	public void show() {
		Inner inner = new Inner();
		inner.show();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.show();
	}
}
