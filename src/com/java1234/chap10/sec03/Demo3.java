package com.java1234.chap10.sec03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

//�����ļ�·����д��������Ϣ���ļ������ԭ�����ļ��д���������Ϣ��ô�ᱻ���ǵ�
public class Demo3 {
	public static void main(String[] args) throws Exception {
		File file = new File("D://java������Ŀ¼�ļ�//java�����������.txt");
		OutputStream out = new FileOutputStream(file);
		String str = "��ã��Һã���Һã������������";
		byte b[] = str.getBytes();
		out.write(b);
		out.close();
	}
}
