package com.java1234.chap10.sec05;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

//ʹ��Reader������ȡ�ļ�������Ϣ��ʾ��
public class Demo1 {

	public static void main(String[] args) throws Exception {
		File file = new File("C://�����ļ�.txt");
		Reader reader = new FileReader(file);
		char c[] = new char[1024];
		int len = reader.read(c);
		reader.close();
		System.out.println("��ȡ�������ǣ�" + new String(new String(c, 0, len)));
	}
}
