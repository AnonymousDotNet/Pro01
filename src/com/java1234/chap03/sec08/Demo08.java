package com.java1234.chap03.sec08;

public class Demo08 {
	public static void main(String[] args) {
		String str = " aB232 23 &*( s2 ";
		String newStr = str.trim();// 去除字符串中前后存在的空格
		System.out.println(str);
		System.out.println(newStr);

		int yingWen = 0;// 英文字符个数
		int kongGe = 0;// 空格个数
		int shuZi = 0;// 数字个数
		int qiTa = 0;// 其他

		for (int i = 0; i < newStr.length(); i++) {
			char c = newStr.charAt(i);
			if (c >= 'a' && c <= 'z' || (c >= 'A' && c <= 'Z')) {
				yingWen++;
				System.out.println("英文字符个数：" + yingWen);
			} else if (c == ' ') {
				kongGe++;
				System.out.println("空格字符个数：" + kongGe);
			} else if (c >= '0' && c <= '9') {
				shuZi++;
				System.out.println("数字字符个数：" + shuZi);
			} else {
				qiTa++;
				System.out.println("其他字符个数：" + qiTa);
			}
		}
		/*
		 * System.out.println("英文字符个数：" + yingWen); System.out.println("空格字符个数：" +
		 * kongGe); System.out.println("数字字符个数：" + shuZi); System.out.println("其他字符个数："
		 * + qiTa);
		 */
	}
}
