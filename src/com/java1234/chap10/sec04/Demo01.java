package com.java1234.chap10.sec04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//�����ļ�·�����ƣ������ļ���ָ��Ŀ¼��
public class Demo01 {

	/**
	 * ���巽ʽ�����ַ�ʽ�����˵�ɿ�
	 * 
	 * @throws Exception
	 */
	public static void bufferStream() throws Exception {
		BufferedInputStream bufferedInputStream = new BufferedInputStream(
				new FileInputStream("d://��һͷ����J2SE��V2.0��Ƶ��¼2.doc"));// ��Ҫ���Ƶ��ļ�·������
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
				new FileOutputStream("d://���Ƶġ�һͷ����J2SE��V2.0��Ƶ��¼2.doc"));// ���Ƶ�ָ����·������
		int b = 0;
		long startTime = System.currentTimeMillis();
		while ((b = bufferedInputStream.read()) != -1) {
			bufferedOutputStream.write(b);
		}
		bufferedInputStream.close();
		bufferedOutputStream.close();
		long endTime = System.currentTimeMillis();
		System.out.println("���巽ʽ���ѵ�ʱ�䣺" + (endTime - startTime));
	}

	/**
	 * �ǻ��巽ʽ�����ַ�ʽ�ȽϺķ�ʱ��
	 * 
	 * @throws Exception
	 */
	public static void stream() throws Exception {
		InputStream inputStream = new FileInputStream("c://��һͷ����J2SE��V2.0��Ƶ��¼.doc");
		OutputStream outputStream = new FileOutputStream("c://���Ƶġ�һͷ����J2SE��V2.0��Ƶ��¼.doc");
		int b = 0;
		long startTime = System.currentTimeMillis();
		while ((b = inputStream.read()) != -1) {
			outputStream.write(b);
		}
		inputStream.close();
		outputStream.close();
		long endTime = System.currentTimeMillis();
		System.out.println("�ǻ��巽ʽ���ѵ�ʱ�䣺" + (endTime - startTime));
	}

	public static void main(String[] args) throws Exception {
		// stream();
		bufferStream();
	}
}
