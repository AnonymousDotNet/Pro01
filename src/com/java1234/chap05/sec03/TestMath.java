package com.java1234.chap05.sec03;

//Math类是一个数学工具方法，里面有很多的静态工具方法可直接调用
//求最大值、最小值、四舍五入、求次幂等
public class TestMath {
	public static void main(String[] args) {
		System.out.println("最大值：" + Math.max(1, 2));
		System.out.println("最小值：" + Math.min(1, 2));
		System.out.println("四舍五入：" + Math.round(4.4));
		System.out.println("求次幂：" + Math.pow(3, 4));
		
		/**
		 * //作业：求4的平方根
		 */
		System.out.println("平方根："+Math.sqrt(4));
	}
}
