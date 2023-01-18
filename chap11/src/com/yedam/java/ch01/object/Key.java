package com.yedam.java.ch01.object;

public class Key {
	//필드 하나와 구별하는 클래스
	
	//필드
	public int number;
	//생성자
	public Key(int number) {
		this.number = number;
	}
	//메소드
	@Override
	public int hashCode() {
		return number;
	}
	
	//타입을 확인해야 함
	//타입이 다르면 아예 비교를 하지 않음
	@Override
	public boolean equals(Object obj) {
		//강제타입변환
		if(obj instanceof Key) {
			Key key = (Key)obj;
			if(number==key.number) {
				return true;
			}
		}
		return false;
	}
}
