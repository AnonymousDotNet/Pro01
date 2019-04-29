package com.java1234.chap05.sec01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat���ʹ��ʾ��
public class TestSimpleDateFormat {

	/**
	 * �������ַ���ת����һ�����ڶ���
	 * 
	 * @param dateStr �����ַ���
	 * @param format  ���ڸ�ʽ
	 * @return
	 * @throws ParseException
	 */
	public static Date fromatDateStr(String dateStr, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(dateStr);
	}

	/**
	 * �����ڶ����ʽת��Ϊָ����ʽ�������ַ���
	 * 
	 * @param date   ��������ڶ���
	 * @param format ��ʽ
	 * @return
	 */
	public static String formatDate(Date date, String format) {
		String result = "";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		if (date != null) {
			result = sdf.format(date);
		}
		return result;
	}

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd HH:mm:ss");//
		 * ֧��yyyy.mm.dd��������ʱ�������ȸ�ʽ System.out.println(sdf.format(date));
		 */
		System.out.println(formatDate(date, "yyyy-mm-dd"));
		System.out.println(formatDate(date, "yyyy-mm-dd HH:mm:ss"));
		System.out.println(formatDate(date, "yyyy��mm��dd�� HHʱmm��ss��"));

		String dateStr = "1989-18-29 20:18:47";
		Date date2 = fromatDateStr(dateStr, "yyyy-mm-dd HH:mm:ss");
		System.out.println(formatDate(date2, "yyyy-mm-dd HH:mm:ss"));
	}
}
