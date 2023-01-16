package com.yedam.java.ch01_01;

public class Car {
	//필드
	public int speed;
	
	//한번 초기화 되면 값이 변경되지 않는다.
	//기본적으로 초기화시키라는 뜻 
	//public final int maxSpeed;
	public final int maxSpeed = 300;
	
	//생성자
	
	//메소드
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
