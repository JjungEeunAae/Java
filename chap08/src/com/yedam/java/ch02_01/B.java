package com.yedam.java.ch02_01;

public class B implements A{
	//A와 D의 연결고리
	//B -> 구현클래스
	@Override
	public void method1() {
		System.out.println("Interpace A - Method1()");
		
	}

	public void method2() {
		System.out.println("Calss B - Method2()");
	}
	
}
