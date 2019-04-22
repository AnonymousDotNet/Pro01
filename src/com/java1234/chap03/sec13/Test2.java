package com.java1234.chap03.sec13;

//在实际开发中大部分是使用接口的方式来实现多态的，这是示例
public class Test2 {
public static void main(String[] args) {
	People p1=new Student();//父类的引用指向子类的具体实现
	p1.say();
	
	p1=new Teacher();//也可以这样写
	p1.say();
}
}
