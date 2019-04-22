package com.java1234.chap03.sec10;

public class People extends JiangShi {

	private final int a = 1;

	public final void action() {
		// a=2;//用了final不能被继承、修改
		System.out.println("做一个良好的公民");
	}
}
