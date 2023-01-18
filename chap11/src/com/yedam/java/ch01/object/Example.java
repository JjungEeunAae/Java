package com.yedam.java.ch01.object;

import java.util.HashMap;
import java.util.Map;

public class Example {
	public static void main(String[] args) {
		Member m1 = new Member("홍길동");
		Member m2 = new Member("김나나");
		Member m3 = new Member("김나나");
		
		//equals 인스턴스가 동일한 객체인지를 체크하는 것
		//즉, 서로 다른 인스턴스라고 하더라도 내부적으로 동일한 값이라면 같다라고 보는 것
		
		//원래 역할은 원래 동일한 것인지 보는 것
		
		if(m1.equals(m2)) {
			System.out.println("m1과 m2는 동등합니다");
		} else {
			System.out.println("m1과 m2는 동등하지 않습니다");
		}
		
		if(m2.equals(m3)) {
			System.out.println("m2과 m3는 동등합니다");
		} else {
			System.out.println("m2과 m3는 동등하지 않습니다");
		}
		
		
		//Map은 Key와 value를 한세트로 가지고오는 것
		
		//Key가 인덱스이다, 정수가 아닌 클래스로 사용
		//Key는 구별이 가능해야 사용이 가능하다.
		//equals()논리적, hash(obj)물리적
		//동일한 값을 가지고 있는 배열안에서 인덱스라는건 식별하기 위함
		
		//put은 저장
		//put안에 해시코드와 이퀄즈를 호출하는게 포함되어있다.
		//Key는 배열의 인덱스이므로 겹치면 안된다.
		Map<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(1), "홍길동");
		
		String name = hashMap.get(new Key(1));
		System.out.println(name);
		
		
		System.out.println();
		
		String message = "오늘은 수요일입니다";
		System.out.println(message);
		System.out.println(m1);		//com.yedam.java.ch01.object.Member@33a43ae  해시코드:@33a43ae
		
		
		
	}
}
