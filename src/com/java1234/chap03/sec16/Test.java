package com.java1234.chap03.sec16;

//�����������ڲ����ʹ��ʾ��
public class Test {
	public void test(A a) {
		a.say();
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.test(new B());

		t.test(new A() {

			@Override
			public void say() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ��࣬һ����ʹ��");
			}

		});
	}
}
