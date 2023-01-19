package com.yedam.java.ch02;
//제네릭
//두 개 이상의 타입 파라미터 사용 가능
public interface Rentable<P, I> {
	//추상메소드
	P rent();
	I getCount();
}
