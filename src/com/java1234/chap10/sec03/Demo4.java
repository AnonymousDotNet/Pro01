package com.java1234.chap10.sec03;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//�����ļ�·������ȡ�ļ�������Ϣ���ļ���Ϣ��֪�����ٵ�������Ҳ��Ǻܶ�����ã�������һ���ֽ�һ���ֽڵĶ�ȡ
public class Demo4 {
	public static void main(String[] args) throws Exception {
		File file = new File("D://java������Ŀ¼�ļ�//java�����������.txt");
		InputStream inputStream = new FileInputStream(file);

		int fileLength = (int) file.length();

		byte b[] = new byte[fileLength];
		int len = 0;
		int temp = 0;
		/**
		 * �����ж��ļ�����ֻҪ����-1��ʱ���ѭ����ȡ��Ҳ��һ���ֽ�һ���ֽڵĶ�ȡ�������Ͳ���Ҫ�����ֽڳ���
		 */
		while ((temp = inputStream.read()) != -1) {
			b[len++] = (byte) temp;
		}
		inputStream.close();
		System.out.println("��ȡ�������ǣ�" + new String(b));
	}
}
