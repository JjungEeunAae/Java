package com.yedam.java.ch02_01;

public class CastingExample {

	public static void main(String[] args) {
		//두개가 상속 관계에 있다는 증거
		//자동 타입 변환이 된다는 증거
		Parent parent = new Child();
		parent.method1();
		parent.method2();
		//parent.method3();
		
		System.out.println();
		
		//강제타입변환
		//실행하는 주체 : child 클래스
		Child child = (Child)parent;
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		
		//빨간 줄같은 에러는 뜨지 않음(컴파일이 된다는 뜻)
		//출력하려고하면 에러가 뜸
		//왼쪽은 검색하고자 하는 변수 오른쪽은 내가 실제로 확인하고자 하는 클래스
		Parent pa = new Parent();
		if(pa instanceof Child) {
		Child ch = (Child)pa;
		ch.method1();
		ch.method2();
		ch.method3();
		} else {
			System.out.println("변수 pa의 인스턴스는 Child 클래스의 인스턴스가 아닙니다");
		}
	}

}
