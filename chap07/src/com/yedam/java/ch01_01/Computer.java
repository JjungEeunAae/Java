package com.yedam.java.ch01_01;
//오버라이딩
//시그니처가 완전히 동일해야함
public class Computer extends Calculator {
	@Override
	//컴파일 할 때 해당 메소드는 부모 클래스의 오버라이딩이다
	//한글자만 틀려도 에러가 발생 함
	//만약 없다면 오류가 나지 않음
	// ㄴ 없는 상태로 해당 클래스의 매서드로 만들어짐
	
	//원둘레를 조금 더 정확하게 구하기
	//오버라이딩을 진행하기
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI *  r * r;
		
		
	}
}
