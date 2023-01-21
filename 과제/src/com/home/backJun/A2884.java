package com.yedam.java.backJun;

import java.util.Scanner;

public class A2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		/*입력값이 45보다 크거나 같으면
		 * 입력값에 45를 마이너스하고
		 * 그게 아니라면 M을 15를 플러스한다
		 * 단, H가 0일 때 H를 23으로 만들고
		 * 그게 아니라면 H를 1씩 감소시킨다
		 */
		if(M >= 45) {		//알람, 일어나는 시간보다 45분 일찍 알람을 맞춰야한다
			M -= 45;
		} else {
			M += 15;
			if(H == 0) {
				H = 23;
			} else {
				H--;
			}
		}
		System.out.printf("%s %s",H,M);

	}

}
