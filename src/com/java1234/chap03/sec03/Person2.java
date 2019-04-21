package com.java1234.chap03.sec03;

/**
 * 方法调用的示例
 * 
 * @param name    姓名
 * @param age     年龄
 * @param bobbies 爱好 个人不固定，这里是一个数组
 * @return 返回值，个人爱好
 * @author Murphy
 *
 */
public class Person2 {
	int speak(String name, int age, String... hobbies) {
		System.out.println("我是" + name + ",我今年" + age + "岁了");
		for (String hobby : hobbies) {
			System.out.print(hobby + " ");
		}
		int totalHobbies = hobbies.length;
		return totalHobbies;
	}

	public static void main(String[] args) {
		Person2 zhangsan = new Person2();
		int n = zhangsan.speak("张三", 20, "唱歌", "游泳");
		System.out.println("有"+n+"个爱好");
	}
}
