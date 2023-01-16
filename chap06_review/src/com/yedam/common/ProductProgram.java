package com.yedam.common;
import java.util.Scanner;
import com.yedam.java.*;

public class ProductProgram {
	public ProductProgram() {
		Scanner sc = new Scanner(System.in);
		
		//클래스 배열
		Product[] list = null;
		
		int productNum=0;
		
		boolean run = true;
		while(run) {
			System.out.println("===1.상품수 | 2.상품 및 가격 입력 | 3.제품별 가격 | 4.분석 | 5.종료===");
			System.out.print("선택>");
			
			//nextLine, nextInt, next 입력받는 방법이 다름
			//혼용해서 쓰려고하면 에러가 발생함
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				//상품수(배열의 크기)
				System.out.print("상품 수 >");
				//배열로 진행할 시, 배열의 크기를 지정해야함
				productNum = Integer.parseInt(sc.nextLine());
				list = new Product[productNum];
			}else if(selectNo == 2) {
				//상품 및 가격 입력
				for(int i = 0 ; i < list.length ; i++) {
					System.out.print("상품명> ");
					String name = sc.nextLine();
					System.out.print("상품가격>");
					int price = Integer.parseInt(sc.nextLine());
					
					Product product = new Product(name, price);
					
					list[i] = product;
				}
			}else if(selectNo == 3) {
				//제품별 가격
				for(Product product : list) {
					System.out.printf("%s : %d\n" , product.getProName(), product.getProPrice());
				}
			}else if(selectNo == 4) {
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
			}else if(selectNo == 5) {
				System.out.println("프로그램 종료");
				run = false;
			}else {
				System.out.println("메뉴를 잘못 선택 했습니다");
			}
			
			
		}
	}
}
