package com.yedam.object;
//클래스 선언

//static 필드 : public
//instance 필드 : private
//생성자 : public
//getter, setter : public
//메서드 : public(일부는 private 사용)

public class Circle {
	//반지름 구하기
	
	//필드
	static final double pi = 3.14; //final = javascipt의 const와 동일(변경불가한 값)
	private double r;
	
	//생성자
	//r 필드 조기화 생성자
	//다른 패키지에서 접근 가능하도록 만드는게 public !!
	public Circle(){ 
		
	}
	

	public Circle(double r) {
		this.r = r;
	}
	
	//r reda/write //setter, getter
	public void setR(double r) {
		this.r = r;
	}
	
	public void getR(double r) {
		this.r = r;
	}

	
	public double area() {
		double result = pi * r * r;
		return result;
	}
}
