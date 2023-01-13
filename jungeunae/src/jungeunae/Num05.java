package jungeunae;

import java.util.Scanner;

public class Num05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int num = Integer.parseInt(sc.nextLine());
		
		int[] gameAry = null;
		int num = 0;
		int max = 0;
		
		while(true) {
			System.out.println("=== 1.주사위크기 2.주사위굴리기 3.결과보기 4.가장 많으 나온 수 5.종료 ===");
			System.out.println("메뉴>");
			int gameNo = Integer.parseInt(sc.nextLine());
			
			if(gameNo == 1) {
				System.out.println("주사위 크기>");
				num = Integer.parseInt(sc.nextLine());
				if(num < 5 || num > 10) {
					System.out.println("범위 밖입니다");
				}
			}else if(gameNo ==2) {
				//5가 나올 때 까지 주사위를 몇번 굴리는지 구하고 출력
				gameAry = new int[num];
				for(int i = 0 ; i < gameAry.length ; i++) {
					if(gameAry[i] == 5)
					gameAry[i] = (int)(Math.random()*i);
					System.out.println("나올 때 까지 주사위를 " + "번 굴렸습니다");
				}
			}else if(gameNo ==3) {
				for( int i = 0 ; i < gameAry.length ; i++) {
					System.out.println();
				}
				
			}else if(gameNo == 4) {
				//if(max<){
				//max = ;
				//}
				//System.out.println("가장 많이 나온 수는" + "입니다")
			}else if(gameNo ==5) {
				System.out.println("프로그램 종료");
				break;
			}
			
			
			
			
			
		}
		
		
		
		
		
		
	}
}
