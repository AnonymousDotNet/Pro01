package com.java1234.chap08.sec03;

import java.util.LinkedList;

//���ϵı�����Foreach
public class TestForeach {
	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();
		list.add(new Student("����", 10));
		list.add(new Student("����", 11));
		list.add(new Student("����", 12));

		for (Student s : list) {
			System.out.println(s);
		}
	}
}
