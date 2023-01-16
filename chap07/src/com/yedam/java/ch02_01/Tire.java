package com.yedam.java.ch02_01;

public class Tire {
	//필드
	public int maxRortation;		//최대 회전수(타이어 수명)
	public int accumulatedRotation; //누적 회전수
	public String location;			//타이어의 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRortation = maxRotation;
	}
	
	//메소드
	//타이어 한바퀴 도는거
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRortation) {
			System.out.println(location + " Tire 수명 : " + (maxRortation - accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
