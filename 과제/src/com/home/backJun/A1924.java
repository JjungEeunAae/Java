package com.yedam.java.backJun;

import java.util.Scanner;

public class A1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//2007년 x월 y일에 대한 요일 출력하기
		
		int x = sc.nextInt();	//월
		int y = sc.nextInt();	//일
		int sumday = 0;			//x와 y의 합을 넣을 변수 초기화
		
		//1~12월의 월말 일자
		int[] monthLastDay = { 0,31,28,31,30,31,30,31,31,30,31,30,31 };
		
		//입력 월의 이전 월까지 총 일수를 구한다
		for(int i = 1 ; i < x ; i++) {
			sumday += monthLastDay[i];
		}
		//계산이 다 된 월에 일자를 더한다
		sumday+=y;
		System.out.println("더한값 : " + sumday);
		
		//(월말일자 합계+요일)%7
		int sumday2 = sumday%7;
		System.out.println("나머지 값 : " + sumday2);
		
		
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
