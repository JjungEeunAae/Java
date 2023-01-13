package com.yedam.object;

public class CircleSingle {
	//반지름 구하기
	
	//싱글톤
	//메모리 공간을 활용적으로 사용하는 방법
	
	//필드
	//CircleSingle 객체 생성
	static CircleSingle instance = new CircleSingle();
	
	static final double pi = 3.14; //final = javascipt의 const와 동일(변경불가한 값)
	double r;
	
	//생성자
	//new를 통해 접근하지 못하도록 막아주는 역할
	private CircleSingle() {}
	
	//메소드
	//필요한 곳에서 쓸 수 있도록 생성자 생성
	static CircleSingle getInstance() {
		return instance;
	}
	
	
	//생성자
	//r 필드 조기화 생성자
	//CircleSingle(){
		
	//}
	
	CircleSingle(double r) {
		this.r = r;
	}
	
	double area() {
		double result = pi * r * r;
		return result;
	}
}
