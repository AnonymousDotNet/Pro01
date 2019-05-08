package com.java1234.chap10.sec04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//根据文件路径名称，复制文件到指定目录下
public class Demo01 {

	/**
	 * 缓冲方式，这种方式相对来说飞快
	 * 
	 * @throws Exception
	 */
	public static void bufferStream() throws Exception {
		BufferedInputStream bufferedInputStream = new BufferedInputStream(
				new FileInputStream("d://《一头扎进J2SE》V2.0视频笔录2.doc"));// 需要复制的文件路径名称
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
				new FileOutputStream("d://复制的《一头扎进J2SE》V2.0视频笔录2.doc"));// 复制到指定的路径名称
		int b = 0;
		long startTime = System.currentTimeMillis();
		while ((b = bufferedInputStream.read()) != -1) {
			bufferedOutputStream.write(b);
		}
		bufferedInputStream.close();
		bufferedOutputStream.close();
		long endTime = System.currentTimeMillis();
		System.out.println("缓冲方式话费的时间：" + (endTime - startTime));
	}

	/**
	 * 非缓冲方式，这种方式比较耗费时间
	 * 
	 * @throws Exception
	 */
	public static void stream() throws Exception {
		InputStream inputStream = new FileInputStream("c://《一头扎进J2SE》V2.0视频笔录.doc");
		OutputStream outputStream = new FileOutputStream("c://复制的《一头扎进J2SE》V2.0视频笔录.doc");
		int b = 0;
		long startTime = System.currentTimeMillis();
		while ((b = inputStream.read()) != -1) {
			outputStream.write(b);
		}
		inputStream.close();
		outputStream.close();
		long endTime = System.currentTimeMillis();
		System.out.println("非缓冲方式话费的时间：" + (endTime - startTime));
	}

	public static void main(String[] args) throws Exception {
		// stream();
		bufferStream();
	}
}
