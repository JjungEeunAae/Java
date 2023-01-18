package com.yedam.java.subject02;

import java.util.Scanner;

//Question 1]을 이용하여 랜덤게임 프로그램을 구현하라.
public class GameMenu {

	public static void main(String[] args) {
		//프로그램을 실행할 경우 50% 확률로 두 개의 게임 중 하나가 셋팅된다.
		//( RPGgame or ArcadeGame )
		Scanner sc = new Scanner(System.in);
		
		//참조변수 초기화
		//참조 변수가 힙 영역에서 가져올 번지주소가 없다는 상태를 말해주는 것
		Keypad keypad = null;
		
		//두 개의 정수만 있으면 되기 때문에 굳이 +1을 하지 않았다
		int random = (int)(Math.random()*2);
		if(random == 0) {			 
			keypad = new RPGgame();
		} else {
			keypad = new ArcadeGame();
		}
		
		
		boolean run = true;
		
		while(true) {
			System.out.println("=============================================================================================");
			System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println("=============================================================================================");
			
			System.out.print("choice>>");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				keypad.leftUpButton();
			}else if(selectNo == 2) {
				keypad.leftDownButton();
			}else if(selectNo == 3) {
				keypad.rightUpButton();
			}else if(selectNo == 4) {
				keypad.rightDownButton();
			}else if(selectNo == 5) {
				keypad.changeMode();
			}else if(selectNo == 0) {
				if(random == 0) {
					keypad = new ArcadeGame();
				} else {
					keypad = new RPGgame();
				}
			}else if(selectNo == 9) {
				run = false;
				System.out.println("EXIT");
				break;
			} else {
				System.out.println("영역을 벗어났습니다");
				System.out.println("다시 입력해주세요");
			}
		}
		
		//습관 들이기
		sc.close();
		
	}

}
