package com.java1234.chap10.sec03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

//�����ļ�·����д��������Ϣ���ļ������ַ�ʽ�ǲ����ǽ�������д��ķ�ʽ
public class Demo5 {
	public static void main(String[] args) throws Exception {
		File file = new File("D://java������Ŀ¼�ļ�//java�����������.txt");
		OutputStream out = new FileOutputStream(file, true);
		String str = "��ã��Һã���Һã������������322�ð�";
		byte b[] = str.getBytes();
		out.write(b);
		out.close();
	}
}
