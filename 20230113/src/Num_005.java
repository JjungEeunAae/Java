import java.util.Scanner;

public class Num_005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dice = null;
		int Size = 0;
		
		//boolean run = true;
		
		while(true) {
			System.out.println("=== 1.주사위크기 2.주사위굴리기 3.결과보기 4.가장 많으 나온 수 5.종료 ===");
			System.out.println("메뉴>");
			int gameNo = sc.nextInt();
			
			if(gameNo == 1) {
				System.out.println("주사위 크기>");
				Size = Integer.parseInt(sc.nextLine());
				if(Size < 5 || Size > 10) {
					System.out.println("범위 밖입니다");
					System.out.println("5에서 10 사이의 수를 입력하세요");
				}
				dice = new int[Size];
			}else if(gameNo ==2) {
				int count = 0;
				while(true) {
					int random = (int)(Math.random() * Size ) + 1; //곱하는건 10부터 얼마나 요구하는가?
					dice[random-1]++;
					count++;
					if(random ==5) break;
				}
				System.out.println("5가 나올 때 까지 주사위를 " + count + "번 굴렸습니다.");
				//5가 나올 때 까지 주사위를 몇번 굴리는지 구하고 출력
			}else if(gameNo ==3) {
				for(int i = 0 ; i < dice.length ; i++) {
					System.out.printf("%d은 %d번 나왔습니다.\n" + (i+1), dice[i]);
				}
			}else if(gameNo == 4) {
				int max = 0;
				//가장 많이 나온 수
				for(int num : dice) {
					if(max < num) {
						max = num;
					}
					int i = 0;
					for(; i<dice.length; i++) {
						if(dice[i]==max) break;
					}
					System.out.println("가장 많이 나온 수는 " + (i+1) + "입니다.");
				}
			}else if(gameNo ==5) {
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}
		sc.close();
	}
}
