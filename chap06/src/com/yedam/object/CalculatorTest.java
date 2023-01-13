package com.yedam.object;

import java.util.Calendar;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int sum = cal.sum(10, 20);
		System.out.println(sum);
		
		
		Calculator cal2 = new Calculator();
		int sum2 = cal2.sum(10, 20);
		System.out.println(sum2);
		
		System.out.println(cal == cal2);
		
		//
		CalculatorSingle cs1 = CalculatorSingle.getInstance();
		CalculatorSingle cs2 = CalculatorSingle.getInstance();
		
		System.out.println(cs1 == cs2);
		
		Calendar today = Calendar.getInstance(); //싱글톤으로 구성되어있음
		today.set(2023,2,1); //month값은 1월달이 0으로 시작, 2는 3월로 인식
		System.out.println(today.get(Calendar.DAY_OF_YEAR));
	}
}
