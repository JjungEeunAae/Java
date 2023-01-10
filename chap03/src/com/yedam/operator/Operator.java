package com.yedam.operator;

public class Operator {
	public static void main(String[] args) {
		//++num , num++
		int num = 0;
//		System.out.println(num++); //시행한 후에 증가, 0
//		System.out.println(++num); //시행하기 전에 증가, 2
//		
//		System.out.println(num--); //위에 있는 2가 내려옴, 실행한 후에 감소, 2
//		System.out.println(--num); //위에 있는 2가 내려옴, 실행하기 전에 감소, 0
		
		//논리 부정 연산자 ( ! ) = not
		boolean play = true;
//		System.out.println(play);
		
		play = !play; //부정이 되어 false
//		System.out.println(play);
		
		//비교 연산자(2종류) : true, false
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2); //t
		boolean result2 = (num1 != num2); //f
		boolean result3 = (num1 <= num2); //t
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		char char1 = 'A'; //65
		char char2 = 'B'; //66
		
		boolean result4 = (char1 < char2); //t
		System.out.println(result4);
		
		//논리 연산자
		// &&, || , !
		char charCode = 'A'; //65
		//A보다 크고 Z보다 작다.
		if(charCode >= 65 && charCode <=90) {
			System.out.println("대문자입니다");
		}
		
		if(charCode >= 97 && charCode <=122){
			System.out.println("소문자입니다");
		}
		
		// '0' = 48 , '9' = 57
		// <50+(!) => >=50 ===>50초과의 부정 -> 50이하
		// <-50+(!) => >50
		if(!(charCode<48) && !(charCode>57)) { // 48이상 이거나 57이하
			//charCode >= 48 && charCode <= 57
			System.out.println("숫자입니다");
		}
		
		
		//복합 대입 연산자
		int result = 0;
		
		result += 10;
		System.out.println("result : " + result); //10
		result -= 5;
		System.out.println("result : " + result); //5
		result *= 5;
		result /= 5;
		
		//삼황연산자
		int score = 80;
		char grade = score >= 80 ? 'B' : 'C';
		System.out.println(grade);
	}
}
