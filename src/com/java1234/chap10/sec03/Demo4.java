package com.java1234.chap10.sec03;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//根据文件路径，读取文件内容信息，文件信息不知道多少的情况下且不是很多才适用，这里是一个字节一个字节的读取
public class Demo4 {
	public static void main(String[] args) throws Exception {
		File file = new File("D://java创建的目录文件//java创建的问题件.txt");
		InputStream inputStream = new FileInputStream(file);

		int fileLength = (int) file.length();

		byte b[] = new byte[fileLength];
		int len = 0;
		int temp = 0;
		/**
		 * 这里判断文件内容只要不是-1的时候就循环读取，也是一个字节一个字节的读取，这样就不需要设置字节长度
		 */
		while ((temp = inputStream.read()) != -1) {
			b[len++] = (byte) temp;
		}
		inputStream.close();
		System.out.println("读取的内容是：" + new String(b));
	}
}
