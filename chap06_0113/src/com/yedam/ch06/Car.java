package com.yedam.ch06;

public class Car {
	//필드
	private int speed;
	private int maxSpeed;
	private String model;
	
	//생성자
	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.speed = 0; 
	}
	
	//getter
	//->값을 남한테 보내줄 때
	//setter
	//->값을 입력받아야 할 때
	
	//메소드
	public String getModel() {
		return this.model;
	} //getter
	
	public int getMaxSpeed() {
		return this.maxSpeed;
	} //getter
	
	public void setSpeed(int speed) {
		this.speed = speed;
	} //setter
	
	public int getSpeed() {
		return this.speed;
	} //setter
	
	
}
