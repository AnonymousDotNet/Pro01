package com.java1234.chap03.sec18;

//��ҵ����������Բ��ʵ����
public class Circular implements Graphical {

	private float r;// �뾶

	/**
	 * �вι��췽��
	 * 
	 * @param r
	 */
	public Circular(float r) {
		// ���ʸ��෽��������
		super();
		this.r = r;
	}

	@Override
	public float mianji() {
		// TODO Auto-generated method stub
		return (float) (Math.PI * r * r);
	}

	@Override
	public float zhouChang() {
		// TODO Auto-generated method stub
		return (float) (2 * Math.PI * r);
	}

}
