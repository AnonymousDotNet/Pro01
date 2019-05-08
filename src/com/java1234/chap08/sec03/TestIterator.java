package com.java1234.chap08.sec03;

import java.util.Iterator;
import java.util.LinkedList;

//���ϵı���:iterator ����
public class TestIterator {
	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();
		list.add(new Student("����", 10));
		list.add(new Student("����", 11));
		list.add(new Student("����", 12));

		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
	}
}
