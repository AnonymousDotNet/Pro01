package com.java1234.chap03.sec03;

class SanWei {
	int b;// ��Χ
	int w;// ��Χ
	int h;// ��Χ
}

//���ô��ݺ�ֵ����ʾ��
public class Person3 {
	void speak(int age, SanWei sanwei) {
		System.out.println("�ҽ���" + age + "����");
		System.out.println("�ҵ���Χ�ǣ�" + sanwei.b + "," + sanwei.w + "," + sanwei.h);
		age = 24;
		System.out.println("������age" + age);
		sanwei.b = 80;
	}

	public static void main(String[] args) {
		Person3 zhangsan = new Person3();
		int age = 23;
		SanWei sanwei = new SanWei();
		sanwei.b = 90;
		sanwei.w = 60;
		sanwei.h = 30;
		zhangsan.speak(age, sanwei);
		System.out.println(age);
		System.out.println("���õط�����Χ" + sanwei.b);
	}
}
