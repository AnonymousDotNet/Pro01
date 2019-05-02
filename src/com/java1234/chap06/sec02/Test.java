package com.java1234.chap06.sec02;

//泛型的限制类型示例
public class Test {
public static void main(String[] args) {
	Demo<Dog> demo=new Demo<Dog>(new Dog());
	Dog dog=demo.getT();
	dog.print();
	
	Demo<Cat> demo2=new Demo<Cat>(new Cat());
	Cat cat=demo2.getT();
	cat.print();
	
	/**
	 * 这里的示例就是展示了限制类型的作用，比较安全
	 */
	Demo<Animal> demo3=new Demo<Animal>(new Animal());
	//Demo<Integer> demo4=new Demo<Integer>(1);
}
}
