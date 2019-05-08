package com.java1234.chap10.sec05;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

//使用Reader类来读取文件内容信息的示例
public class Demo1 {

	public static void main(String[] args) throws Exception {
		File file = new File("C://测试文件.txt");
		Reader reader = new FileReader(file);
		char c[] = new char[1024];
		int len = reader.read(c);
		reader.close();
		System.out.println("读取的内容是：" + new String(new String(c, 0, len)));
	}
}
