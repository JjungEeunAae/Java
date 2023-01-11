package com.yedam.loop;

public class LoopCondition {
	public static void main(String[] args) {
//		//while에서 break 거는 방법
//		while(true) {
//			//랜덤값 지정
//			int num = (int)(Math.random()*6)+1;
//			//랜덤으로 나온 숫자 출력
//			System.out.println(num);
//			//값이 6이면 break
//			if(num == 6) {
//				break;
//			}
//		}
		
//		for(int i = 0 ; i <= 10 ; i++) {
//			for(int j=0 ; j <= 10 ; j++) {
//				if(j==5) {
//					System.out.println("i + j = "+(i+j));
//					break; //if와 else만 break가 실행된다.
//				} else {
//					System.out.println("j의 값은? "+j);
//				}
//			}
//		}
		
		//for문 label break
		//label은 이름을 아무렇게나 지정할 수 있다.
//		Outter : for(char upper = 'A'; upper <= 'z'; upper++) { //아스키코드는 대문자가 소문자보다 값이 적다.
//			for(char lower = 'a'; lower <= 'z'; lower++) {
//				System.out.println(upper + " - " + lower);
//				if(lower =='g') {
//					//label이 붙어있는 반복문을 종료한다
//					//!!!밖에 있는 for문을 종료시킴!!!
//					break Outter;
//				}
//			}
//		}
		
		//continue
		//홀수를 출력하는 for문
		for(int i = 0 ; i <= 10 ; i++) {
			if(i%2 == 0) { //짝수
				continue; //짝수의 값은 패스하고 다음 반복문을 실행해라.
			}
			System.out.println(i); //짝수에 해당되지 않으면 i의 값을 출력
		}
		
		
		
		
		
		
		
		
	}

}
