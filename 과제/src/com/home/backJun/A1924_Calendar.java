package com.yedam.java.backJun;

import java.util.Calendar;
import java.util.Scanner;

public class A1924_Calendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();	//��
		int y = sc.nextInt();	//��
		
		//Ķ����
		Calendar cal = Calendar.getInstance();

		//1 <= x <= 12 , 1 <= y <= y
		if(x >= 1 && x <= 12 && y >= 1 && y <= 31) {
			
			//set(int year, int month, int date)
			//y : �Է¹��� ���� ���ڷ� ����
			//month x�� 0�� 1���̹Ƿ� -1�� ���ش�
			cal.set(2007,  x-1, y);
			//1:�Ͽ���~7:�����
			int dayNum = cal.get(Calendar.DAY_OF_WEEK);
			System.out.println(dayNum);
			switch(dayNum) {
			case 1:
				System.out.println("SUN");
				break;
			case 2:
				System.out.println("MON");
				break;
			case 3:
				System.out.println("TUE");
				break;
			case 4:
				System.out.println("WED");
				break;
			case 5:
				System.out.println("THU");
				break;
			case 6:
				System.out.println("FRI");
				break;
			case 7:
				System.out.println("SAT");
				break;
			}
		} else {
			System.err.println("x");
			
		}
	}

}
