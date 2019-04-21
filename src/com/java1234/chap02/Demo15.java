package com.java1234.chap02;

//求水仙花数，所谓水仙花数是指一个三位数，其“各”位数立方和等于该本身
//例如：100~999   153  1*1*1+5*5*5+3*3*3=1+125+27=
public class Demo15 {
	public static void main(String[] args) {

		for (int i = 100; i <= 999; i++) {// 比如i
			int b = i / 100;// 求出百位数i=253 253/100=2
			int s = (i - b * 100) / 10;// 求出十位数 253 （253-2*100）/10=53/10=5
			int g = i - b * 100 - s * 10;// 求出个位数 253 253-2*100-5*10=53-50=3
			if (i == b * b * b + s * s * s + g * g * g) {
				System.out.print(i + " ");
			}
		}
	}
}
