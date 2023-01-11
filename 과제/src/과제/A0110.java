package 과제;

import java.util.Scanner;

public class A0110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====3,6,9 게임 시작=====");
		System.out.println("게임 범위 설정(1~50)>");
		/*
		 369게임
		 3, 6, 9가 포함 되어있으면 짝으로 표기한다.
		 아래 내용처럼 출력하면 되고, 출력 범위는 1~50으로 한다.
		 */
		// ※ 사칙연산을 활용해서 풀어볼 것.
		
		//Integer.parseInt() -> String 값을 int로 바꾼다
		//nextLine() -> enter를 치기 전 까지의 모든 값을 가져온다(스페이스 포함)
		//next() -> 스페이스 치기 전 까지의 모든 값을 가져온다.
		int scope = Integer.parseInt(sc.nextLine()); 
		//문자열타입 초기화
		String word = ""; 

		//입력한 값이 i보다 크거나 같으면 i를 1씩 증감시키기
		for(int i = 1 ; i <= scope ; i++) {
			if(i/10 == 3) {                                //십의 자리수가 3이면
				word += "짝";                                //박수 한 번 쳐주세요
				if(i%10 == 3 || i%10 == 6 || i%10 == 9) {    //일의 자리가 3,6,9면
					word += "짝";                              //박스 한 번 쳐주세요
				}                                   //if의 조건이 충족하지 못한다면,
			}	else if(i%10 == 3 || i%10 ==6 || i%10 ==9) { //일자리가 3, 6, 9일때
				word += "짝";                                //박수 한 번 쳐주세요
			} else {                             //위의 조건들이 다 맞지 않을 경우,
			word += String.valueOf(i);                    //입력한 값을 String으로 변환
			}
			word += " "; //word = word + " ";    //if문이 모두 실행되어 for문으로 빠져나올 때 문자열에 " "을 넣어라
		}
		System.out.println(word);              //완성된 word를 콘솔창에 출력해라.
	  }
}
