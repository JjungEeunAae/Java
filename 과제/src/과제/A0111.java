package 과제;

import java.util.Scanner;

public class A0111 {
	public static void main(String[] args) {
		//주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		
		//문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		for(int i = 0 ; i < arr1.length ; i++) {
			if(arr1[i] == 60) {
				System.out.println("주어신 배열 중에서 값 중 " + arr1[i] + "을 찾아라");
			}
		}	
		
		//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		for(int i = 0 ; i < arr1.length ; i++) {
			if(arr1[i] == 3) {
				continue;
			} else {
			System.out.println("3을 제외한 나머지 값 : " + arr1[i]);
			}
		}
		
		//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
  		//      입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
			Scanner sc = new Scanner(System.in);
			
			System.out.println("인덱스 값을 입력하세요>");
			int index = Integer.parseInt(sc.nextLine());
			arr1[index] = 1000;
			System.out.println(arr1[index]);
			
		//문제4. 주어진 배열의 요소에서 최대값과 최대값의 위치값(인덱스), 최소값과 최소값의 위치값(인덱스)을 구해보자.
			
		
	}
}
