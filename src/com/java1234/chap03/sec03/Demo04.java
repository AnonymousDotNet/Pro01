package com.java1234.chap03.sec03;

//作业：用递归和非递归的方式实现斐波那契数列 1、1、2、3、5、8、13、21、···
//公式如下：
//F(1)=1,f(2)=1
//F(N)=F(N)-1+F(N-2)

public class Demo04 {

	/**
	 * 使用递归的方式实现
	 * 
	 * @param n
	 * @return
	 */
	static long fibonacci(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	/**
	 * 使用非递归的方式实现
	 * 
	 * @param n
	 * @return
	 */
	static long fibonacci2(int n) {
		long arr[] = new long[n + 1];
		arr[0] = 0;
		arr[1] = 1; // n不能为0，因为n为0时，arr大小为1，arr[1]越界。
		for (int i = 2; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n];
	}

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			long num = fibonacci2(i);
			System.out.print(num + " ");
		}
	}
}
