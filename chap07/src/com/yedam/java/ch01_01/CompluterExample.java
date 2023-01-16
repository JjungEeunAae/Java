package com.yedam.java.ch01_01;

public class CompluterExample {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		//클래스에 파이값을 임의로 주었기 때문에 정확한 원둘레가 아님
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		
		//원둘레를 조금 더 정확하게 구하고 싶다면
		//computer.java 참고
		
		//오버라이딩 클래스 호출
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r));
		System.out.println();
		
		
		
	}
}
