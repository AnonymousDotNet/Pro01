package com.java1234.chap03.sec18;

//��ҵ���ڶ���������ʵ����
public class Rectangle implements Graphical {

	private float c;// ����
	private float k;// ���

	/**
	 * �����вι��췽��
	 * 
	 * @param c
	 * @param k
	 */
	public Rectangle(float c, float k) {
		// ���ʸ��෽��������
		super();
		this.c = c;
		this.k = k;
	}

	@Override
	public float mianji() {
		// TODO Auto-generated method stub
		return c * k;
	}

	@Override
	public float zhouChang() {
		// TODO Auto-generated method stub
		return 2 * (c + k);
	}

}
