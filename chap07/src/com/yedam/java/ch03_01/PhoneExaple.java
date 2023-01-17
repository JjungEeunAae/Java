package com.yedam.java.ch03_01;

public class PhoneExaple {

	public static void main(String[] args) {
		//Phone phone = new Phone("홍길동");
		
		//자식 클래스의 생성자 호출
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		//강제타입변환가능
		//상속관계가 적용되기 때문에 변환이 가능함
		//Phone phone = new SmartPhone("홍길동");
		
		//강제타입변환가능
		//인스턴스 작동이 불가함(추상클래스로 인한 불가)
		//SmartPhone smartphone1 = new Phone("홍길동");
		
		//자신 것과 부모 것을 사용할 수 있다.
		//자식에서 부모의 정보를 다 가져왔기 때문에!
		smartphone.turnOn();
		smartphone.turnOff();
		smartphone.internetSearch();
	}

}
