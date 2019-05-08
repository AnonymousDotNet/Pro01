package com.java1234.chap10.sec03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

//根据文件路径，写入内容信息到文件，如果原来的文件中存在内容信息那么会被覆盖掉
public class Demo3 {
	public static void main(String[] args) throws Exception {
		File file = new File("D://java创建的目录文件//java创建的问题件.txt");
		OutputStream out = new FileOutputStream(file);
		String str = "你好，我好，大家好，爱生活，爱代码";
		byte b[] = str.getBytes();
		out.write(b);
		out.close();
	}
}
