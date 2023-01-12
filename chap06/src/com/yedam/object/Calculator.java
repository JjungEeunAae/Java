package com.yedam.object;

public class Calculator {
	//필드
	
	//생성자
	
	//메소드
	//메소드 리턴 타입이 존재할 때
	int sum(int a, int b) {
		return a+b;
	}
	
	double sub(int a, int b) {
		return a-b;
	}
	
	String result(String value) {
		String temp = "value 테스트" + value ;
		return temp;
	}
	
	//리턴문이 없는 메소드 생성
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	//매개변수가 몇 개인지 모를 경우
	int sum2(int ...values) {
		int total = 0;
		System.out.println(values); //values => 참조타입이라 그냥 호출하면 번지 값 나옴
		for(int a : values) { 
			total += a;
		}
		return total;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
