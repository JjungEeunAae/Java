package com.yedam.neyeol;

import java.util.Calendar;

public class EnumExample {
	public static void main(String[] args) {
		
		//열거타입
		
		//Week 타입의 today 변수
		//today는 Week가 가지고 있는 데이터만 가질 수 있다.
		//today 데이터 범위는 monday~sunday 총 7개
		Week today = null;                      // Week는 enum에 담겨져있는 데이터가 담긴 데이터타입
		
		//오늘의 요일이 어떠한 요일인지 확인해보는 구문
		Calendar cal = Calendar.getInstance();
		//자바는 일주일의 시작이 일요일로 인식
		//일요일 = 1, 월요일 = 2, .... 금요일 = 6
		//오늘 요일을 숫자로 알려줌
		int week = cal.get(Calendar.DAY_OF_WEEK);//이번주를 일주일로 봤을 때 오늘은 무슨 요일인지 가져오는 구문
		
		switch(week) {
			case 1:
				today = Week.SATURDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SENDAY;
				break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		
		
		
		
		
		
		
		
		
		
	}
}
