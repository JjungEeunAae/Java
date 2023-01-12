package com.yedam.object;

public class Book {
	//필드
	String kinds = "학습서"; //종류
	int amount; //금액
	String publishing = "한빛미디어"; //출판사
	String bookNum; //도서번호
	
	//사용자
	Book(int amount,String bookNum){ //금액, 도서번호
		this.amount = amount;
		this.bookNum = bookNum;
	}
	
	//매개 변수 타입에 따른 생성자 오버로딩
	Book(String kinds, String bookNum){
		this.kinds = kinds;
		this.bookNum =bookNum;
	}
	
	//매개 변수 순서에 따른 생성자 오버로딩
	//데이터 타입 기준으로 순서를 따짐
	Book(String kinds, int amount){
		this.amount = amount;
		this.kinds = kinds;
	}
	
	//매개 변수 개수
	Book(int amount){
		this.amount = amount;
	}
	
	//기본 생성자(오버로딩에 속함)
	Book(){
		
	}
	
	
	//메서드
	void getInfo() {
		System.out.println("1) 종류 : " + kinds);
		System.out.println("2) 가격 : " + amount + "원");
		System.out.println("3) 출판사 : " + publishing);
		System.out.println("4) 도서번호 : " + bookNum);
	}
	

	
	
	
	
	
	
	
	
	
	
}
