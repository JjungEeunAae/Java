package com.yedam.java.backJun;

import java.util.Scanner;

public class A2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//a=150,b=266,c=427
		int abc = a*b*c;		//17037300
		
		//0~9의 개수를 담을 배열
		int[] arr = new int[10];
		
		//charAt를 통해 문자열에 있는 숫자를 한개의 문자로 뚝뚝 끊어서 사용
		String str = String.valueOf(abc);
		
		//0-3, 1-1, 3-2, 7-2
		for(int i = 0 ; i < str.length() ; i++) {
			//1: arr[49-48]++ = arr[1]
			//7: arr[55-48]++ = arr[7]
			//    ...
			//0: arr[48-48]++ = arr[0]
			//계산된 각 인덱스를 1개씩 증가시켜 값으로 넣어준다
			//arr[0] = 3 , arr[1] = 1 , arr[2] = 0 ...
			arr[str.charAt(i) - '0']++;
		}
		
		//한 문자로 잘라낸 배열의 값을 for문 돌려서 화면에 출력 
		for(int i = 0 ; i < arr.length ; ++i) {
			System.out.println(i + " : " + arr[i]);
		}

	}

}
