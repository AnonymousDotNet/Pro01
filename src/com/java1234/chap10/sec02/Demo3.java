package com.java1234.chap10.sec02;

import java.io.File;
import java.io.IOException;

//获取遍历指定目录文件下的文件，但是这里一直提示数组索引超出界限异常，这个不知道是哪里的问题，基础尚待提高啊；应该是文件过多导致的，但这只是猜测
public class Demo3 {
	public static void main(String[] args) throws IOException  {
		File file = new File("D://Tools//jdk1.7.0_71");
		File files[] = file.listFiles();// 遍历目录
		for (int i = 0; i < file.length(); i++) {
			System.out.println(files[i]);
		}
	}
}
