package com.java1234.chap03.sec08;

public class Demo08 {
	public static void main(String[] args) {
		String str = " aB232 23 &*( s2 ";
		String newStr = str.trim();// ȥ���ַ�����ǰ����ڵĿո�
		System.out.println(str);
		System.out.println(newStr);

		int yingWen = 0;// Ӣ���ַ�����
		int kongGe = 0;// �ո����
		int shuZi = 0;// ���ָ���
		int qiTa = 0;// ����

		for (int i = 0; i < newStr.length(); i++) {
			char c = newStr.charAt(i);
			if (c >= 'a' && c <= 'z' || (c >= 'A' && c <= 'Z')) {
				yingWen++;
				System.out.println("Ӣ���ַ�������" + yingWen);
			} else if (c == ' ') {
				kongGe++;
				System.out.println("�ո��ַ�������" + kongGe);
			} else if (c >= '0' && c <= '9') {
				shuZi++;
				System.out.println("�����ַ�������" + shuZi);
			} else {
				qiTa++;
				System.out.println("�����ַ�������" + qiTa);
			}
		}
		/*
		 * System.out.println("Ӣ���ַ�������" + yingWen); System.out.println("�ո��ַ�������" +
		 * kongGe); System.out.println("�����ַ�������" + shuZi); System.out.println("�����ַ�������"
		 * + qiTa);
		 */
	}
}
