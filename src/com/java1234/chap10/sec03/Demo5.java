package com.java1234.chap10.sec03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

//根据文件路径，写入内容信息到文件，这种方式是不覆盖进行增加写入的方式
public class Demo5 {
	public static void main(String[] args) throws Exception {
		File file = new File("D://java创建的目录文件//java创建的问题件.txt");
		OutputStream out = new FileOutputStream(file, true);
		String str = "你好，我好，大家好，爱生活，爱代码322好啊";
		byte b[] = str.getBytes();
		out.write(b);
		out.close();
	}
}
