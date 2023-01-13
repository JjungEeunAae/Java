package jungeunae;

public class Num04 {
	public static void main(String[] args) {
		
		int[][] gugu = new int[9][9];
		
		for(int i = 1 ; i < 10 ; i++) { //단
			//단보다 곱하는 수가 작거나 같은 경우
			for(int j = 1 ; j < 10 ; j++) { //곱하는 수
				if(i >= j) {
					System.out.println("단 " + i + "\n");
				}
			}
		}
		
		
		
		
		
	}
}
