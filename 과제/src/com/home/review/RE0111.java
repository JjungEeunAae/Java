package com.home.review;

import java.util.Scanner;

public class RE0111 {
	public static void main(String[] args) {
		//주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
//		
//		//문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
//		for(int i = 0 ; i < arr1.length ; i++) {
//			if(arr1[i] == 60) {
//				System.out.println(arr1[i]);
//			}
//		}
//		
//		//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
//		for(int i = 0; i < arr1.length ; i++) {
//			if(arr1[i] == arr1[3]) {
//				continue;
//			} else {
//			System.out.println("인덱스 3을 제외한 나머지 인덱스 : " + arr1[i]);
//			}
//		}
		
		
//		int[] num = new int[4];
//		//num[0] = 60;
//		//num[1] = 70;
//		//num[2] = 80;
//		//num[4] = 90;
//		for(int i = 0 ; i < num.length ; i++) {
//			num[i] = i*10+50;
//			System.out.println(num[i]);
//		}
		
		//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아,
		//		그 값을 1000으로 변경해보자.
  		//   입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("인덱스 입력>");
//		int num = Integer.parseInt(sc.nextLine());
//		
//		int[] arr2 = { 10, 20, 30, 50, 3, 60, -3 };
//		arr2[num] = 1000;
//		System.out.println(arr2[num] + "으로 변경완료");
//		for(int i = 0 ; i < arr2.length ; i++) {
//			System.out.println("arr2["+i+"] : " + arr2[i]);
//		}
		
		//문제4. 주어진 배열의 요소에서 최대값과 최대값의 위치값(인덱스),
		//		최소값과 최소값의 위치값(인덱스)을 구해보자.
		
//		int max = 0;
//		int maxIndex = 0;
//		int min = 0;
//		int minIndex = 0;
//		for(int i = 0 ; i < arr2.length ; i++) {
//			if(arr2[i]==0) {
//				max = arr2[i];
//				min = arr2[i];
//			}
//			if(max<arr2[i]) {
//				max = arr2[i];
//				maxIndex = i;
//			}
//			if(min > arr2[i]) {
//				min = arr2[i];
//				minIndex = i;
//			}
//		}
//		System.out.println("인덱스 " + maxIndex + ", 최대값 : " + max);
//		System.out.println("인덱스 " + minIndex + ", 최소값 : " + min);
		
		//문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고,
		//		배열에 있는 정수 중에서 3의 배수만 출력해보자.
//		int[] numAry = new int[10];
//		for(int i = 0 ; i < 10 ; i++) {
//			System.out.println((i+1)+"회 입력(총10회) >");
//			numAry[i] = Integer.parseInt(sc.nextLine());
//			if(numAry[i] < 0) {
//				System.out.println("0 미만 숫자는 제외됩니다");
//			}
//		}
//		
//		for(int i = 1 ; i < numAry.length ; i++) {
//			if(numAry[i]%3 != 0 || numAry[i] < 0) {
//				continue;
//			}
//			System.out.println("3의 배수 : " + numAry[i]);
//		}
		
		
		//[추가 문제]
		// answer 배열에 담긴 데이터를 읽고 각 숫자마다 개수만큼'*'를 찍는다.
		// 아래 빈 영역에 코드를 입력하여 프로그램을 완성하여라
		// ※ 배열의 각 인덱스와 숫자의 연관성을 지으면서 풀어 볼 것.
		// 출력 예시) ***
        //         **
        //         **
    	//         ****
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		for (int i = 0; i < answer.length; i++) {
			//counter[answer[0]-1]++;
			//counter[answer[1]-1]++;
			//        ...
			//counter[answer[10]-1]++;
			counter[answer[i]-1]++;
		}
		
		//counter = {3,2,2,4};
		for (int i = 0; i < counter.length; i++) {
			for(int j = 0 ; j < counter[i] ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
	}
}
