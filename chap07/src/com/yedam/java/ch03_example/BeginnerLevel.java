package com.yedam.java.ch03_example;
//초급
public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		//초보자는 속도가 느리다
		System.out.println("천천히 달립니다");
	}

	@Override
	public void jump() {
		System.out.println("점프를 할 수 없습니다");
	}

	@Override
	public void turn() {
		System.out.println("턴을 할 수 없습니다");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("**** 초보자 레벨입니다 ****");
	}

}
