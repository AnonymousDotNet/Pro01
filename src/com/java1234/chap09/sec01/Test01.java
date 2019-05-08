package com.java1234.chap09.sec01;

//不适用多线程的方式
public class Test01 {
	/*
	 * 听音乐
	 */
	private static void music() {
		for (int i = 0; i < 100; i++) {
			System.out.println("第" + i + "听音乐");
		}
	}

	/*
	 * 吃饭
	 */
	private static void eat() {
		for (int i = 0; i < 100; i++) {
			System.out.println("第" + i + "吃饭");
		}
	}

	public static void main(String[] args) {
		music();
		eat();
	}
}
