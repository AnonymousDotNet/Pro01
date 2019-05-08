package com.java1234.chap10.sec02;

import java.io.File;
import java.io.IOException;

//删除文件目录、文件
public class Demo2 {
	public static void main(String[] args) throws IOException {
		File file = new File("d://java创建的目录文件//java创建的问题件.txt");
		if(file.exists()) {//判断文件是否存在
			boolean b=file.delete();//删除文件
			if(b) {
				System.out.println("删除文件成功");
			}else {
				System.out.println("删除文件失败");
			}
			file=new File("d://java创建的目录文件");
			if(file.exists()) {
				boolean b2=file.delete();
				if(b2) {
					System.out.println("删除目录文件成功");
				}else {
					System.out.println("删除目录文件失败");
				}
			}
		}
	}
}
