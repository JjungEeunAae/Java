package com.yedam.java.backJun;

import java.util.Scanner;

public class A10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i = 0 ; i <= a ; i++) {
			//°á°ú
			int n = sc.nextInt();
			if(n < x) {
				System.out.print(n+" ");
			}
		}

	}

}
