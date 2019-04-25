package com.java1234.chap03.sec18;

//作业：实现一个类，用来表示图形，定义方法，可以分别计算出矩形和圆形的面积和周长（要求用到抽象思维）
//思路，这个作业说要用到抽象思维，所以肯定要抽象出一些公共的东西，这里的矩形和圆形 能抽象出公共的面积和周长方法，我们可以用接口来实现；
public class Test2 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 3.5f);
		System.out.println("矩形的面积：" + r.mianji());
		System.out.println("矩形的周长：" + r.zhouChang());

		Circular c = new Circular(1.5f);
		System.out.println("圆形的面积：" + c.mianji());
		System.out.println("圆形的周长：" + c.mianji());
	}
}
