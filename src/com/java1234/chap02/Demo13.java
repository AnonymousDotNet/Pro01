package com.java1234.chap02;

import java.util.*;

//控制台输入输出操作（string 类型判断操作）
public class Demo13 {
	public static void main(String[] args) {
		System.out.println("请输入姓名");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();// 字符串类型
		scanner.close();
		switch (str) {
		case "张三": {
			System.out.println("输入的是张三：");
			break;
		}
		case "李四": {
			System.out.println("输入的是李四：");
			break;
		}
		case "小五": {
			System.out.println("输入的是小五：");
			break;
		}
		default:{
			System.out.println("请输入其他名称字符");
			break;
		}
		}
	}
}
