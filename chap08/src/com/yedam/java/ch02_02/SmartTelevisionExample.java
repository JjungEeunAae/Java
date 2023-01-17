package com.yedam.java.ch02_02;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		//자동타입변환
		//100% 사용하지 못함
		
		// RemoteControl	Searchable
		//			↑	    ↑			 상속
		//			 SmartTV
		//				↑				 상속
		//		SmartTelevisionExample
		
		//기능에 제한을 건다.
		//가지고 있는 것들 중에서 RemoteControl의 것만 사용 할게
		RemoteControl rc = tv;
		rc.turnOff();
		
		//가지고 있는 것들 중에서 Searchable의 것만 사용할게
		Searchable searchable = tv;
		searchable.search("다음");
		
		//SmartTV는 위의 인터페이스 두개 전부를 상속하고 있기 때문에
		//사실상 모든 기능에 대해서 접근이 가능하다
		SmartTV smartTV = tv;
		smartTV.alarm("12:00");
		smartTV.search("구글");
		smartTV.turnOn();
	}
}
