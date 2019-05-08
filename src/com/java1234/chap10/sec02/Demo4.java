package com.java1234.chap10.sec02;

import java.io.File;

//获取直径目录文件下的文件，并打印文件所在的路径
public class Demo4 {
	public static void listFile(File file) {
		if (file != null) {
			if (file.isDirectory()) {// 如果是牡蛎情况
				System.out.println(file);// 打印目录
				File files[] = file.listFiles();// 遍历目录
				if (files != null) {
					for (int i = 0; i < files.length; i++) {
						listFile(files[i]);// 递归调用自身
					}
				}
			} else {
				System.out.println(file);// 是文件直接打印文件的路径
			}
		}
	}

	public static void main(String[] args) {
		File file = new File("D://Tools//jdk1.7.0_71");
		listFile(file);
	}
}
