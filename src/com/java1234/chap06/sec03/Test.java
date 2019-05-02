package com.java1234.chap06.sec03;

import com.java1234.chap06.sec02.Cat;
import com.java1234.chap06.sec02.Demo;
import com.java1234.chap06.sec02.Dog;

public class Test {
	/**
	 * 通配符泛型，使用问号来代替Animal父类，如果直接使用Animal是无法编译通过的
	 * @param a
	 */
private static void take(Demo<?>a) {
	a.print();
}
public static void main(String[] args) {
	Demo<Dog> demo=new Demo<Dog>(new Dog());
	take(demo);
	
	Demo<Cat> demo2=new Demo<Cat>(new Cat());
	take(demo2);
}
}
