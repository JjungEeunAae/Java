package com.yedam.loop;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		//1~100사이의 2의 배수
//		int i = 0;
//		while( i <= 100 ) {
//			if( i % 2 == 0) {
//			System.out.println(i);
//			}
//			i++;
//		}
		
		
		//계산기 프로그램
		//무한루프 조건으로 프로그램 실행
		//무한루프를 종료시켜줘야하는 무언가가 필요함
		//event(trigger)프로그램 종료 --> break를 사용
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 종료");
			//기재하는 숫자에 따라 연산자 실행
			System.out.println("입력>");
			
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) { //조건이 true여야만 실행이 가능함
				case 1 :
					System.out.println("더하고자 하는 두 수를 입력>");
					System.out.println("1>");
					int num1 = Integer.parseInt(sc.nextLine());
					System.out.println("2>");
					int num2 = Integer.parseInt(sc.nextLine());
					System.out.println(num1 + " , " + num2 + " 의 결과 = " + (num1+num2));
					break;
				case 2 :
					System.out.println("빼고자 하는 두 수를 입력>");
					System.out.println("1>");
					int num3 = Integer.parseInt(sc.nextLine());
					System.out.println("2>");
					int num4 = Integer.parseInt(sc.nextLine());
					System.out.println(num3 + " , " + num4 + " 의 결과 = " + (num3-num4));
					break;
				case 3 :
					System.out.println("곱하는 하는 두 수를 입력>");
					System.out.println("1>");
					int num5 = Integer.parseInt(sc.nextLine());
					System.out.println("2>");
					int num6 = Integer.parseInt(sc.nextLine());
					System.out.println(num5 + " , " + num6 + " 의 결과 = " + (num5*num6));
					break;
				case 4 : //조건이 false가 나와야 종료가 진행됨
					run = false;
					break;
				default:
					System.out.println("1~4 사이의 수를 입력해주세요");
					break;
			}
			
			//break; //무한루프를 종료 할 수 있는 구문을 꼭 적어야 함
		}
		System.out.println("end of prog"); //Unreachable code -> 무한로프를 돌고 있기 때문에 밑으로 내려올 수 없는 상황이라 해당 에러가 뜸
		
		//게임 만들기
		//컴퓨터와 가위 바위 보
		//앞, 뒤 맞추기
		//한판에 500원
		int money;
		System.out.println("=====insert coin=====");
		money = Integer.parseInt(sc.nextLine());
		//10000 -> 20번
		//1500 -> 3번
		boolean flag = true;
		
		//넣은 금액이 500보다 클 때 실행하거나 게임이 실행가능한 상태일 때 while문을 실행
		while(money > 500 && flag){ //넣은 금액을 대비해서 조건을 넣어준다.
			System.out.println((money/500)+"번의 기회가 남았습니다");
			System.out.println("1. 가위바위보 | 2. 앞 뒤 맞추기 | 3. 종료");
			
			System.out.println("입력>");
			int gameNo = Integer.parseInt(sc.nextLine());
			
			switch(gameNo) {
				case 1:
					//컴퓨터와 가위 바위 보
					//사용자가 입력하는건 '가위' '바위' '보' || String.equals(내용)
					//컴퓨터는 가위 -> 1, 바위 -> 2, 보 -> 3
					//컴퓨터가 내는 가위, 바위, 보 => 랜덤 값 추출
					//입력한 값이랑 비교해서 이겼다, 졌다, 비겼다.
					
					//어떤 반복문?어떤 변수?가위 바위 보 어떻게 조건식을 생각해서 만들어야할까?
					//for? while? do-while? // money, menu // 로직(알고리즘)
					
					System.out.println("가위, 바위, 보 중에 하나를 입력하세요 >");
					String RSP = sc.nextLine(); //사용자가 입력할 구간
					
					int randomNo = (int)(Math.random()*3)+1;
					
					if(RSP.equals("가위")) {
						//가위 == 1
						if(randomNo == 1) {
							//사용자 : 가위 , 컴퓨터 : 1(가위)
							System.out.println("비겼다");
						} else if(randomNo == 2) {
							//사용자 : 가위 , 컴퓨터 : 2(바위)
							System.out.println("졌다");
						} else if(randomNo == 3) {
							//사용자 : 가위 , 컴퓨터 : 3(보)
							System.out.println("이겼다");
						}
					} else if(RSP.equals("바위")) {
						//바위 == 2
						if(randomNo == 1) {
							//사용자 : 바위 , 컴퓨터 : 1(가위)
							System.out.println("이겼다");
						} else if(randomNo == 2) {
							//사용자 : 바위 , 컴퓨터 : 2(바위)
							System.out.println("비겼다");
						} else if(randomNo == 3) {
							//사용자 : 바위 , 컴퓨터 : 3(보)
							System.out.println("졌다");
						}
					} else if(RSP.equals("보")) {
						//보 == 3
						if(randomNo == 1) {
							//사용자 : 보 , 컴퓨터 : 1(가위)
							System.out.println("졌다");
						} else if(randomNo == 2) {
							//사용자 : 보 , 컴퓨터 : 2(바위)
							System.out.println("이겼다");
						} else if(randomNo == 3) {
							//사용자 : 보 , 컴퓨터 : 3(보)
							System.out.println("비겼다");
						}
					}
					//게임 한판에 500원이니까 1판 당 500원씩 차감하는 구간
					money -= 500;
					break;
				case 2:
					//컴퓨터와 앞 뒤 맞추기
					System.out.println("앞, 뒤 둘 중 하나를 입력해주세요");
					String FrontBack = sc.nextLine(); // 단어 입력할 수 있는 공간
					int randomstr = (int)(Math.random()*2)+1;
					//앞 == 1
					if(FrontBack.equals("앞")) {
						//사용자 : 앞 / 컴퓨터 : 앞
						if(randomstr == 1) {
							System.out.println("정답입니다");
						} else if(randomstr == 2) {
							//사용자 : 앞 / 컴퓨터 : 뒤
							System.out.println("틀렸습니다");
						}
						//뒤 == 2
					} else if(FrontBack.equals("뒤")) {
						//사용자 : 뒤 , 컴퓨터 : 앞
						if(randomstr == 1) {
							System.out.println("틀렸습니다");
						} else if(randomstr == 2) {
							//사용자 : 뒤 , 컴퓨터 : 뒤
							System.out.println("정답입니다");
						}
					}
					money -= 500;
					break;
				case 3:
					//강제종료
					flag = false;
					System.out.println("게임종료");
					break;
				default:
					System.out.println("없는 메뉴업니다 다시 입력하세요");
					break;
			}
			//500단위로 입력하지 않았을 때를 대비한 구간
			//투입한 금액이 다 소진 되었을 때
			if(money < 500) {
				System.out.println("금액부족");
				System.out.println("게임종료");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
