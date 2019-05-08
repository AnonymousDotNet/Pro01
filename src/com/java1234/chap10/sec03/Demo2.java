package com.java1234.chap10.sec03;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//根据文件路径，读取文件内容信息，文件信息很小的情况下才适用，这里是一个字节一个字节的读取
public class Demo2 {
	public static void main(String[] args) throws Exception {
		File file = new File("D://java创建的目录文件//java创建的问题件.txt");
		InputStream inputStream = new FileInputStream(file);

		int fileLength = (int) file.length();

		byte b[] = new byte[fileLength];
		inputStream.read(b);
		inputStream.close();
		System.out.println("读取的内容是：" + new String(b));
	}
}
