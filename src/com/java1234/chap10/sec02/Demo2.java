package com.java1234.chap10.sec02;

import java.io.File;
import java.io.IOException;

//ɾ���ļ�Ŀ¼���ļ�
public class Demo2 {
	public static void main(String[] args) throws IOException {
		File file = new File("d://java������Ŀ¼�ļ�//java�����������.txt");
		if(file.exists()) {//�ж��ļ��Ƿ����
			boolean b=file.delete();//ɾ���ļ�
			if(b) {
				System.out.println("ɾ���ļ��ɹ�");
			}else {
				System.out.println("ɾ���ļ�ʧ��");
			}
			file=new File("d://java������Ŀ¼�ļ�");
			if(file.exists()) {
				boolean b2=file.delete();
				if(b2) {
					System.out.println("ɾ��Ŀ¼�ļ��ɹ�");
				}else {
					System.out.println("ɾ��Ŀ¼�ļ�ʧ��");
				}
			}
		}
	}
}
