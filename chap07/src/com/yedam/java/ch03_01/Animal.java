package com.yedam.java.ch03_01;

public abstract class Animal {
	//필드
	public String kind; //종
	
	//생성자
	
	//메소드
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	
	//해당 클래스를 추상클래스로 만들던가
	//기존에 메소드를 일반 메소드로 돌리던가
	//내부에 abstract가 존재하면 무조건 추상 클래스로 선언이 되어야함
	
	//실전에서는 비워주는 일은 없도록.
	public abstract void sound();
}
