package com.yedam.condition;
import java.util.Scanner;

public class Ifcondition {
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90 이상이고, 등급 A");
		}
		
		//실행문이 한 줄일때만 사용
		if(score >= 90)
			System.out.println("점수가 90 이상이고, 등급 A");
		
		//if-else
		if(score>=90) {
			System.out.println("점수가 90 이상 입니다");
			System.out.println("등급은 A 입니다");
		} else {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B 입니다");
		}
		
		//elst - if
		//if문(조건식을 여러개 사용 할 때)
		score = 70;
		if(score >= 90) {
			System.out.println("등급 A");
		} else if(score >= 80) {
			System.out.println("등급 B");
		} else if(score >= 70) {
			System.out.println("등급 C");
		} else {
			System.out.println("등급 D");
		}
		
		// random 값 추출
		// Random() ,  ** Math.random() **
		// 0 <= Math.random() < 1    === 0부터 1미만(0~0.9999999...)
		System.out.println(Math.random());
		// 0 * 10 <= Math.random() * 10 < 1 * 10
		// 0 <= Math.ramdom() * 10 < 10
		
		// int number = (int)5.12;  // 값 : 5
		
		//0 ~ 0.99999... => (int)0 ~ (int)9
		//(int)0 <= (int)Math.random()*10 < (int)10
		
		//0~9 => 1 ~ 10
		//(int)0 + 1 <= (int)Math.random() * 10 + 1<(int)10 + 1
		
		//주사위 번호 뽑기
						  // 0 <= x < 6... ===> int 미적용
						  // 0 <= x < 5 ===> int 적용(타입 강제변환)
		int number = (int)(Math.random() * 6) + 1;
		System.out.println(number);
		
		if(number==1) {
			System.out.println("1번 나옴");
		} else if(number ==2) {
			System.out.println("2번 나옴");
		}else if(number ==3) {
			System.out.println("3번 나옴");
		}else if(number ==4) {
			System.out.println("4번 나옴");
		}else if(number ==5) {
			System.out.println("5번 나옴");
		} else {
			System.out.println("6번 나옴");
		}
		
		//중첩 if문
		//data -> 조건 여러번 검색
//		int no = 10;
//		if(no % 2 == 0 ) {
//			if(no % 5 == 0) {
//				if(no % 10 ==0) {
//					System.out.println("no는 10의 배수입니다");
//				}
//			}
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수입력>");
		
		score = Integer.parseInt(sc.nextLine());
		String grade = "";
		
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		}
		
		System.out.println("획득한 학점 : " + grade);
		
		
		
		
		
		
	}
}
