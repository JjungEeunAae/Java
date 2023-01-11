package com.yedam.loop;

import java.util.Scanner;

public class LoopFor {
	public static void main(String[] args) {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i);
		}
		
		//1부터 100까지의 합 구하기
		int result = 0;
		for(int i = 0 ; i <= 100 ; i++) {
			result += i;
		}
		System.out.println("1~100까지의 합 : " + result);
	
		//1~100사이의 짝수 구하기
		//짝수의 성질 => 2로 나누었을때 0으로 떨어지면 짝수.
		for(int i = 1 ; i < 100 ; i++) {
			if(i%2==0) {
				System.out.println(i + "는 짝수");
			} else if(!(i%2==0)) {
				System.out.println(i + "는 홀수");
			}
		}
		
		//입력한 숫자에 대한 구구단 출력
		
		/*스캐너를 활용하여 값을 하나 입력받고
		  입력받은 값에 대한 구구단 출력
		  예)2를 입력->2*1=2... 2*9=18*/
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 입력>");
		int gugu = Integer.parseInt(sc.nextLine());
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(gugu+" * "+ i + " = " +(gugu*i));
		}
		
		//입력한 값에 대한 총합, 평균, 최대값, 최소값, 데이터 받을 개수
		//스캐너 -> 데이터 입력
		//데이터 받을 개수 ->5를 입력하면
		//데이터 입력 가능한 횟수가 다섯번 (예시) 1, 34, 26, 78, 34
		//총합 : 값을 입력 받을 때 마다 변수에 저장
		//평균 : 총합 / 개수
		//최대값 : 입력할 때마다 비교해서 최대값인지 아닌지
		//최소값 : 입력할 때마다 비교해서 최소값인지 아닌지
		System.out.println("데이터 입력>");
		//입력할 데이터 갯수 입력 받음
		int in = Integer.parseInt(sc.nextLine());
		
		int data =0;
		int sum = 0;
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < in ; i++) {
			System.out.println("데이터입력>");
			data = Integer.parseInt(sc.nextLine());
			//총합
			sum += data;
				//최대값, 최소값 초기값 설정
				if(i == 0) {
					max = data;
					min = data;
				}
				//최대값
				if(max < data) {
					max = data;
				}
				//최소값
				if(min > data) {
					min = data;
				}
		}

		System.out.println("총합 : " + sum);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		//반복문에서 총합, 입력받은 갯수를 활용해서 평균
		System.out.printf("평균 : %f" + (double)sum/in);
		
		//2번문제)up and down
		/*임의의 랜덤 값(1~100) 추출하여 5번의 기회안에
		  해당 랜덤 값을 맞추는 프로그램을 구현하라.
		  예시)랜덤값:50
		  	  입력값:30
		  	  => 더 큰 수를 입력하세요
		  	  입력값 : 40
		  	  =>더 큰 수를 입력하세요
		  	  입력값 : 70
		  	  =>더 작은 값을 입력하세요
		  	  ->정답일 경우 : 
		  	  =>정답입니다.
		  	  ->5번 기회 동안 못 맞출 경우
		  	  => 실패하였습니다*/
		//랜덤추출
		int random = (int)(Math.random()*100)+1;
		for(int i = 0 ; i < 5 ; i ++) {
			System.out.println("up and down>>");
			int num = Integer.parseInt(sc.nextLine());
			
			if(random == num) {
				System.out.println("정답입니다");
				break;
			}else if(random > num) {
				System.out.println("더 큰 수를 입력");
			}else{
				System.out.println("더 작은 수를 입력");
			}
			if(i==4) {
				System.out.println("5번의 기회를 모두 소준하였습니다");
			}
		}
	}
}
