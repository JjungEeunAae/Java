package 과제;

import java.util.Scanner;

public class A0112 {
	public static void main(String[] args) {
		// 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		
		
		Scanner sc = new Scanner(System.in);
		
		//상품 정보를 보관하는 배열
		A0112_class[] claAry = null;
		int claNum = 0;
		
		//while문을 활용하여 관리 프로그램 작성
		while(true) {
			// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
			System.out.println("===========================================================");
			System.out.println("1. 상품수 | 2. 상품 및 가격 입력 | 3. 제품별 가격 | 4. 분석 | 5. 종료");
			System.out.println("===========================================================");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.println("상품 수>");
				claNum = Integer.parseInt(sc.nextLine());
			}else if(selectNo == 2) {
				// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
				claAry  = new A0112_class[claNum];
				//상품 및 가격 입력
				for(int i = 0 ; i < claAry.length ; i++) {
					// A0112_class cal1 = new Student();
					claAry[i] = new A0112_class();
					System.out.println("상품명 >");
					claAry[i].productName = sc.nextLine();
					System.out.println("상품가격 >");
					claAry[i].price = Integer.parseInt(sc.nextLine());
				}
			}else if(selectNo==3) {
				// 3) 제품별 가격을 출력하세요.
				//출력예시, "상품명 : 가격"
				for(A0112_class cla : claAry) {
					cla.getInfo();
					System.out.println();
				}
			}else if(selectNo==4) {
				//4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
				//최고 가격을 가진 제품
				int max = 0;
				for(int i = 0 ; i < claAry.length ; i++) {
					max = claAry[0].price;
					System.out.println("최고 금액을 가진 제품 : " + max);
				}
				//최고 가격을 가진 제품을 제외한 제품들의 총 합
			}else if(selectNo==5) {
				// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
				System.out.println("시스템 종료");
				break;
			}
		}
	}

}
