package com.yedam.java.ch01_01;

//자식클래스
//생성자를 호출하게 되면 첫번째로 부모 생성자를 호출한다

public class DmbCellPhone extends CellPhone{
	//필드
	int channel;
	
	//부모 클래스에 동일한 필드값이 있어도 오류가 나지 않는다.
	//클래스는 기본적으로 독립적이기 때문에 가능하
	//String model;
	
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		//부모의 필드도 내거처럼 쓸 수 있다
		//내것이 아니라 부모 클래스가 가지고있는 필드를 접근할 수 있다.
		
		//super() -> 부모를 요청하는 것
		//자신의 클래스에 중복되는 필드나 메소드가 있을 때 부모껄 가져와라라는 의미
		super(model, color);
		//this.model = model;
		//this.color = color;
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
