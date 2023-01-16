package com.yedam.java.ch02_01;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		driver.drive(new Vehicle());
		driver.drive(new Taxi());
		
		//기존에 완성된 코드는 손대지 않고
		//내가 필요로 하는 코드를 추가함으로 따라
		//결과를 도출하는 것을 다형성이라고 한다.
	}

}
