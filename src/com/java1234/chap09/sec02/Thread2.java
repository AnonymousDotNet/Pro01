package com.java1234.chap09.sec02;

//�̵߳Ľ���ʵ��ʾ��:ʹ�ýӿڵķ�ʽ
public class Thread2 implements Runnable{

	private int baoZi=1;
	private String threadName;

	public Thread2(String threadName) {
		super();
		this.threadName = threadName;
	}

	@Override
	public void run() {
		while(baoZi<=10) {
			System.out.println(threadName+" �Ե�"+baoZi+" ������");
			baoZi++;
		}
		
	}
	
	public static void main(String[] args) {
		Thread2 t1=new Thread2("�����߳�");
		Thread2 t2=new Thread2("�����߳�");
		
		Thread t11=new Thread(t1);
		Thread t22=new Thread(t2);
		t11.start();
		t22.start();
	}
	
	
}
