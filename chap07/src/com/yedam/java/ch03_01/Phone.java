package com.yedam.java.ch03_01;
//abstract --> 추상 클래스의 키워드
//해당 클래스의 생성자가 작동하지 않는다.
//자식클래스 내에서만 작동이 가능하다.
public abstract class Phone {
	//필
	public String owner; 
	
	
	//생
	public Phone(String ower) {
		this.owner = owner;
	}
	
	
	//메
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
}
