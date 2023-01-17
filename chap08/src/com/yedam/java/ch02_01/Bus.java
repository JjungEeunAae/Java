package com.yedam.java.ch02_01;

public class Bus implements Vehicle{
	//개념적으로는 버스도 타는 것
	//그렇지만 실제적으로 Vehicle이랑 Bus 사이에는 어떠한 연관성이 존재하지않는다.
	//드라이브에 선언된 Vehicle의 interface 쪽으로 값을 집어넣을 수는 없다.
	//implements 인터페이스명 :: class에 기재해줘야 정상적으로 작동된다.
	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}
	
	//버스 자체의 고유 메소드
	public void checkFare() {
		System.out.println("승차요금을 체크합니다");
	}
}
