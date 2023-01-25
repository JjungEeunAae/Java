package com.yedam.review;

import java.util.Scanner;

public class StringAPI {

	public static void main(String[] args) {
		//1.문자열 뒤집기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("뒤집을 문자열 입력>");
		String str = sc.nextLine();
		
		//String.length : 문자열 길이
		//String.charAt(위치); : 위치에 따른 문자 출력
		for(int i = str.length()-1 ; i >= 0 ; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		
		//2.입력한 문자열 개수 세기
		//a~z : 26개가 다 들어온다는 가정
		System.out.println("문자열 개수 세기>");
		//toLowerCase() : 대문자를 입력하더라도 소문자로 변환시키는 방법
		String str2 = sc.nextLine().toLowerCase();
		int[] arr = new int[26];
		
		for(int i = 0 ; i < str2.length() ; i++) {
			//다른방식
			//str2.subString(1,1+1);
			arr[str2.charAt(i) - 'a']++;
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] != 0 ) {
				System.out.println((char)(97+i) + " : " + arr[i]);
			}
		}
		
		
		//만 나이 계산기 ( 올해기준 +- 100살 )
		//입력한 생년월일 6자리
		//나이가 몇살인지 출력
		//000101 : 24살
		//941226 : 30살
		
		//1. 계산식(하드코딩) -> 올해만 사용가능
		//1-1) 2000년 이후 2023년 이전 출생 ==> (23-태어난연도)+1
		//1-2) 1922년 이후 2000년 이전 출생 ==> (123-태어난연도)
		System.out.println("생년월일>");
		String birth = sc.nextLine();
		
		//**자바는 문자열을 자를 땐 배열의 인덱스처럼 인식한다
		//**0(시작)부터 2미만까지 자르다 = 인덱스 0,1 추출
		int birthNo = Integer.parseInt(birth.substring(0,2));  //substring : 문자열자르기
		     //2000~2023
		if(birthNo <= 23) {
			System.out.println("나이 : " + (23-birthNo)+1);
			      //1922~1999
		}else if(birthNo > 23) {
			System.out.println("나이 : " + (123-birthNo));
		}
		
		//1-1 계산식(일반화)
		//해가 지나도 계속 쓸 수 있는 방법
		//Calendar , date(simpledateFormet) => 오늘 날짜, 년도
		//1-1) 2000년 이후 2023년 이전 출생 ==> (기준년도-태어난연도)+1
		//1-2) 1922년 이후 2000년 이전 출생 ==> (기준년도-태어난연도)
		
	}

}
