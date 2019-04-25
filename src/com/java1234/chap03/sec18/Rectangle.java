package com.java1234.chap03.sec18;

//作业：第二步，矩形实现类
public class Rectangle implements Graphical {

	private float c;// 长度
	private float k;// 宽度

	/**
	 * 声明有参构造方法
	 * 
	 * @param c
	 * @param k
	 */
	public Rectangle(float c, float k) {
		// 访问父类方法、参数
		super();
		this.c = c;
		this.k = k;
	}

	@Override
	public float mianji() {
		// TODO Auto-generated method stub
		return c * k;
	}

	@Override
	public float zhouChang() {
		// TODO Auto-generated method stub
		return 2 * (c + k);
	}

}
