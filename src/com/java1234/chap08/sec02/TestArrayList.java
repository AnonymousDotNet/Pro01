package com.java1234.chap08.sec02;

import java.util.ArrayList;

public class TestArrayList {

	private static void pringArrayList(ArrayList<String> arrayList){
		System.out.print("��ǰ�ļ���Ԫ��:");
		for(int i=0;i<arrayList.size();i++){
			System.out.print(arrayList.get(i)+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("����");
		arrayList.add("����");
		pringArrayList(arrayList);
		// ��ָ����Ԫ�ز�����б��е�ָ��λ�á�
		arrayList.add(1,"С����");
		pringArrayList(arrayList);
		// ��ָ����Ԫ��������б���ָ��λ���ϵ�Ԫ�ء�
		arrayList.set(2, "С����");
		pringArrayList(arrayList);
		// �Ƴ����б���ָ��λ���ϵ�Ԫ�ء�
		arrayList.remove(0);
		pringArrayList(arrayList);
	}
}
