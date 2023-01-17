package com.yedam.java.ch02_02;
//기존에 인터페이스 두개를 상속
public interface SmartTV extends RemoteControl, Searchable{
	public void alarm(String time);
	
	//interpace는 일반 메소드를 선언하지 못한다.
	//쓴다면 default가 필요함
}
