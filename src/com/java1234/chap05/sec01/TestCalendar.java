package com.java1234.chap05.sec01;

import java.util.Calendar;

//Date��Calendarʹ��ʾ����
public class TestCalendar {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));

		System.out.println("�����ǣ�" + calendar.get(Calendar.YEAR) + "��" + (calendar.get(Calendar.MONTH) + 1) + "��"
				+ (calendar.get(Calendar.DAY_OF_MONTH) + "��" + calendar.get(Calendar.HOUR_OF_DAY) + "ʱ"
						+ calendar.get(Calendar.MINUTE) + "��" + calendar.get(Calendar.SECOND) + "��"));
	}
}
