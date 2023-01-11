package com.yedam.array;

public class Array01 {
	public static void main(String[] args) {
		//값 목록을 활용해서 배열 만들기
		
		//총 6개의 데이터를 담을 수 있는 배열을 만들고,
		//6개의 데이터 각 공간(인덱스)에 맞춰 데이터를 입력
		int[] intAry = {1,2,3,4,5,6}; //index 0,1,2,3,4,5
		
		//6개의 데이터를 담을 수 있는 공간을 새롭게 확보한다.
		//단, 데이터는 담겨있지 않다.
		int[] intAry2 = new int[6];
		//인덱스 0번째에 1이라는 데이터를 담는다.
		//intAry2[0] = 1;
		
		//String 데이터를 10개 담을 수 있는 배열 생성.
		String[] styAry = new String[10];
		
		System.out.println("intAry의 첫번째 값 : " + intAry[0]);
		System.out.println("intAry의 마지막 값 : " + intAry[5]);
		System.out.println();
		
		//for(int i=0;i<=10;i++
		//i=0~10->배열의 인덱스
		//배열의 데이터 총 합계
		int sum = 0;
		int[] score = { 83, 90, 87};
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println(score[i]);
			sum += score[i];
		}
		System.out.println("총 합계 : " + sum);
		System.out.println();
	
		
		//new 연산자 활용한 배열 생성
		int[] point;
		
		point = new int[] {83, 90, 87};
		
		sum = 0;
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println(point[i]);
			sum += point[i];
		}
		System.out.println("총 합계 : " + sum);
		System.out.println();
		
		
		//new 연산 활용해서 배열, 비어있는 배열 만들기
		//int 초기값 : 0
		//double 초기값 : 0.0
		 int[] arr1 = new int[3];
		 
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("arr1["+i+"] : " + arr1[i]);
		}
		System.out.println();
	
		//배열에 데이터 넣기
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("arr1["+i+"] : " + arr1[i]);
		}
		System.out.println();
		
		//String 배열
		String[] arr3 = new String[3];
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("arr3["+i+"] : " + arr3[i]);
		}
		System.out.println();
		
		arr3[0] = "3월";
		arr3[1] = "11월";
		arr3[2] = "12월";
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("arr3["+i+"] : " + arr3[i]);
		}
		System.out.println();
		
		
		
		
		
		
	}
}
