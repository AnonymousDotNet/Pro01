package com.java1234.chap03.sec08;

//String ����һ������ʵ����ʱ��ֵ֤���ڶ��е�ָ���Ƿ���ͬ
public class Demo03 {
	public static void main(String[] args) {
		String name1 = "����";// name1��name2��ֵ�ڶ��ж���ָ��ͬһ��λ�õ�
		String name2 = "����";// name1��name2��ֵ�ڶ��ж���ָ��ͬһ��λ�õ�
		String name3 = new String("����");// �����name3�������ڶ��д���һ����ſռ��
		String name4 = new String("����");// �����name4�������ڶ��д���һ����ſռ��

		System.out.println("name1==name2:" + (name1 == name2));
		System.out.println("name1==name3:" + (name1 == name3));// �����ǲ��ȵ�
		System.out.println("name3==name4:" + (name3 == name4));// �����ǲ��ȵ�
	}
}
