package com.yedam.java.ch01;

public class MainExample {

	public static void main(String[] args) {
		Box box = new Box();
		//get --> 반환하는걸 모르는 상태
		//box.get();
		
		//set --> 값을 담는건 쉽게 가능하다
		box.set("홍길동");
		//실행에러가 날 가능성이 높다
		String name = (String)box.get();
		
		box.set(1000);
		int price = (Integer)box.get();
		
		box.set(new Apple());
		Apple apple = (Apple)box.get();
	}

}

class Apple{}