package com.java1234.chap06.sec01;

//���͵����룻�Ա�ʾ��
public class Test {
	public static void main(String[] args) {

		/**
		 * //��ʹ�÷��͵�ʾ��һ�����ַ�ʽ�Ļ�ÿ����һ��״̬��Ҫдһ���࣬���ǱȽ��鷳��
		 */
		C1 c1 = new C1(1);
		c1.print();
		int i = c1.getA();
		System.out.println("i=" + i);

		C2 c2 = new C2("Hi");
		c2.print();
		String s = c2.getA();
		System.out.println("s=" + s);

		/**
		 * /��ʹ�÷��͵�ʾ���������ʾ��һ�ķ�������ʹ�ö�̬����ʹ��һ���� ���������ַ�ʽ������ת�����ͱȽ��鷳���������ܵ�����
		 */
		C12 c12 = new C12(1);// ����ת�ͣ���ȫ��
		c12.print();
		int i2 = (Integer) c12.getObject();// ������Ҫǿ������ת��������ת�ͣ�����ȫ�ģ����������Ѿ�֪������Integer���͵�
		System.out.println("i2=" + i2);

		C12 c122 = new C12("���");
		c122.print();
		String s2 = (String) c122.getObject();
		System.out.println("s2=" + s2);

		/**
		 * ʹ�÷��͵ķ�ʽ��������������⣬�����Ͳ���Ҫ�������࣬Ҳ����������ת���ͷǳ��������
		 */
		CC<Integer> cc = new CC<Integer>(1);
		cc.print();
		int i3 = cc.getT();
		System.out.println("i3=" + i3);

		CC<String> cc2 = new CC<String>("���Ƿ��ͣ��ü�");
		cc2.print();
		String s3 = cc2.getT();
		System.out.println("s3=" + s3);
	}
}
