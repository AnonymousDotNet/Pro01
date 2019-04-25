package com.java1234.chap03.sec18;

//作业：第三步，圆形实现类
public class Circular implements Graphical {

	private float r;// 半径

	/**
	 * 有参构造方法
	 * 
	 * @param r
	 */
	public Circular(float r) {
		// 访问父类方法、参数
		super();
		this.r = r;
	}

	@Override
	public float mianji() {
		// TODO Auto-generated method stub
		return (float) (Math.PI * r * r);
	}

	@Override
	public float zhouChang() {
		// TODO Auto-generated method stub
		return (float) (2 * Math.PI * r);
	}

}
