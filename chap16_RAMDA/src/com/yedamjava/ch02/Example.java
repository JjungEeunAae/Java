package com.yedamjava.ch02;

public class Example {

	public static void main(String[] args) {
		//람다식
		//매개변수가 없는 경우
		Workable work = () -> {
			//실행코드가 두 줄 이상일 경우 중괄호에 묶기
			System.out.println("출근을 합니다");
			System.out.println("프로그래밍을 합니다");
		};
		work.work();
		
		/*
		 출근을 합니다
		 프로그래밍을 합니다
		*/
		
		//실행코드가 한 줄일땐 중괄호 생략 가능
		work = () -> System.out.println("퇴근을 합니다");
		work.work();
		/*
		  퇴근을 합니다
		*/
		
		//매개변수가 있는 경우
		//인터페이스에 타입이 선언되어있기 때문에 타입을 따로 선언하지 않아도 됨
		Speakable speak = (x) -> {
			System.out.println("현재 볼륨은 중간입니다");
			System.out.println("현재 재생되는 음악은 " + x + "입니다");
		};
		
		speak.speak("뉴진스 - HypeBoy");
		
		speak = x -> System.out.println("현재 재생되는 음악은 " + x + "입니다");
		speak.speak("김흥국 - 호랑나비");
		
		
		
		
		//리턴값이 있는 경우
		Calculator cal = (x,y) -> {
			int result = (int)(x+y);
			return result;
		};
		System.out.println("첫번째 방식 : " + cal.plus(5.8, 6.9));
		
		//한줄이면 중괄호를 생략할 수 있지만
		//리턴이 있으면 그게 불가능하다
		//이럴 경우 리턴 구문을 생략하면 된다
		cal= (x,y) -> (int)(x+y);
		System.out.println("두번째 방식 : " + cal.plus(5.8, 6.9));
		
		
		
	}


}
