package com.yedam.java.ch03.String;

public class SubStringExample {

	public static void main(String[] args) {
		//문자열 잘라내기 
		String ssn = "880815-1234567";
		
		//substring(start, end)
		//---> Index start 부터 end의 전까지를 잘라냄
		String firstNum = ssn.substring(0,6);
		System.out.println("생년월일 : " + firstNum);		//생년월일 : 880815
		
		//substring(start)
		//---> Index start 부터 끝까지
		String secondNum = ssn.substring(7);
		System.out.println("개인정보 : " + secondNum);		//개인정보 : 1234567
		
		//split
		String[] numList = ssn.split("-");
		for(String num : numList) {
			System.out.println(num);
		}
		
		/*
		 * 880815
		 * 1234567
		 */
	}
}
