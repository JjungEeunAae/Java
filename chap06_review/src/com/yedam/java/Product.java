package com.yedam.java;

public class Product {
	// 상품을 의미한다.
	// 상품의 정보를 담는 클래스
	
	//필드 - 해당 클래스가 가져야하는 모든 정보
	private String proName; //상품명
	private int proPrice;   //상품가격
	
	
	
	//생성자 - 클래스를 기반으로 해서 인스턴스를 생성할 때 필요한 프로세스를 담고 있는 메소드
	public Product(String proName, int proPrice) {
		//this. ==> 해당 인스턴스를 의미
		//static 필드일 경우 this.를 사용할 수 없음
		this.proName = proName;
		this.proPrice = proPrice;
	}
	
	
	
	//메소드 - 해당 클래스가 가지고 있는 모든 기능 
	
	//------------setter - 값을 받아오는 것
	public void setProName(String proName) {
		this.proName = proName;
	}
	//-----------getter - 값을 보내는 것
	public String getProName() {
		return this.proName;
	}

	//------------setter - 값을 받아오는 것
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	//-----------getter - 값을 보내는 것
	public int getProPrice() {
		return this.proPrice;
	}
	
	
	
	
	
	
	
	
	
	
	
}
