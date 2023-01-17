package com.yedam.java.ch03_example;

public abstract class PlayerLevel{
	// * 	- 초보자 레벨 : 천천히 달릴(run) 수 있습니다.
	// * 	- 중급자 레벨 : 빠르게 달리고(run) 점프할(jump) 수 있습니다.
	// * 	- 고급자 레벨 : 엄청 빠르게 달리고(run) 점프하고(jump) 턴할(turn) 수 있습니다.
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	
	//
	public abstract void showLevelMessage();
	
	//go 필살기는 모든 레벨이 가지고 있음
	//필살기는 같은 프로세스로 실행 됨
	//공동적으로 동작하는 부분이기 때문에 추상 메소드를 사용하지 않는다
	//어느 레벨이든 한번 run하고 주어진 count만큼 jump하고 turn
	
	//final -> 오버라이딩이 불가능한 메소드가 된다.
	//사용은 하되, 덮어쓰지는 못하도록
	public final void go(int count) {
		run();
		for(int i = 0 ; i < count ; i++) {
			jump();
		}
		turn();
	}
}
