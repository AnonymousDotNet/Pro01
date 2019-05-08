package com.java1234.chap10.sec03;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//根据文件路径，读取文件内容信息
public class Demo1 {
	public static void main(String[] args) throws Exception {
		File file = new File("D://java创建的目录文件//java创建的问题件.txt");
		InputStream inputStream = new FileInputStream(file);
		byte b[] = new byte[1024];
		int len = inputStream.read(b);
		inputStream.close();
		System.out.println("读取的内容是：" + new String(b, 0, len));// 这里之所以写成0到len是考虑到字节的浪费问题
	}
}
