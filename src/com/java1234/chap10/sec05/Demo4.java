package com.java1234.chap10.sec05;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

//使用Writer类来写入内容信息，不覆盖式的写入
public class Demo4 {

	public static void main(String[] args) throws Exception {
		File file = new File("C://测试文件.txt");
		Writer out = new FileWriter(file, true);
		out.write("爱我中华");
		out.close();
	}
}
