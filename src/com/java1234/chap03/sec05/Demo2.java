package com.java1234.chap03.sec05;

import com.java1234.chap03.sec04.People;

/**
 * 挎包访问 ctrl+shift+o 自动导入包路径
 * 
 * @author Murphy
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();// 包内访问
		People people = new People();// 跨包访问
	}
}
