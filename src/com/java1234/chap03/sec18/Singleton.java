package com.java1234.chap03.sec18;

public class Singleton {
	/**
	 * ���췽��˽��
	 */
	private Singleton() {

	}

	private static final Singleton single = new Singleton();

	/**
	 * ��ȡʵ��
	 * 
	 * @return
	 */
	public static Singleton getInstance() {
		return single;
	}
}
