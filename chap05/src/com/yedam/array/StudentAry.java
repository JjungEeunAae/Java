package com.yedam.array;

import java.util.Scanner;

public class StudentAry {
	public static void main(String[] args) {
		//한 학생의 성적을 입력
		//과목수
		int subjectNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("==================================================");
			System.out.println("1. 과목수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("==================================================");
			System.out.println("메뉴 입력>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) { // 과목수
				//배열 크기 입력받기
				System.out.println("과목 수>");
				subjectNum = Integer.parseInt(sc.nextLine());
			}else if(selectNo == 2) { // 점수입력
				//배열 크기 설정
				scores = new int[subjectNum];
				for(int i = 0 ; i < scores.length ; i++) {
					System.out.println("scores["+i+"]");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			}else if(selectNo == 3) { //국영수 참고
				for(int i = 0 ; i < scores.length ; i++) {
					System.out.println("scores["+i+"]" + scores[i]);
				}
			}else if(selectNo == 4) { //총합과 평균
				//값 초기화
				int sum = 0;
				for(int i = 0 ; i < scores.length ; i++) {
					sum += scores[i];
				}
				System.out.println("총합 : " + sum); //총합
				System.out.println("평균 : " + (double)sum/scores.length); //평균
			}else if(selectNo == 5) { //종료
				System.out.println("end of prog");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
