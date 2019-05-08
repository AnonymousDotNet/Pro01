package com.java1234.chap08.sec04;

import java.util.HashSet;
import java.util.Iterator;

//Set使用示例
public class TestHashSet {
	public static void main(String[] args) {
		/**
		 * 1，HashSet是无序的 
		 * 2，HashSet不允许存在重复值
		 */
		HashSet<String> hs = new HashSet<String>();
		hs.add("222");
		hs.add("333");
		hs.add("444");
		hs.add("555");
		hs.add("666");
		// hs.add("666");

		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			String t = it.next();
			System.out.println(t);

		}
	}
}
