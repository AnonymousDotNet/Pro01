package com.java1234.chap08.sec05;

import java.util.HashMap;
import java.util.Iterator;

//HashMap��ʹ��ʾ��
public class TestHashMap {
	public static void main(String[] args) {
		HashMap<String, Student> hashMap = new HashMap<String, Student>();
		hashMap.put("1��", new Student("����", 10));
		hashMap.put("2��", new Student("����", 11));
		hashMap.put("3��", new Student("����", 12));

		Student s = hashMap.get("1��");
		System.out.println(s);

		Iterator<String> it = hashMap.keySet().iterator();// ��ȡkey�ļ��ϣ��ٻ�ȡ������
		while (it.hasNext()) {
			String key = it.next();// ��ȡkey
			Student student = hashMap.get(key);// ��ȡֵ
			System.out.println("key=" + key + ",value=" + student);
		}
	}
}
