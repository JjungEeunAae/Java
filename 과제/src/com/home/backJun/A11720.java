package com.yedam.java.backJun;

import java.util.Scanner;

public class A11720 {

	public static void main(String[] args) {
		
		//char타입으로는 입력받을 수 없다
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String str = sc.next();
		
		int sum = 0;
		
		for(int i = 0 ; i < str.length() ; i++) {
			//String으로 저장된 문자열 중에서 한글자만 선택해서 char타입으로 변환시켜준다
			//문자 5는 아스키코드로 치면 53이고 53-48을 하면 5가 나온다
			sum += str.charAt(i)-'0';		// -'0' or -48
			System.out.println();
			System.out.println("i : " + i);
			System.out.println("str.charAt : " + str.charAt(i));
			System.out.println("sum = " + sum);
		}
		
		System.out.println(sum);


	}

}
