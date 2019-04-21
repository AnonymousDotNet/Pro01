package com.java1234.chap03.sec03;

//递归示例
public class Demo03 {
	/**
	 * 非递归的方式
	 * 
	 * @param n
	 * @return
	 */
	static long notDigui(int n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}

	/**
	 * 递归的方式，所谓递归就是自身调用自身
	 * 
	 * @param n
	 * @return
	 */
	static long digui(int n) {
		if (n == 1) {
			return 1;
		}
		return n * digui(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("非递归的方式：" + Demo03.notDigui(5));// 非递归的方式
		System.out.println("递归的方式：" + Demo03.digui(5));// 递归的方式
	}
}
