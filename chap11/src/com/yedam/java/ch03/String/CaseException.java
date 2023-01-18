package com.yedam.java.ch03.String;

public class CaseException {
	public static final String DATA = "HELLO WORLD!";
	public static void main(String[] args) {
		String inputData = "Hello World!";
		
		String newInputDataL = inputData.toLowerCase();		//소문자
		String newInputDataU = inputData.toUpperCase();		//대문자
		
		//inputData의 값을 대문자로 바꾸고 DATA 값과 비교하는 곳
		if(newInputDataU.equals(DATA.toUpperCase())) {
			System.out.println("있는 데이터입니다");
		} else {
			System.out.println("없는 데이터입니다");
		}
		
		//자바는 무시하고 할 수 있음
		//대소문자 구분없이 의미만 비교하는 메소드
		//비교하고자하는 데이터를 그대로 쓰고 도트 후 equalsIgnoreCase를 선택
		//대소문자 구분없이 데이터를 비교해준다
		if(inputData.equalsIgnoreCase(DATA)) {
			System.out.println("있는 데이터입니다");
		} else {
			System.out.println("없는 데이터입니다");
		}
	}

}
