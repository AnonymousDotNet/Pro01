package com.java1234.chap10.sec05;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

//ʹ��Reader������ȡ�ļ�������Ϣ��ʾ�����ж϶�ȡ���ļ����ݳ���������ֽڶ�ȡ
public class Demo2 {

	public static void main(String[] args) throws Exception {
		File file = new File("C://�����ļ�.txt");
		Reader reader = new FileReader(file);
		char c[] = new char[1024];
		int len = 0;
		int temp = 0;
		while ((temp = reader.read()) != -1) {
			c[len++] = (char) temp;
		}
		reader.close();
		System.out.println("��ȡ�������ǣ�" + new String(new String(c, 0, len)));
	}
}
