package com.yedam.java;

import java.util.Scanner;

public class ProductProgram {
	//필드
	private Scanner sc = new Scanner(System.in);
	private Product[] list = null;

	//생성자
	public ProductProgram() {
		while(true) {
			//메뉴출력
			menuPrint();
			//메뉴선택
			int selectNo = menuSelect();
			//동작
			if(selectNo == 1) {
				//상품 수 입력
				inputProudctNum();
			} else if(selectNo ==2) {
				//상품 및 가격 입력
				proudctInfo();
			} else if(selectNo ==3) {
				//제품별 가격
				proudctPrint();
			} else if(selectNo ==4) {
				//분석
				productAnalysis();
			} else if(selectNo ==5) {
				//프로그램 종료
				exit();
				break;
			} else {
				//잘못된 메뉴를 선택할 경우 안내메세지 출력
				printErrorMessage();
			}
		}
	}
	
	//메소드
	
	//else
	private void printErrorMessage() {
		System.out.println("메뉴를 잘못 선택 했습니다");
	}
	
	//else if 5
	private void exit() {
		System.out.println("프로그램 종료");
	}
	
	//else if 4
	private void productAnalysis() {
		//최대값
		int max = 0;
		//최대값을 가지고 있는 제품명을 가르키는 인덱스값
		int productIndex = 0;
		
		//최대가격을 가진 제품과 금액을 구하는 for문
		for(int i = 0 ; i < list.length ; i++) {
			Product product = list[i];
			if(max<product.getProPrice()) {
				//제품의 최대 가격
				max = product.getProPrice();
				//제품명
				productIndex = i;
			}
		}
		//최대 가격을 제외한 나머지 제품들의 합
		int sum = 0;
		for(int i = 0 ; i < list.length ; i++) {
			//list의 배열 중 최대가격을 가진 인덱스를 건너뛰자
			if( i == productIndex) continue;
			
			//for문 안에 들어가있는 코드들
			Product product = list[i];
			sum += product.getProPrice();
		}
		
		//list[i]를 불러와서 출력하는게 아님
		//해당 변수가 가지고 있는 i번째를 호출하는 것과 같음
		System.out.println("최고 가격을 가진 제품은 " + list[productIndex].getProName() + "입니다");
		System.out.println("최고 가격을 제외한 제품들의 가격은 " + sum + "입니다");
	}

	//else if 3
	private void proudctPrint() {
		//제품별 가격
		for(Product product : list) {
			System.out.printf("%s : %d\n" , product.getProName(), product.getProPrice());
		}
	}
	
	//else if 2
	private void proudctInfo() {
		//상품 및 가격 입력
		for(int i = 0 ; i < list.length ; i++) {
			System.out.print("상품명> ");
			String name = sc.nextLine();
			System.out.print("상품가격>");
			int price = Integer.parseInt(sc.nextLine());
			
			Product product = new Product(name, price);
			
			list[i] = product;
		}
	}
	
	//else if 1
	private void inputProudctNum() {
		//상품수(배열의 크기)
		System.out.print("상품 수 >");
		//배열로 진행할 시, 배열의 크기를 지정해야함
		int productNum = Integer.parseInt(sc.nextLine());
		list = new Product[productNum];
	}
	
	//메뉴선택
	private int menuSelect() {
		System.out.print("선택>");
		return Integer.parseInt(sc.nextLine());
	}
	
	//메뉴출력
	private void menuPrint() {
		System.out.println("===1.상품수 | 2.상품 및 가격 입력 | 3.제품별 가격 | 4.분석 | 5.종료===");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
