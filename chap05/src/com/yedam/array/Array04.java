package com.yedam.array;

import java.util.Arrays;

public class Array04 {
	public static void main(String[] args) {
		//2차원 배열 -> 데이터 입력 -> 하나 씩 loading
		//정수열 배열
		int[][] intAay = {{1,2},{1,2,3}};
		
		int[][] mathScore = new int[2][3];
		System.out.println(mathScore.length);
		for(int i = 0 ; i < mathScore.length ; i++) {
			//배열 안에 덩어리가 몇개인가?
			for(int k = 0; k < mathScore[i].length; k++) {
				//덩어리 안에 인덱스 값이 무엇인가?
				System.out.println("mathScore["+i+"]["+k+"]="+mathScore[i][k]); 
			}
		}
		
		
		//이차원 배열에 구구단 결과값 저장
		//[[2단],[3단],[4단],[]...[7단],[8단],[9단]]
		//8개의 배열 안에 9개의 데이터를 담을 수 있는 배열
		//new int[8][9];
		int[][] gugu = new int[8][9];
		
		//단수를 의미/ 2단,3단,4단...
		for(int i = 2; i < 10 ; i++) {
			//각 단수마다 곱셈하는 숫자를 반복하는 구간
			for(int j = 1 ; j < 10 ; j++) {
				//gugu[0][0] => 2*1
				//0111 추가문제 참고
				gugu[i-2][j-1] = i*j;
			}
		}
		
		//배열에 저장된 내용 출력
		for(int i = 0 ; i < gugu.length ; i++) {
			System.out.print((i+2) + " 단 : ");
			//toString() : 선택한 배열의 정보 출력하는 메소드(함수)
			System.out.print(Arrays.toString(gugu[i])); //가지고 있는 데이터를 한번에 출력하는 메소드
			System.out.println();
		}
		
		//참조타입배열
		
		String[] strArray = new String[3];
		strArray[0] = "yedam";
		strArray[1] = "yedam";
		strArray[2] = new String("yedam");
		
		//String의 주소값 비교
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]); //2번은 new를 통해 새로운 번지수를 받아 생성되어 false라는 결과값이 나온다.
		//String의 데이터 비교
		System.out.println(strArray[0].equals(strArray[2]));
		
		
		
		
		//배열복사
		int[] oldArray = {1,2,3};
		int[] newArray = new int[5];
		
		for(int i = 0 ; i<oldArray.length ; i++) {
			newArray[i] = oldArray[i];
		}
		
		//출력하는 구문
		for(int i = 0 ; i < newArray.length ; i++) {
			System.out.println(newArray[i]);
		} System.out.println();
		
		//자바 배열 복사 기능
		int[] oldArray2 = {1,2,3,4,5,6,7};
		int[] newArray2 = new int[10];
		
		//복사하고자하는 소스, 출발위치, 복사하려는대상, 시작위치 ,사용할 데이터의 길이
		System.arraycopy(oldArray2, 0, newArray2, 0, oldArray2.length);
		for(int i = 0 ; i < newArray2.length ; i++) {
			System.out.println(newArray2[i]);
		}
		
		for(int temp : newArray2) {
			System.out.print(temp + "\t");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
