package com.yedam.java.ch02;

public class Box<A> {
	//대문자 아무거나 상관 없음
	//클래스를 하나의 파라미터로 사용할 수 있게 됨
	//<A> ====> 타입(클래스)을 값으로 받는 일종의 변수
	
	private A a;
	
	public void set(A a) {
		this.a = a;
	}
	
	public A get(){
		return a;
	}
}
