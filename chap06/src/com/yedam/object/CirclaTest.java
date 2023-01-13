package com.yedam.object;

public class CirclaTest {
	public static void main(String[] args) {
		//반지름이 5인 원의 면적 계산
		//static = 정적 = 공유
		//클래스파일 로딩 시점에 메모리 할당이 되기 때문에
		//객체 생성(new)없이 클래스명으로 스태틱 필드 접근이 가능
		System.out.println("static과 final을 사용한 값: "+Circle.pi); 
		//circla 객체 생성
		Circle cir = new Circle(5);
		//area
		double result = cir.area();
		//결과 출력
		System.out.println(result);
		
		
		Circle cir2 = new Circle();
		//cir2.r = 10;
		
		//싱글톤
		CircleSingle cir3 = CircleSingle.getInstance();
		CircleSingle cir4 = CircleSingle.getInstance();
		
		//CircleSingle cir5 = new CircleSingle(); //접근불가능
		
		System.out.println(cir3 == cir4);
	}
}
