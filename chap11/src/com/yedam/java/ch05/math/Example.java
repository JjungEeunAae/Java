package com.yedam.java.ch05.math;

public class Example {
	public static void main(String[] args) {
		//abs() : 절대값
		//음수와 양수 상관없음
		System.out.println("-2.14의 절대값 : " + Math.abs(-2.14));		//음수
		System.out.println("-2.14의 절대값 : " + Math.abs(2.14));		//양수
		
		System.out.println();
		
		//max() : 최대값 , min() : 최소값
		System.out.println("3.8, 6.7 중 최대값 : " + Math.max(3.8, 6.7));
		System.out.println("3.8, 6.7 중 최소값 : " + Math.min(3.8, 6.7));
		
		System.out.println();
		
		// ceil() : 올림값
		// 소수점을 올린다
		System.out.println("5.3의 올림값 : " + Math.ceil(5.3));	//양수
		System.out.println("5.3의 올림값 : " + Math.ceil(-5.3));	//음수
		
		System.out.println();
		
		// floor() : 버림값
		// 소수점을 버린다
		System.out.println("5.3의 버림값 : " + Math.floor(5.3));	//양수
		System.out.println("5.3의 버림값 : " + Math.floor(-5.3));	//음수
		
		System.out.println();
		
		//round() 반올림값
		//0.5 이상을 올림한다
		//음수일 때는 반대로 생각
		System.out.println("5.3의 반올림값 : " + Math.round(5.3));	//양수
		System.out.println("5.5의 반올림값 : " + Math.round(-5.5));	//음수
		System.out.println("4.6의 반올림값 : " + Math.round(-4.6));	//음수
		
		System.out.println();
		
		//rint() : 반올림값
		//0.6 기준으로 가까운 정수의 실수값으로 변환
		//연속적으로 반올림을 시켜버리면 원래 가지고 있는 값과 오차가 있는 바람에 rint가 생겼다
		//최대한 반복 사용을 했을 때 그 오차를 줄이기 위해 홀수 일 때 짝수 일 때의 기준이 나누어져있음
		//소수점 앞에 있는 값이 짝수냐 홀수냐에 따라 다름
		//정수가 짝수일 때는 6이상, 홀수일 때는 5이상
		System.out.println("5.5의 가까운 정수의 실수값 : " + Math.rint(5.5));
		System.out.println("5.6의 가까운 정수의 실수값 : " + Math.rint(5.6));
		System.out.println("4.5의 가까운 정수의 실수값 : " + Math.rint(4.5));
		System.out.println("4.6의 가까운 정수의 실수값 : " + Math.rint(4.6));
		
		System.out.println("-4.6의 가까운 정수의 실수값 : " + Math.rint(-4.6));
		System.out.println("-4.3의 가까운 정수의 실수값 : " + Math.rint(-4.3));
		
	}
}
