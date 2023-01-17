package com.yedam.java.ch02_01;

public class PromotionExaple {

	public static void main(String[] args) {
		//D class는 B class를 상속받았다
		D d = new D();
		d.method1();
		d.method2();
		d.method3();
		System.out.println();
		
		//B class는 인터페이스 A가 가지고 있는걸 오버라이딩을 했기 때문에 가져올 수 있다.
		B b = new B();
		b.method1();
		b.method2();
		
		//a라는 인터페이스의 메소드를 가지고 있기 때문에 가지고 올 수 있다.
		A a = b;
		a.method1();
		System.out.println();
		
		//인터페이스 A만 가져올 수 있다.
		//d도 b라는 a인터페이스를 구현한 b를 품고있기 때문에 사용이 가능하다.
		A a2 = d;
		a2.method1();
		System.out.println();
	}

}
