package com.yedam.java.backJun;

import java.util.Scanner;

public class A10871_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int x = sc.nextInt();
		
		int n[] = new int [a];
		
		for(int i = 0 ; i < a ; i++) {
			n[i] = sc.nextInt();
			if(n[i] < x) {
				System.out.print(n[i] + " ");
			}
		}

	}

}
