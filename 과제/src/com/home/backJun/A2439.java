package com.yedam.java.backJun;

import java.util.Scanner;

public class A2439 {

	public static void main(String[] args) {
		//별찍기
		/*
		     *
		    **
		   ***
		  ****
		 *****
		 
		*/
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {		   //입력한 값은 줄이 된다
			for(int j = n-i ; j >= 1 ; j--) {  //5-0
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
