package com.java1234.chap10.sec02;

import java.io.File;
import java.io.IOException;

//�����ļ�Ŀ¼���ļ�
public class Demo1 {
	public static void main(String[] args) throws IOException {
		File file = new File("d://java������Ŀ¼�ļ�");
		boolean b = file.mkdir();// ��������Ŀ¼
		if (b) {
			System.out.println("����Ŀ¼�ɹ�");
			file = new File("d://java������Ŀ¼�ļ�//java�����������.txt");
			boolean b2 = file.createNewFile();// �����ļ�
			if (b2) {
				System.out.println("����Ŀ¼�ɹ�");
			} else {
				System.out.println("����Ŀ¼ʧ��");
			}
		} else {
			System.out.println("����Ŀ¼ʧ��");
		}
	}
}
