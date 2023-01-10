package com.yedam.condition;

import java.util.Scanner;

public class SwtichCondition {
	public static void main(String[] args) {
		int number = (int)(Math.random()*6)+1;
		
		switch(number) {
			case 1:
				System.out.println("1번 나옴");
				break; //구문 나갈 때 쓰는거임
			case 2:
				System.out.println("2번 나옴");
				break;
			case 3:
				System.out.println("3번 나옴");
				break;
			case 4:
				System.out.println("4번 나옴");
				break;
			case 5:
				System.out.println("5번 나옴");
				break;
			case 6:
				System.out.println("6번 나옴");
				break;
		}
		
		//char 문자도 비교가 가능하다
		//break가 없으면 조건에 맞는 부분 밑부분까지 전부 다 출력됨
		char grade = 'B';
		String grade2 = "B";
		switch(grade2) {
			case "A":
				System.out.println("우수회원");
				break;
			case "B":
			case "b": // 두가지 조건을 동시에 비교하고 싶을 때 break 없이 기재하면 됨
				System.out.println("일반 회원");
				break;
			default:
				System.out.println("손님");
				break;
//			case 'C':
//				System.out.println("손님");
		}
		
		//입력한 성적을 등급으로 환산
		Scanner sc = new Scanner(System.in);
		//0~100 
		//99~90 A
		//89~80 B
		//79~70 C
		//미만은 D
		System.out.println("입력>"); //90,80,70,60
		int scores = Integer.parseInt(sc.nextLine());
	
		
		switch (scores/10) {
			case 10:
			case 9:
				System.out.println("A등급");
				break;
			case 8:
				System.out.println("B등급");
				break;
			case 7:
				System.out.println("C등급");
				break;
			default:
				System.out.println("D등급");
				break;
		}
		
		
	}
}
