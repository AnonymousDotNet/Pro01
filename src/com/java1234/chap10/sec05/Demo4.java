package com.java1234.chap10.sec05;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

//ʹ��Writer����д��������Ϣ��������ʽ��д��
public class Demo4 {

	public static void main(String[] args) throws Exception {
		File file = new File("C://�����ļ�.txt");
		Writer out = new FileWriter(file, true);
		out.write("�����л�");
		out.close();
	}
}
