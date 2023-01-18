package com.yedam.java.ch03.String;

public class ChartAtExample {

	public static void main(String[] args) {
		String ssn = "020529-4685927"; //주민등록번호
		
		//문자 추출 charAt()
		//한개의 문자를 찾을 때
		char gender = ssn.charAt(7);
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
	}

}
