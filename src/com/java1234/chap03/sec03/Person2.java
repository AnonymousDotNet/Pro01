package com.java1234.chap03.sec03;

/**
 * �������õ�ʾ��
 * 
 * @param name    ����
 * @param age     ����
 * @param bobbies ���� ���˲��̶���������һ������
 * @return ����ֵ�����˰���
 * @author Murphy
 *
 */
public class Person2 {
	int speak(String name, int age, String... hobbies) {
		System.out.println("����" + name + ",�ҽ���" + age + "����");
		for (String hobby : hobbies) {
			System.out.print(hobby + " ");
		}
		int totalHobbies = hobbies.length;
		return totalHobbies;
	}

	public static void main(String[] args) {
		Person2 zhangsan = new Person2();
		int n = zhangsan.speak("����", 20, "����", "��Ӿ");
		System.out.println("��"+n+"������");
	}
}
