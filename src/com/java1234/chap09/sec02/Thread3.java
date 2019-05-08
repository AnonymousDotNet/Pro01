package com.java1234.chap09.sec02;

//线程的交叉实现示例:使用接口的方式
public class Thread3 implements Runnable{

	private int baoZi=1;
	private String threadName;

	public Thread3(String threadName) {
		super();
		this.threadName = threadName;
	}

	/*
	 * 如果不加synchronized 锁的话，会导致多个线程共同吃一个包子的情况
	 */
	@Override
	public synchronized void run() {
		while(baoZi<=10) {
			System.out.println(threadName+" 吃第"+baoZi+" 个包子");
			baoZi++;
		}
		
	}
	
	public static void main(String[] args) {
		Thread3 t1=new Thread3("超级张三线程");

		
		Thread t11=new Thread(t1);
		Thread t22=new Thread(t1);
		Thread t33=new Thread(t1);
		t11.start();
		t22.start();
		t33.start();
	}
	
	
}
