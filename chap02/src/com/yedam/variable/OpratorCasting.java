package com.yedam.variable;

public class OpratorCasting {
	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000;
		
		long result = value1 + value2 + value3; //data type이 자동으로 long으로 변환됨
		System.out.println(result); //long으로 변환되어 값을 출력
		
		//실수와 정수 타입변환(연산)
		int intValue1 = 10;
		int intValue4 = intValue1/4; // 10/4 = 2.5
		System.out.println(intValue4); // 2 / 정수타입이기 때문에 실수타입인 소수점은 버려진다
		
		int intValue2 = 10;
		double intValue3 = intValue2 / 4.0; // 정수/실수 실수를 따라감
		System.out.println(intValue3); //2.5
		
		
		int x = 1;
		int y = 2;
		double result2 = x/(double)y; //정수를 실수로 바꾸는 방법
		System.out.println(result2); //0.5
		
		//+ 연산
		//숫자 연산(덧셈)
		int value = 10+2+8;
		System.out.println(value);
		
		//문자열 결합 연산
		String str1 = 10+2+"8"; //8은 숫자가 아니기때문에 연산이 아닌 문자 붙혀넣기가 된다 
		System.out.println("str1 : " + str1); //128
		
		String str2 = 10 + "2" + 8; //문자열을 만나는 순간 뒤론 쭉 문자로 인식한다
		System.out.println("str2 : " + str2); //1028
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3 : " + str3); //1028
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4 : " + str4); //1010
		
		//Sting <-> 정수, 실수 타입 변환
		int valueStr = Integer.parseInt(str4);
		System.out.println(valueStr);
//		byte byteValue = Byte.parseByte(str4);
		short shortValue = Short.parseShort(str4);
		long longValue = Long.parseLong(str4);
		double dValue = Double.parseDouble(str4);
		System.out.println(dValue);
//		boolean bValue = Boolean.parseBoolean(str4);
		
		
		//
		//int -> String
		String str5 = String.valueOf(valueStr);
		//long -> String
		String str6 = String.valueOf(longValue);
		//double -> String
		String str7 = String.valueOf(dValue);
		
	}
}
