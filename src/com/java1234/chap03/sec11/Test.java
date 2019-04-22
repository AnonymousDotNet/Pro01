package com.java1234.chap03.sec11;

//实验抽象类和抽象方法的使用，使用子类具体实现抽象类中的抽象方法示例
public class Test {
	public static void main(String[] args) {
		Student student = new Student();
		student.profession();

		Teacher teacher = new Teacher();
		teacher.profession();
	}
}
