package com.java1234.chap03.sec12;

//ʵ�ֽӿڵĶ�̳�ʾ��
public class Test2 extends C implements D {

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

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("d����");
	}

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.a();
		t.b();
		t.c();
		t.d();
		System.out.println(Test2.TITLE);
		System.out.println(Test2.TITLE2);
	}

}
