package com.yedam.object;

public class Car {
	//필드
	String company = "현대";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){
		
	}
	
	Car(String model){ //2번
		//this.model = model;
		this(model , "은색" , 250); //4번 사용자를 호출
	}
	
	Car(String model, String color){ //3번
		//this.model = model;
		//this.color = color;
		this(model, color, 250); //4번 사용자를 호출
	}
	
	Car(String model, String color, int maxSpeed){ //4번
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	//메서드
	
	
}
