package 과제;

import java.util.Scanner;

public class A0112_0113 {
	// 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
	// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
	// 1) 메뉴는 다음과 같이 구성하세요.
	public static Scanner sc = new Scanner(System.in);
	public static int meunSelect(){
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		System.out.println("===========================================================");
		System.out.println("1. 상품수 | 2. 상품 및 가격 입력 | 3. 제품별 가격 | 4. 분석 | 5. 종료");
		System.out.println("===========================================================");
		return 0;
	}
	public static int meunOne() {
		System.out.println("상품 수>");
		claNum = Integer.parseInt(sc.nextLine());
		return 0;
	}
	public static int meunTwo() {
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
		return 0;
	}
	public static int meunThree() {
		// 3) 제품별 가격을 출력하세요.
		//출력예시, "상품명 : 가격"
		for(A0112_class cla : claAry) {
			cla.getInfo();
			System.out.println();
		}
		return 0;
	}
	public static int meunFour() {
		//4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		int sum = 0;
		int max = 0;
		//제품명 받을 변수
		String item = "";
		for(A0112_class temp : claAry) { //향상된 for문
			sum += temp.price;           //타입 변수 : 배열 /   실행문
			if(max<temp.price) {         //배열이 끝날 때까지 실행함
				max = temp.price;
				item = temp.productName;
			}
		}
		System.out.println("입력한 상품중 제일 비싼건 "+ item + ", " + max + "원");
		System.out.println("그 외 상품의 합계 : " + (sum-max) + "원");
		return 0;
	}
	public static int meunFive() {
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		System.out.println("시스템 종료");
		return 0;
	}
	
	//상품 정보를 보관하는 배열
	static A0112_class[] claAry = null;
	static int claNum = 0;
	
	//--main--//
	public static void main(String[] args) {
		//while문을 활용하여 관리 프로그램 작성
		while(true) {
			meunSelect();
			int selectNo = Integer.parseInt(sc.nextLine());
			if(selectNo == 1) {
				meunOne();
			}else if(selectNo == 2) {
				meunTwo();
			}else if(selectNo==3) {
				meunThree();
			}else if(selectNo==4) {
				meunFour();
			}else if(selectNo==5) {
				meunFive();
				break;
			}
		}
		
	}

}
