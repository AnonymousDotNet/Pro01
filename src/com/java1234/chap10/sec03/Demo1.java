package com.java1234.chap10.sec03;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//�����ļ�·������ȡ�ļ�������Ϣ
public class Demo1 {
	public static void main(String[] args) throws Exception {
		File file = new File("D://java������Ŀ¼�ļ�//java�����������.txt");
		InputStream inputStream = new FileInputStream(file);
		byte b[] = new byte[1024];
		int len = inputStream.read(b);
		inputStream.close();
		System.out.println("��ȡ�������ǣ�" + new String(b, 0, len));// ����֮����д��0��len�ǿ��ǵ��ֽڵ��˷�����
	}
}
