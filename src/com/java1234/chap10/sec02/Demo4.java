package com.java1234.chap10.sec02;

import java.io.File;

//��ȡֱ��Ŀ¼�ļ��µ��ļ�������ӡ�ļ����ڵ�·��
public class Demo4 {
	public static void listFile(File file) {
		if (file != null) {
			if (file.isDirectory()) {// �����ĵ�����
				System.out.println(file);// ��ӡĿ¼
				File files[] = file.listFiles();// ����Ŀ¼
				if (files != null) {
					for (int i = 0; i < files.length; i++) {
						listFile(files[i]);// �ݹ��������
					}
				}
			} else {
				System.out.println(file);// ���ļ�ֱ�Ӵ�ӡ�ļ���·��
			}
		}
	}

	public static void main(String[] args) {
		File file = new File("D://Tools//jdk1.7.0_71");
		listFile(file);
	}
}
