package com.home.review;

import java.util.Scanner;

public class RE0110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문제1) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
		// 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
		// 제1사분면 : x>0, y>0
		// 제2사분면 : x<0, y>0
		// 제3사분면 : x<0, y<0
		// 제4사분면 : x>0, y<0
		
//		System.out.println("a 입력>");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.println("b 입력>");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		if(a>0) {
//			if(b>0) {
//				System.out.println("1");
//			} else if(b<0) {
//				System.out.println("4");
//			}
//		} else if(a<0) {
//			if(b>0) {
//				System.out.println("2");
//			} else if(b<0){
//				System.out.println("3");
//			}
//		}
		
		// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
		// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
		// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
		// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
		// HiNT : 이중 IF문 사용
//		boolean run = true;
//		while(true) {
//			System.out.println("연도입력>");
//			int year = Integer.parseInt(sc.nextLine());
//			if(year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
//				System.out.println("윤년");
//			}else {
//				System.out.println("윤년이 아님");
//				System.out.println("종료");
//				run = false;
//				break;
//			}
//			
//		}
		
		// 문제3) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 사용자 어떤 값을 가져야 이길 수 있는 지를 출력하도록
		// 구현하세요.
		// 예를 들어, 가위가 주어졌을 때 "이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요.
		// 한 단어를 입력받을 경우 Scanner객체의 next() 함수를 사용하면 됩니다.
//		boolean run2 = true;
//		while(true) {
//			int ramdom = (int)(Math.random()*3)+1;
//			System.out.println(ramdom);
//			System.out.println("가위 바위 보! >");
//			String srt = sc.nextLine();
//			
//			switch(srt){
//				case "가위":
//					if(ramdom == 1) {
//						//사용자 : 가위 , 컴퓨터 : 가위
//						System.out.println("비겼습니다");
//					}else if(ramdom == 2) {
//						//user : 가위 , com : 바위
//						System.out.println("졌습니다");
//					}else if(ramdom == 3) {
//						System.out.println("이겼습니다");
//					}
//					break;
//				case "바위":
//					if(ramdom == 1) {
//						//사용자 : 바위 , 컴퓨터 : 가위
//						System.out.println("이겼습니다");
//					}else if(ramdom == 2) {
//						//user : 바위 , com : 바위
//						System.out.println("비겼습니다");
//					}else if(ramdom == 3) {
//						//user : 바위 , com : 보
//						System.out.println("졌습니다");
//					}
//					break;
//				case "보":
//					if(ramdom == 1) {
//						//사용자 : 보 , 컴퓨터 : 가위
//						System.out.println("졌습니다");
//					}else if(ramdom == 2) {
//						//user : 보 , com : 바위
//						System.out.println("이겼습니다");
//					}else if(ramdom == 3) {
//						//user : 보 , com : 보
//						System.out.println("비겼습니다");
//					}
//					break;
//				case "종료":
//					System.out.println("게임을 종료합니다");
//					break;
//				default:
//					System.out.println("가위, 바위, 보만 입력하여야 합니다");
//					System.out.println("종료를 원한다면 종료를 입력해주세요");
//					run2 = false;
//					break;
//
//			}
//			if(srt.equals("종료")) {
//				System.out.println("종료");
//				break;
//			}
//
//		}
		
		// 문제5) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6
		
		System.out.println("m 입력>");
		int m = Integer.parseInt(sc.nextLine());
		System.out.println("n 입력>");
		int n = Integer.parseInt(sc.nextLine());
		
		
		for(int i = 1 ; i <= n ; i++) {
			System.out.println(m + "x" + i + " = " + (i*m));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
