package com.java1234.chap10.sec02;

import java.io.File;
import java.io.IOException;

//��ȡ����ָ��Ŀ¼�ļ��µ��ļ�����������һֱ��ʾ�����������������쳣�������֪������������⣬�����д���߰���Ӧ�����ļ����ർ�µģ�����ֻ�ǲ²�
public class Demo3 {
	public static void main(String[] args) throws IOException  {
		File file = new File("D://Tools//jdk1.7.0_71");
		File files[] = file.listFiles();// ����Ŀ¼
		for (int i = 0; i < file.length(); i++) {
			System.out.println(files[i]);
		}
	}
}
