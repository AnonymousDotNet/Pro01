package com.java1234.chap05.sec01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat类的使用示例
public class TestSimpleDateFormat {

	/**
	 * 将日期字符串转换成一个日期对象
	 * 
	 * @param dateStr 日期字符串
	 * @param format  日期格式
	 * @return
	 * @throws ParseException
	 */
	public static Date fromatDateStr(String dateStr, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(dateStr);
	}

	/**
	 * 将日期对象格式转化为指定格式的日期字符串
	 * 
	 * @param date   传入的日期对象
	 * @param format 格式
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
		 * 支持yyyy.mm.dd、年月日时分秒毫秒等格式 System.out.println(sdf.format(date));
		 */
		System.out.println(formatDate(date, "yyyy-mm-dd"));
		System.out.println(formatDate(date, "yyyy-mm-dd HH:mm:ss"));
		System.out.println(formatDate(date, "yyyy年mm月dd日 HH时mm分ss秒"));

		String dateStr = "1989-18-29 20:18:47";
		Date date2 = fromatDateStr(dateStr, "yyyy-mm-dd HH:mm:ss");
		System.out.println(formatDate(date2, "yyyy-mm-dd HH:mm:ss"));
	}
}
