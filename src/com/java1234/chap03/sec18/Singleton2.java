package com.java1234.chap03.sec18;

public class Singleton2 {
	/**
	 * 构造方法私有
	 */
	private Singleton2() {

	}

	private static Singleton2 single = null;// 区别就是当你使用时再实例化

	/**
	 * 获取实例； 使用synchronized是因为如果是出现并发访问时，会出现问题，加上synchronized能保证每次进去就一个线程的效果
	 * 
	 * @return
	 */
	public synchronized static Singleton2 getInstance() {
		if (single == null) {
			System.out.println("第一次调用");
			single = new Singleton2();
		}
		return single;
	}
}
