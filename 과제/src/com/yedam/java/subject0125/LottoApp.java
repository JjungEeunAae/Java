package com.yedam.java.subject0125;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class LottoApp {
	HashSet<Integer> lotto = new HashSet<Integer>();
	
	public LottoApp() {
		run();
	}

	private void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액 투입>");
		int money = sc.nextInt();
		
		if(money < 1000) {
			System.out.println("금액부족");
		}
		
		boolean run = true;
		
		while (money >= 1000 && run) {
			
			System.out.println("1.로또생성 | 2.로또조회 | 99.프로그램종료");
			System.out.println("입력>");

			int menuNum = sc.nextInt();
			
			switch (menuNum) {
			case 1:
				//로또 생성
				System.out.println("로또 번호 생성>");
				for(int i = 0 ; lotto.size() < 6 ; i++) {
					int lottoNum = (int)(Math.random()*45)+1;
					lotto.add(lottoNum);
				}
				break;
			case 2:
				//로또 조회(내가 투입한 금액과 출력 번호)
				List<Integer> list = new ArrayList<>(lotto);

				for(int i = 0 ; i < money/1000 ; i++) {
					System.out.print("로또번호 : " + list + "\n");
				}
				//Collections.sort(list);
				//System.out.println("로또 번호 : " + list);
				System.out.println("투입한 금액 : " + money);
				break;
			case 99:
				run = false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("없는 메뉴입니다");
			}
			
			if(money < 1000) {
				System.out.println("금액부족");
			}

		}

	}

}