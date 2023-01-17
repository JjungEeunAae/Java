package com.yedam.java.subject;
//Human 클래스를 정의한다.
public class Human {
	//필드
	public String name;			//이름
	public int height;  	//키
	public double weight;		//몸무게
	
	//생성자
	//이름과 키, 몸무게를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
	public Human(String name, int tallHeight, double weight) {
		this.name = name;
		this.height = tallHeight;
		this.weight = weight;
	}
	
	//메소드
	//메소드는 다음과 같이 정의한다.
	public void getInformation() {
		System.out.printf("이름 : %s, 키 : %d, 몸무게 : %4.1f", name, height, weight);
	}
}
