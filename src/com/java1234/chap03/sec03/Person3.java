package com.java1234.chap03.sec03;

class SanWei {
	int b;// 胸围
	int w;// 腰围
	int h;// 臀围
}

//引用传递和值传递示例
public class Person3 {
	void speak(int age, SanWei sanwei) {
		System.out.println("我今年" + age + "岁了");
		System.out.println("我的三围是：" + sanwei.b + "," + sanwei.w + "," + sanwei.h);
		age = 24;
		System.out.println("方法里age" + age);
		sanwei.b = 80;
	}

	public static void main(String[] args) {
		Person3 zhangsan = new Person3();
		int age = 23;
		SanWei sanwei = new SanWei();
		sanwei.b = 90;
		sanwei.w = 60;
		sanwei.h = 30;
		zhangsan.speak(age, sanwei);
		System.out.println(age);
		System.out.println("调用地方，胸围" + sanwei.b);
	}
}
