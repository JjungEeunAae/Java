package com.yedam.java.ch01_01;

public interface RemoteControl {
	//상수 - 무조건 초기값이 있어야 함
	//일반 필드가 아닌 상수
	//public static final int MAX_VALUE = 10; 와 의미가 같다.
	//상수는 static final --> 변하지 않는 고정값이 됨.
	public int MAX_VALUE = 10;
	public int MIN_VALUE = 0;;
	
	//추상 메소드
	//인터페이스의 공간에서는 실행블럭이 있어서는 안된다.
	//일반 메소드라면 default를 붙혀야 한다.
//	public default void method() {
//		System.out.println("일반 메소드입니다");
//	}
	
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
