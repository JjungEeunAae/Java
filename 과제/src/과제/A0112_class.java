package 과제;

public class A0112_class {
	// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
	// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
	// 1) 메뉴는 다음과 같이 구성하세요.
	// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
	// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
	// 3) 제품별 가격을 출력하세요.
	//	출력예시, "상품명 : 가격"
	// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
	// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
	
	//필드
		String productName; //상품명
		int price;          //상품가격
	//생성자
		A0112_class(){
			
		}
		A0112_class(String productName , int price){   //생성자를 만들긴 했으나 사용하지않음
			this.productName = productName;
			this.price = price;
		}
	//메소드
		void getInfo() {
			System.out.println("상품명: " + productName + ", " + "+상품가격: " + price);
		}
}
