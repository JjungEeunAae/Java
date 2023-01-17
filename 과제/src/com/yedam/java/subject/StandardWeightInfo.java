package com.yedam.java.subject;

public class StandardWeightInfo extends Human {
	//필드
	
	//생성자
	public StandardWeightInfo(String name, int height, double weight) {
		super(name, height, weight);
	}
	
	//메소드
	//이름, 키, 몸무게와 표준체중을 출력하는 기능
	public void getInformation() {
		System.out.printf("%s님의 신장 %f, 몸무게 %d, 표준체중\n",
							name, height, weight);
	}
	
	//표준체중을 구하는 기능
	public double getStandardWeight() {
	//( * 표준 체중 : (Height - 100) * 0.9 )
		double result = (height-100)*0.9;
		return result;
	}
	
	
}
