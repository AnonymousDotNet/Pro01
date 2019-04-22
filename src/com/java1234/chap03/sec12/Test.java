package com.java1234.chap03.sec12;

//使用实现接口中的抽象方法,接口可以实现多继承
//继承了C类并实现AB接口
public class Test extends C implements A, B {

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("a方法");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("b方法");
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
