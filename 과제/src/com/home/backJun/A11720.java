package com.yedam.java.backJun;

import java.util.Scanner;

public class A11720 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String str = sc.next();
		
		int sum = 0;
		
		for(int i = 0 ; i < str.length() ; i++) {
			sum += str.charAt(i)-'0';		// -'0' or -48
			System.out.println();
			System.out.println("i : " + i);
			System.out.println("str.charAt : " + str.charAt(i));
			System.out.println("sum = " + sum);
		}
		
		System.out.println(sum);


	}

}
