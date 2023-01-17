package com.yedam.java.ch01_01;

public class SmartTelevisionExaple {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.search("네이버");
		tv.setVolume(-100);
		tv.setVolume(20);
		tv.turnOff();
		
		//구현관계에서도 자동타입변환이 가능함
		//각 구현클래스가 다 가지고 있기 때문에
		//구현클래스는 자기가 구현안 인터페이스의 일부로 대체될 수 있다.
		//클래스가아니라 인터페이스를 선언해서 사용하기도 함
		
		
		//기능을 제한하기 위함
		//구현클래스가 여러개의 인터페이스를 가지고 있기 때문에 기능이 많음
		//경우에 따라 정해진 인터페이스를 하나만 골라서 사용할 수 있음
		//클래스 자체가 아니라 내가 사용하고자 하는 대상에 대해서 타입을 선언함
		//자동타입변환은 인스턴스의 모든 기능의 일부만 사용할 수 있는 제한된 사항
		//이 것을 의도적으로 사용하기도 함
		//필드, 매개변수, 필요에 따라서 로컬변수로도 사용할 수 있음
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}
}
