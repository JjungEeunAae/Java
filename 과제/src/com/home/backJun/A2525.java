package com.yedam.java.backJun;

import java.util.Scanner;

public class A2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		//�ð��� ������ �ٲٱ�
		int a = (h*60+m+n);
		int hour = a/60;
		int minute = a%60;
		
		//hour�� 24�� �Ѵ´ٸ�?
		if(hour >= 24) {
			hour -= 24;
		}
		
		
		System.out.printf("%s %s",hour,minute);
		
	}
}
