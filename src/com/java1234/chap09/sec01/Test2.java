package com.java1234.chap09.sec01;


//ʹ�ö��̵߳ķ���
public class Test2 {
	public static void main(String[] args) {
		Music musicThread = new Music();
		Eat eatThread = new Eat();
		musicThread.start();
		eatThread.start();
	}
}
