package com.yedam.java.backJun;

import java.util.Scanner;

public class A1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//2007�� x�� y�Ͽ� ���� ���� ����ϱ�
		
		int x = sc.nextInt();	//��
		int y = sc.nextInt();	//��
		int sumday = 0;			//x�� y�� ���� ���� ���� �ʱ�ȭ
		
		//1~12���� ���� ����
		int[] monthLastDay = { 0,31,28,31,30,31,30,31,31,30,31,30,31 };
		
		//�Է� ���� ���� ������ �� �ϼ��� ���Ѵ�
		for(int i = 1 ; i < x ; i++) {
			sumday += monthLastDay[i];
		}
		//����� �� �� ���� ���ڸ� ���Ѵ�
		sumday+=y;
		System.out.println("���Ѱ� : " + sumday);
		
		//(�������� �հ�+����)%7
		int sumday2 = sumday%7;
		System.out.println("������ �� : " + sumday2);
		
		
		switch(sumday2) {
			case 0:
				System.out.println("SUN");
				break;
			case 1:
				System.out.println("MON");
				break;
			case 2:
				System.out.println("TUE");
				break;
			case 3:
				System.out.println("WED");
				break;
			case 4:
				System.out.println("THU");
				break;
			case 5:
				System.out.println("FRI");
				break;
			case 6:
				System.out.println("SAT");
				break;	
		}
		
	}
	
}
