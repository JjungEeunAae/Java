package com.yedam.java.ch02;

public class MainExample {

	public static void main(String[] args) {
		//제네릭
		//지정한 클래스로만 사용이 가능하다
		//모든 타입을 담을 수 없는 상태
		Box<String> nameBox = new Box<>();
		nameBox.set("홍홍홍");
		String name = nameBox.get();
		
		//새로운 타입을 담고 싶다면?
		Box<Integer> priceBox = new Box<>();
		priceBox.set(1000);
		int price = priceBox.get();
		
		//제네릭타입은 객체만 받아옴(클래스, 인터페이스)
		//기본타입을 받아오고 싶다면 윂퍼클래스를 사용하여야한다
		
		Box<Apple> appleBox = new Box<Apple>();
		appleBox.set(new Apple());
		Apple apple = appleBox.get();
		
		Agency agency = new Agency();
		agency.rent().turnOnLight();
		agency.getCount().printPentDate();
		
		
		
	}

}

class Apple{}