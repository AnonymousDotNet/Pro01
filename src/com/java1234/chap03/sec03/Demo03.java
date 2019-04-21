package com.java1234.chap03.sec03;

//�ݹ�ʾ��
public class Demo03 {
	/**
	 * �ǵݹ�ķ�ʽ
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
	 * �ݹ�ķ�ʽ����ν�ݹ���������������
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
		System.out.println("�ǵݹ�ķ�ʽ��" + Demo03.notDigui(5));// �ǵݹ�ķ�ʽ
		System.out.println("�ݹ�ķ�ʽ��" + Demo03.digui(5));// �ݹ�ķ�ʽ
	}
}
