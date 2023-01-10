package com.yedam.variable;

public class Casting {
	public static void main(String[] args) {
		//자동타입변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue :" + intValue); //문제없이 값 출력
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 : " + intValue); //문제없이 값 출력
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue); //문제없이 유니코드 값으로 값 출력
		
		double doubleValue = longValue;
		System.out.println("boubleValue : " + doubleValue); //자동인식하여 값이 출력됨
		
		//강제타입변환
		//작은 허용 범위 타입 = (작은 허용 범위 타입)큰 범위 타입
		
		int intVar = 127;
		byte byteVar = (byte)intVar;
		System.out.println("byteVar : " + byteVar);
		
		int intVar2 = 44032;
		char charVar = (char)intVar2;
		System.out.println("charVar : " + charVar);
		
		//실수 <-> 정수간 강제 타입 변환
		//자동타입변환 : int -> double = 3.0
		//강제타입변환 : double -> int = 소수점 땐 정수만 타입 변환
		double doubleVar = 3.14;
		intVar2 = (int)doubleVar; //int로 정수로 값을 반환하기 때문에 소수점을 버리고 값을 출력
		System.out.println("intVar2 : "+intVar2);
	}
}
