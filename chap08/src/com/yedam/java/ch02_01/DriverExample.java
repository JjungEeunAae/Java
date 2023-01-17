package com.yedam.java.ch02_01;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		//운전자가 택시를 운전해보겠다라고 상상
		driver.drive(new Taxi());
		
		//운전자가 버스를 운전해보겠다고 상상
		driver.drive(new Bus());
	}
}
