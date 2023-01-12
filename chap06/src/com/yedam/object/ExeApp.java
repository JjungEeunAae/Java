package com.yedam.object;

public class ExeApp {
	public static void main(String[] args) {
		//Book 클래스
		//책의 종류, 가격, 출판사, 도서번호의 정보
		//정보는 원하는 방식 아무거나 활용해서 정보 입력
		//getInfo 메서드 객체가 가진 정보를 출력
		
		//getInfo 출력 예시
		//혼자 공부하는 자바
		//# 내용
		//1) 종류 : 학습서
		//2) 가격: 24000원
		//3) 출판사 : 한빛미디어
		//4) 도서번호 : yedam-001
		
		//다른 예시
		//이것이 리눅스다
		//혼자 공부하는 자바
		//# 내용
		//1) 종류 : 학습서
		//2) 가격: 32000원
		//3) 출판사 : 한빛미디어
		//4) 도서번호 : yedam-002
		
//		Book b1 = new Book(24000,"yedam-001");
//		System.out.println("혼자 공부하는 자바\n# 내용");
//		b1.getInfo();
//		
//		System.out.println();
//		
//		Book b2 = new Book(32000,"yedam-002");
//		System.out.println("이것이 리눅스다\n# 내용");
//		b2.getInfo();
		
//		Car c1 = new Car();
//		System.out.println("c1.company : " + c1.company);
//		System.out.println();
//		
//		Car c2 = new Car("자가용"); //원하는 생성자 골라와서 객체를 사용해도 됨
//		//Car class 2번
//		System.out.println("c2.commpany : " + c2.company);
//		System.out.println("c2.model : " + c2.model);
		
		Calculator ca = new Calculator();
		//결과 값을 받을 변수 초기화
//		double result = ca.sub(1, 1);
//		System.out.println(result);
//		
//		ca.powerOn();
//		ca.powerOff();
		
		int sumResult = ca.sum2(1,2,3,4,1,56,6,262);
		System.out.println("총 합 : " + sumResult);
		sumResult = ca.sum2(1,2,3,4,5);
		System.out.println("총 합 : " + sumResult);
		System.out.println();
		
		Score sc = new Score(50,30,70);
		sc.getInfo();
		System.out.println();
		
		
		//method
		System.out.println("A"); //문자열
		System.out.println(1); //숫자
		System.out.println('C'); //문자
		System.out.println(0.1); //실수
		System.out.println(true); //논리
		System.out.println();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
