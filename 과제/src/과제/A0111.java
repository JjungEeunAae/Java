package 과제;

import java.util.Scanner;

public class A0111 {
	public static void main(String[] args) {
		//주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		
		//문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
//		for(int i = 0 ; i < arr1.length ; i++) {
//			if(arr1[i] == 60) {
//				System.out.println("주어신 배열 중에서 값 중 " + arr1[i] + "을 찾아라");
//			}
//		}	
//		
//		//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
//		for(int i = 0 ; i < arr1.length ; i++) {
//			if(arr1[i] == 3) {
//				continue;
//			} else {
//			System.out.println("3을 제외한 나머지 값 : " + arr1[i]);
//			}
//		}
		
		//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
  		//      입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("인덱스 값을 입력하세요>");
//			int index = Integer.parseInt(sc.nextLine());
//			arr1[index] = 1000;
//			System.out.println(arr1[index]);
			
		//문제4. 주어진 배열의 요소에서 최대값과 최대값의 위치값(인덱스), 최소값과 최소값의 위치값(인덱스)을 구해보자.
			//최대값의 인덱스 위치를 찾기 위한 배열 변수 선언
//			int max = arr1[0];
//			//최대값을 담을 변수 선언
//			int maxNum = 0;
//			
//			//최소값의 인덱스 위치를 찾기 위한 배열 변수 선언
//			int min = arr1[0];
//			//최소값을 담을 기본 변수 선언
//			int minNum = 0;
//			
//			//최대값과 그에 대한 배열의 인덱스 값
//			for(int i =0 ; i < arr1.length ; i++) {
//				if(maxNum < arr1[i]) {
//					//최대값
//					maxNum = arr1[i];
//					max = i;
//				  //최소값과 그에 대한 배열의 인덱스 값
//				} else {
//					if(minNum>arr1[i]) {
//						//최소값
//						minNum = arr1[i];
//						//최소값에 대한 배열의 인덱스 값
//						min = i;
//					}
//				}
//			}
//			System.out.println("최대값의 인덱스 위치는 " + max + " 그에 대한 값은 " + maxNum);
//			System.out.println("최소값의 인덱스 위치는 " + min + " 그에 대한 값은 " + minNum);
			
			//문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
			
			//별도의 배열(10개를 입력 받을 수 있는 배열)
			int[] intAry = new int[10];
			//10번 입력 할 반복문
			for(int i = 0 ; i < 10 ; i++) {
				System.out.println((i+1) + "회 입력(총10회)>");
				intAry[i] = Integer.parseInt(sc.nextLine());
			}
			//3의 배수만 출력
			for(int i = 0 ; i < 10 ; i++) {
				if(intAry[i]%3 != 0) {
					continue;
				}
				System.out.println("입력한 값 중 3의 배수는 " + intAry[i] + " 입니다");
			}
			
			//[추가 문제]

			// answer 배열에 담긴 데이터를 읽고 각 숫자마다 개수만큼'*'를 찍는다.
			// 아래 빈 영역에 코드를 입력하여 프로그램을 완성하여라
					
					//counter 배열에 데이터를 넣어줄 answer 배열
					int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
					
					//데이터가 없는 4개의 빈 공간의 배열 변수 선언
					int[] counter = new int[4];

					for (int i = 0; i < answer.length; i++) {
						//counter 배열의 0번째엔 1을 모아서 1의 개수만큼 증감,
						//			   1번째엔 2를 모아서 2의 개수만큼 증감,
						//             2번째엔 3을 모아서 3의 개수만큼 증감,
						//             3번째엔 4를 모아서 4의 개수만큼 증감시킨다.
						counter[answer[i]-1]++; 
					}
					
					//counter 배열의 길이를 이용하여 별찍기
					for (int i = 0; i < counter.length; i++) {
						//counter의 배열의 값만큼
						for (int j = 0; j < counter[i]; j++) {
							//별을 찍고
							System.out.print("*");
						} //다음 줄로 이동
						System.out.println();
					}
			// ※ 배열의 각 인덱스와 숫자의 연관성을 지으면서 풀어 볼 것.
			// 출력 예시) ***
	        //         **
	        //         **
        	//         ****
			
			
			
			
			
			
			
			
			
			
	}
}
