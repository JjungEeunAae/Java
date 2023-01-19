package com.yedam.java.ch01;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator() {

			@Override
			public double plus(double x, double y) {
				return x+y;
			}
			
		};
		
		//람다식
		//위의 상황을 좀 더 간편하게 사용해보자는 취지이다
		//순수하게 메소드에 대해서만 정의함
		Calculator ramda = (x, y) -> x + y;
		
		//결과와 타입이 동일하게 출력된다
		System.out.println("cal : " + cal.plus(10.5 , 15.8));
		System.out.println(("ramda : " +ramda.plus(10.5, 15.8)));

	}

}
