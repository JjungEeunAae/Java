package com.yedam.variable;

public class Variable { //클래스 블록
	public static void main(String[] args) { //메소드 블록
		int hour = 3;
		int minute = 5;
		//콘솔창에 출력해주는 방법(=console.log)
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		//콘솔창에 출력해주는 방법(=console.log)
		System.out.println("총"+totalMinute+"분");
		
		//변수만 선언하고 값을 넣지않으면 오류가 발생한다(변수 초기화 필수)
		int value = 0;
		int result = value + 10;
		System.out.println(result);
		
		int x = 3;
		int y = 5;
		//x -> y의 값으로 변경
		//y -> x의 값으로 변경
//		y = x;
		//x = x, y = x;
		//대신 담아줄 수 있는 변수.
		int z = 0;
		//x의 데이터를 미리 z에 담아두고,
		z = x; //1)x -> z (z = 3)
		x = y; //2)y -> x (x = 5)
		y = z; //3)z -> y (y = 3)
	}
}
