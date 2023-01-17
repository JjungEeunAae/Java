package com.yedam.java.ch03_example;
//고급
public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 점프합니다");
	}

	@Override
	public void turn() {
		System.out.println("턴 할 수 있습니다");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("**** 고급자 레벨입니다 ****");
	}

}
