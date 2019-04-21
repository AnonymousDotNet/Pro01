package com.java1234.chap02;

//逻辑运算符
public class Demo09 {

	public static void main(String[] args) {
		// 短路与;实际开发中尽量用这种，效率高
		// && 与前后两个操作数必须都是true才会返回true,否则返回false
		boolean b1 = (5 < 3) && (4 > 5);
		System.out.println("b1=" + b1);

		// & 不断路与
		boolean b2 = (5 < 3) & (4 > 5);
		System.out.println("b2=" + b2);

		// || 或
		boolean b3 = (2 < 3) || (4 > 5);
		System.out.println("b3=" + b3);

		// | 或
		boolean b4 = (5 < 3) | (4 > 5);
		System.out.println("b4=" + b4);

		// 非
		boolean b5 = !(3 < 4);
		System.out.println("b5=" + b5);
		
		// 异或
		boolean b6 = (5>4)^(4>3);
		System.out.println("b6=" + b6);//这里怎么会是返回false呢？不应该是ture吗？反而是(5>4)^(4<3);为true,难道我数学没过关吗？23333
	}

}
