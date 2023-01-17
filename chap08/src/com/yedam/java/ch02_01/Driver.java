package com.yedam.java.ch02_01;

public class Driver {
	//해당 운전자가 어느거든 운전할 수만 있다면
	//운전자가 운전한다라는 행위를 적어준다
	public void drive(Vehicle vehicle) {
		//버스 요금을 먼저 확인하고 운전한다
		//강제 타입 변환
		//if 조건문 instanceof 사용
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
