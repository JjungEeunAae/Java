package com.yedam.java.ch02_01;

public class CarExaple {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println();
		
		//타이어라는 인터페이스로 정의되어 있기 때문에 대체를 할 수 있음
		myCar.frontLeftTire = new KumhoTire();
		myCar.backRightTire = new KumhoTire();
		
		myCar.run();
	}
}
