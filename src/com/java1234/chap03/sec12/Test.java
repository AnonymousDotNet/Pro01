package com.java1234.chap03.sec12;

//ʹ��ʵ�ֽӿ��еĳ��󷽷�,�ӿڿ���ʵ�ֶ�̳�
//�̳���C�ಢʵ��AB�ӿ�
public class Test extends C implements A, B {

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("a����");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("b����");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.a();
		t.b();
		t.c();
		System.out.println(Test.TITLE);
		System.out.println(Test.TITLE2);
	}

}
