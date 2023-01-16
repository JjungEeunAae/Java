package com.yedam.java.ch01_01;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//final이 붙으면 오버라이딩은 되지 않음
	// ㄴ라이브러리를 만들 때 많이 사용 됨
	//static final ==> 공용으로 사용가능하고 값이 변하되지 않는 상태 = 상수
	public void carStop() {
		//System.out.println("스포츠 카를 멈춤");
		//speed = 0;
		
		//부모 클래스의 final 메소드를 호출은 가능함
		super.stop();
		
		//부모 클래스의 final 값은 변경이 불가능하다.
		//this.maxSpeed = 400;
	}
	
}
