package com.yedam.java.backJun;

import java.util.Arrays;
import java.util.Scanner;

public class A10818_Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		//sort : 배열정렬
		Arrays.sort(arr);
		//정렬된 배열의 가장 작은 수
		//0번 인덱스 = min값
		//배열의 -1 인덱스 = max값
		System.out.printf("%s %s",arr[0],arr[n-1]);

	}

}
