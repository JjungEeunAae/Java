package jungeunae;

import java.util.Scanner;

public class Num05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int num = Integer.parseInt(sc.nextLine());
		
		int[] gameAry = null;
		int num = 0;
		
		while(true) {
			System.out.println("=== 1.주사위크기 2.주사위굴리기 3.결과보기 4.가장 많이 나온 수 5.종료 ===");
			System.out.println("메뉴>");
			int gameNo = Integer.parseInt(sc.nextLine());
			
			if(gameNo == 1) {
				System.out.println("주사위 크기>");
				num = Integer.parseInt(sc.nextLine());
				if(num < 5 || num > 10) {
					System.out.println("범위 밖입니다");
					System.out.println("5에서 10까지의 숫자로 입력 해주세요");
				}
				gameAry = new int[num];
			}else if(gameNo == 2) {
				//5가 나올 때 까지 주사위를 몇 번 굴리는지 구하고 출력
				int count = 0;
				//5가 나올 때 까지 돌아가는 while문(반복)
				while(true) {
					//입력한 값에 맞춰 랜덤으로 숫자 돌리기
					int random = (int)(Math.random()*num)+1;
					//배열에 랜덤 숫자의 순서 담기
					//단 배열은 인덱스이기 때문에 0부터 시작한다
					gameAry[random-1]++;
					//5가 나올 때 까지 랜덤으로 돌린 횟수를 담는 변수
					count++;
					if(random == 5) break;
				}
				System.out.println("5가 나올 때 까지 주사위를 " + count + "번 굴렸습니다");
			}else if(gameNo == 3) {
				//결과보기
				for( int i = 0 ; i < gameAry.length ; i++) {
					System.out.println((i+1) + "은 " + gameAry[i] + "번 나왔습니다");
				}
			}else if(gameNo == 4) {
				//가장 많이 나온 수 (max 값 구하기)
				
				//배열에서 max 값 찾기
				int max = 0;
				for(int gameNum : gameAry) {
					if(max < gameNum) {
						max = gameNum;
					}
				}
				//가장 많은 횟수가 나온 주사위 숫자 찾기
				//i한테 max 값을 받아올 수 있는 방법
				int i = 0;
				for(; i < gameAry.length ; i++) {
					//만약 max의 값과 배열의 인덱스가 같으면 for문을 빠져나간다
					if(gameAry[i] == max) break;
					//빠져나간 후 i에 max 값이 할당되어 출력한다.
				}
				System.out.println("제일 많이 나온 주사위의 횟수는 " + (i+1) + "번 입니다");
			}else if(gameNo == 5) {
				System.out.println("프로그램 종료");
				break;
			}

		}
		
	}
}
