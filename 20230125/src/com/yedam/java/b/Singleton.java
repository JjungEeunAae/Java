package com.yedam.java.b;

public class Singleton {
	private static Singleton singleton = null;
	//Singleton singleton = new Singleton();
	
	//생성자 private을 막아둠 => 외부에서 Singleton 객체 생성 못함
	private Singleton() {}
	
	//외부에서 Singleton 내부에서 만든 객체 연결하는 메소드
	public static Singleton getIntstance() {
		if(singleton == null) {
			singleton = new Singleton();  //100번지
		}
		return singleton;
	}
}
