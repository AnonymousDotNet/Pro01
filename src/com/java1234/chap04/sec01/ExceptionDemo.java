package com.java1234.chap04.sec01;

public class ExceptionDemo {
	public static void main(String[] args) {
		String str = "123a";
		/**
		 * 这里的try catch是有分层级的，就是类似从小到大的。 只能是一大的一层包含小的一层异常，如果有小的异常包含大的就会出现编译不通过的情况
		 */
		try {
			int a = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("继续执行");
	}
}
