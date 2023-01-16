package com.yedam.java.subject;
//StandardWeightInfo 클래스를 상속한다.
public class ObesityInfo extends StandardWeightInfo {
//메소드는 다음과 같이 정의한다.
	//필드
	
	//생성자
	
	//메소드
	
	public ObesityInfo(String name, int tallHeight, double weight) {
		super(name, tallHeight, weight);
	}

	//이름, 키, 몸무게와 비만도를 출력하는 기능
	public void getInformation() {
		System.out.printf("이름 : %s, 키 : %d, 몸무게 : %f", name, tallHeight, weight);
	}
	
	//표준체중을 구하는 기능
	public double getStandardWeight() {
	//( * 표준 체중 : (Height - 100) * 0.9 )
		double result = (height-100)*0.9;
		return result;
	}
	
	//비만도를 구하는 기능
	//( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
	public double getObesity() {
		return height;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
