package com.yedam.java.ch01;

public class AnonymousExample {

	public static void main(String[] args) {
		
		//익명객체 -> 상속과 구현 관계에 있는 객체를 익명으로 사용하는 것
		//상속 -> 익명 자식 객체
		//구현 -> 익명 구현 객체
		
		//인스턴스가 Phone이 아니라 새롭게 만들어진 애가 존재하고 있음
		Phone test = new Phone() {    	 	  // ----> 익명구현객체
			double version = 1.4; 			 //변수선언 상관없음
			public double versionUpdate(){   //내부에서 사용하는거라고 인식함
				return version + 0.1;
			}
			@Override
			public void turnOn() {
				System.out.println("전원을 켭니다");
				
			}

			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다");
				
			}

			@Override
			public void service() {
				System.out.println("현재버전 : " + versionUpdate());
				System.out.println("테스트 기능입니다");
				
			}
			
		};
		
		test.service();
		
		//일시적으로 내용을 정의하는거지 재사용이 불가하다
		//심지어 내가 지금 들고있는 얘들에 대해서도 다시 못쓴다
		//강제타입변환으로 돌려서 쓰려고해도 불가능하다
		//왜냐하면 원래 이름이 없기 때문이다
		//일시적으로 사용하고자 할 때 별도의 클래스를 만들지 않고 선언하는 그 순간만 익명객체를 사용한다
	}

}
