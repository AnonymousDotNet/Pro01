package com.java1234.chap03.sec18;

//��ҵ��ʵ��һ���࣬������ʾͼ�Σ����巽�������Էֱ��������κ�Բ�ε�������ܳ���Ҫ���õ�����˼ά��
//˼·�������ҵ˵Ҫ�õ�����˼ά�����Կ϶�Ҫ�����һЩ�����Ķ���������ľ��κ�Բ�� �ܳ����������������ܳ����������ǿ����ýӿ���ʵ�֣�
public class Test2 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 3.5f);
		System.out.println("���ε������" + r.mianji());
		System.out.println("���ε��ܳ���" + r.zhouChang());

		Circular c = new Circular(1.5f);
		System.out.println("Բ�ε������" + c.mianji());
		System.out.println("Բ�ε��ܳ���" + c.mianji());
	}
}
