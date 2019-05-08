package com.java1234.chap09.sec01;


//使用多线程的方法
public class Test2 {
	public static void main(String[] args) {
		Music musicThread = new Music();
		Eat eatThread = new Eat();
		musicThread.start();
		eatThread.start();
	}
}
