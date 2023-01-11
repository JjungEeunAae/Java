package com.yedam.array;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//배열
		int[] ary;
		//배열의 크기(인덱스 개수)
		int no;
		
		System.out.println("배열의 크기>");
		no = Integer.parseInt(sc.nextLine());
		ary = new int[no]; //입력할 때 마다 배열의 데이터가 바뀐다(동적)
		
		System.out.println(ary.length);
		
		
		for(int i = 0 ; i < ary.length ; i++) {
			System.out.println("입력>");
			ary[i] = Integer.parseInt(sc.nextLine());
		}
		
		for(int i = 0 ; i < ary.length ; i++) {
			System.out.println(ary[i]);
		}
		
		//최대값, 최소값 구하기
		
		int max = 0;
		for(int i = 0 ; i < ary.length ; i++) {
			if(max < ary[i]) {
				max = ary[i];
			}
		}
		
		int min = 0;
		for(int i = 0 ; i < ary.length ; i ++) {
			if(min == 0) {
				min = ary[i];
			}
			if(min > ary[i]) {
				min = ary[i];
			}
		}
		
		
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
