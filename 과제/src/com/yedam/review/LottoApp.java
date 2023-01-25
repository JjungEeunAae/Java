package com.yedam.review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {
	Scanner sc = new Scanner(System.in);
	int menu = 0;
	List<int[]> list = new ArrayList<>();
	public LottoApp() {
		run();
		
	}
	private void run() {
		
		while (menu != 99) {
			
			System.out.println("1.로또 생성 | 2.로또 조회 | 99.프로그램 종료");
			System.out.println("입력>");
			
			menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				//로또 생성
				int money;
				System.out.println("money 투입>");
				money = Integer.parseInt(sc.nextLine());
				
				//랜덤 데이터 뽑기(배열에 데이터 저장)
				int[] lottoNum = new int[6];
				
				for(int i = 0 ; i < 6 ; i++) {
					//랜덤 데이터 뽑기
					lottoNum[i] = (int)(Math.random()*45)+1;
					//인덱스 0일 때 중복체크 할 필요가 없다
					if(i > 0) {
						//인덱스 1이상 일 때 중복체크
						for(int j = 0 ; j < i; j++) {
							//방금 생성한 랜덤값과 내가 가지고 있는 값과 같으면
							if(lottoNum[j] == lottoNum[i]) {
								//다시 1값 -1 (다시 랜덤값 생성)
								i -= 1;
								break;
							}
						}
					}
				}
				
				for(int i = 0 ; i < (money / 1000) ; i++) {
					list.add(lottoNum);
				}
				break;
			case 2:
				//로또 조회(내가 투입한 금액과 출력 번호)
				System.out.println("구매한 금액> " + (list.size()*1000) + "원");
								// list = int[] 이다 , 로또번호
				for(int i = 0 ; i < list.size(); i++) {
					System.out.print((i % 5 + 1) + "번 > ");
					
					for(int j = 0 ; j < 6 ; j++) {
						//배열이 가지고 있는 로또번호를 차례대로 출력
						System.out.print(list.get(i)[j] + " ");
					}
					
					System.out.println();
					
					if((i + 1) != 0 && (i + 1) % 5 == 0) {
						System.out.println("-------------------");
					}
					
				}
				break;

			case 99:
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}