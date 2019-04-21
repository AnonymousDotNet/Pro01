package com.java1234.chap03.sec03;

//��ҵ���õݹ�ͷǵݹ�ķ�ʽʵ��쳲��������� 1��1��2��3��5��8��13��21��������
//��ʽ���£�
//F(1)=1,f(2)=1
//F(N)=F(N)-1+F(N-2)

public class Demo04 {

	/**
	 * ʹ�õݹ�ķ�ʽʵ��
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
	 * ʹ�÷ǵݹ�ķ�ʽʵ��
	 * 
	 * @param n
	 * @return
	 */
	static long fibonacci2(int n) {
		long arr[] = new long[n + 1];
		arr[0] = 0;
		arr[1] = 1; // n����Ϊ0����ΪnΪ0ʱ��arr��СΪ1��arr[1]Խ�硣
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
