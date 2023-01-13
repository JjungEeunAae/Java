import java.util.Scanner;

public class Num_005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dice = null;
		int Size = 0;
		
		boolean run = true;
		
		while(true) {
			System.out.println("=== 1.주사위크기 2.주사위굴리기 3.결과보기 4.가장 많이 나온 수 5.종료 ===");
			System.out.println("메뉴>");
			int gameNo = sc.nextInt();
			
			if(gameNo == 1) {
				System.out.println("주사위 크기>");
				Size = sc.nextInt();
				if(Size < 5 || Size > 10) {					
					System.out.println("범위 밖입니다");
					System.out.println("5에서 10 사이의 수를 입력하세요");
				}
				dice = new int[Size];
			}else if(gameNo ==2) {
				//돌아가는 횟수를 담을 변수 선언
				int count = 0;
				//5가 나올 때까지 돌아가는 while문
				while(true) {
					//입력한 값 만큼 랜덤 돌리기
					int random = (int)(Math.random() * Size ) + 1;
					System.out.println("랜덤 숫자 " + random);
					//랜덤으로 나온 숫자를 -1해서 dice 인덱스에 해당하는 방에 1씩 증가
					//만약 입력한 값이 4면 4개의 값이 랜덤으로 돌아가고
					//랜덤으로 나온 숫자가 dice 배열의 인덱스에 집어넣는다.
					//만약 4라는 숫자가 나오면 dice[4-1]++
					//dice[3] 인덱스에 숫자 1을 넣어준다.
					dice[random-1]++;
					//돌아가는 횟수만큼 1씩 증가
					count++;
					//만약 랜덤값이 5면 while문 종료
					if(random ==5) break;
				}
				//5가 나올 때 까지 주사위를 몇 번 굴리는지 구하고 출력
				System.out.println("5가 나올 때 까지 주사위를 " + count + "번 굴렸습니다.");
			}else if(gameNo ==3) {
				//결과보기
				//2번에서 while문을 통해 얻은 배열값을 통해 결과 값 내기
				for(int i = 0 ; i < dice.length ; i++) {
					System.out.printf("%d은 %d번 나왔습니다.\n" , (i+1), dice[i]);
				}
			}else if(gameNo == 4) {
				int max = 0;
				//가장 많이 나온 수
				for(int num : dice) { //대입받을 변수 : 배열명
					//num은 dice의 인덱스에 해당되는 값을 받았다
					
					//max < dice[0], max < dice[1] ...
					//dice에 담긴 배열의 길이만큼 인덱스 값을 비교한다
					if(max < num) {
						//제일 큰 인덱스 값을 찾아서 max 변수에 할당
						max = num;    
					}
				}
				
				//가장 많은 횟수가 나온 주사위 숫자 찾기
				//i한테 max 값을 받아올 수 있는 방법
				int i = 0 ;
				for(; i<dice.length; i++) {
					//dice[0] == max , dice[1] == max ...
					//max 값과 동일한 숫자가 나오면 for문을 빠져나간다.
					if(dice[i]==max) break;
				}
				// i에는 max 값과 동일한 값이 저장되고, i는 dice의 인덱스이기 때문에
				// 주사위 숫자로 나오게 하려면 i+1을 해야한다.
				System.out.println("가장 많이 나온 수는 " + (i+1) + "입니다.");
				
			}else if(gameNo ==5) {
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}
		sc.close();
	}
}
