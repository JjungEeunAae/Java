package com.yedam.java.backJun;

import java.util.Scanner;

public class A2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		//시간을 분으로 바꾸기
		int a = (h*60+m+n);
		int hour = a/60;
		int minute = a%60;
		
		//hour가 24를 넘는다면?
		if(hour >= 24) {
			hour -= 24;
		}
		
		
		System.out.printf("%s %s",hour,minute);
		
	}
}
