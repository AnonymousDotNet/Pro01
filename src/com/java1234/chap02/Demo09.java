package com.java1234.chap02;

//�߼������
public class Demo09 {

	public static void main(String[] args) {
		// ��·��;ʵ�ʿ����о��������֣�Ч�ʸ�
		// && ��ǰ���������������붼��true�Ż᷵��true,���򷵻�false
		boolean b1 = (5 < 3) && (4 > 5);
		System.out.println("b1=" + b1);

		// & ����·��
		boolean b2 = (5 < 3) & (4 > 5);
		System.out.println("b2=" + b2);

		// || ��
		boolean b3 = (2 < 3) || (4 > 5);
		System.out.println("b3=" + b3);

		// | ��
		boolean b4 = (5 < 3) | (4 > 5);
		System.out.println("b4=" + b4);

		// ��
		boolean b5 = !(3 < 4);
		System.out.println("b5=" + b5);
		
		// ���
		boolean b6 = (5>4)^(4>3);
		System.out.println("b6=" + b6);//������ô���Ƿ���false�أ���Ӧ����ture�𣿷�����(5>4)^(4<3);Ϊtrue,�ѵ�����ѧû������23333
	}

}
