package com.yedam.java.backJun;

import java.util.Scanner;

public class A4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		
		for(int i = 0 ; i < testCase ; i++) {
			int n = sc.nextInt();			// 학생 수
			int count = 0;					// 평균 이상 학생 수
			double avg = 0;					// 평균 점수
			double avgOver;					// 평균 이상 학생 비율을 구할 때 사용
			int[] scoreArr = new int[n]; 	// 각 점수를 저장할 때 사용할 배열
			
			for(int j = 0 ; j < n ; j++) {
				int score = sc.nextInt();
				scoreArr[j] = score;		// 각 점수를 배열에 저장
				avg += score;				// 점수의 합 구하는 방법
			}
			avg = avg/n;					// 평균 점수
			for(int k = 0 ; k < scoreArr.length ; k++) {
				if(scoreArr[k] > avg) {
					count++;
				}
			}
			//결과를 double로 강제타입변환
			avgOver = (double)count/n*100;
			//결과 값을 소수점 3자리까지 출력한다.
			System.out.printf("%.3f",avgOver);
			System.out.println("%");
		}

	}

}
