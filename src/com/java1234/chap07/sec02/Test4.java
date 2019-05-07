package com.java1234.chap07.sec02;

//反射示例：通过包类的路径获取class对象，再通过class对象调用newInstance方法来获取实例，得到实例后可随意操作的这么一个流畅
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

		s.setName("阿D");
		s.setAge(18);
		System.out.println(s);
	}
}
