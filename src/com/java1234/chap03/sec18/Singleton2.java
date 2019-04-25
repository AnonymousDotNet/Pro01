package com.java1234.chap03.sec18;

public class Singleton2 {
	/**
	 * ���췽��˽��
	 */
	private Singleton2() {

	}

	private static Singleton2 single = null;// ������ǵ���ʹ��ʱ��ʵ����

	/**
	 * ��ȡʵ���� ʹ��synchronized����Ϊ����ǳ��ֲ�������ʱ����������⣬����synchronized�ܱ�֤ÿ�ν�ȥ��һ���̵߳�Ч��
	 * 
	 * @return
	 */
	public synchronized static Singleton2 getInstance() {
		if (single == null) {
			System.out.println("��һ�ε���");
			single = new Singleton2();
		}
		return single;
	}
}
