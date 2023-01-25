package com.yedam.java.subject0125;

import java.util.Calendar;
import java.util.Scanner;

public class A_String {
	public static void main(String[] args) {
	//문자열 뒤집기
	String a = "abc12345";
	//54321cba
	StringBuffer a2 = new StringBuffer(a);
	String re = a2.reverse().toString();
	
	System.out.print(re);

	
	//입력한 문자열 개수 세기
	String b = "abacssb";
	int[] arr = new int[26];
	//a 2개, b 2개, c 1개, s 2개
	for(int i = 0 ; i < b.length() ; i++) {
		arr[b.charAt(i) - 'a']++;
		//System.out.println(arr[b.charAt(i) - 'a']);
	}
	
	for(int i = 0 ; i < arr.length ; ++i) {
		if(arr[i] != 0) {
		System.out.println((char)(97+i) + " = " + arr[i]);
		}
	}
	
	//나이계산기
	//입력한 생년월일 6자리
	//나이가 몇살인지 출력
	//000101 : 24살
	//941226 : 30살
	
	Scanner sc = new Scanner(System.in);
	
	Calendar now = Calendar.getInstance();
	Integer year = now.get(Calendar.YEAR);
	String age = sc.nextLine();
	
	
	Integer birth = Integer.parseInt(age.substring(0,4));
	System.out.println(birth);
	
	int age1 = (year - birth + 1);
	System.out.println(age1);
	
	
	
	
	
	}
}
