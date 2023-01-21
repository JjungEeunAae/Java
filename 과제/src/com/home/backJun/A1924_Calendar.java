package com.yedam.java.backJun;

import java.util.Calendar;
import java.util.Scanner;

public class A1924_Calendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();	//월
		int y = sc.nextInt();	//일
		
		//캘린더
		Calendar cal = Calendar.getInstance();

		//1 <= x <= 12 , 1 <= y <= y
		if(x >= 1 && x <= 12 && y >= 1 && y <= 31) {
			
			//set(int year, int month, int date)
			//y : 입력받은 월의 일자로 세팅
			//month x는 0이 1월이므로 -1을 해준다
			cal.set(2007,  x-1, y);
			//1:일요일~7:토요일
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
