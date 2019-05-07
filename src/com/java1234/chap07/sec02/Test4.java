package com.java1234.chap07.sec02;

//����ʾ����ͨ�������·����ȡclass������ͨ��class�������newInstance��������ȡʵ�����õ�ʵ����������������ôһ������
public class Test4 {
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("com.java1234.chap07.sec01.Student");
			System.out.println(c.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Student s = null;
		try {
			s = (Student) c.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		s.setName("��D");
		s.setAge(18);
		System.out.println(s);
	}
}
