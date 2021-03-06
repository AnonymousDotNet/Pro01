package com.java1234.chap10.sec05;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

//使用Reader类来读取文件内容信息的示例，判断读取的文件内容长度来逐个字节读取
public class Demo2 {

	public static void main(String[] args) throws Exception {
		File file = new File("C://测试文件.txt");
		Reader reader = new FileReader(file);
		char c[] = new char[1024];
		int len = 0;
		int temp = 0;
		while ((temp = reader.read()) != -1) {
			c[len++] = (char) temp;
		}
		reader.close();
		System.out.println("读取的内容是：" + new String(new String(c, 0, len)));
	}
}
