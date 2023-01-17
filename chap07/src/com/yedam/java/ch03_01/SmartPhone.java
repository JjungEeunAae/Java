package com.yedam.java.ch03_01;

public class SmartPhone extends Phone {

	//부모가 기본 생성자가 아니기 때문에
	//외부에서 값을 받을 수 있도록 처리를 해주어야한다.
	public SmartPhone(String ower) {
		super(ower);
	}
	
	public void internetSearch() {
		System.out.println("인터넷을 검색합니다");
	}
	
}
