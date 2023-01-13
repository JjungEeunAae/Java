package jungeunae;

public class Num03 {
	public static void main(String[] args) {
		int[] coinUnit = new int[4];
		int money = 2680;
		
		for(int i = 0 ; i < coinUnit.length ; i++) {
			//동전 500원 5개, 100원 1개, 50원 1개, 10원 3개가 나오게 출력하시오
			
			//돈이 500원보다 크거나 같으면
			if(money >=500) {
				//동전개수      2680 / 500 = 5
				coinUnit[i] = money / 500;
				//남은금액  2680 / 500의 나머지는 180
				money = money % 500;
				System.out.println("500원 개수 : " + coinUnit[i] + "개");
				System.out.println("남은 금액 : " + money + "원");
			} else if(money >= 100) {
				coinUnit[i] = money / 100;
				money = money % 100;
				System.out.println("100원 개수 : " + coinUnit[i] + "개");
				System.out.println("남은 금액 : " + money + "원");
			} else if(money >= 50) {
				coinUnit[i] = money / 50;
				money = money % 50 ;
				System.out.println("50원 개수 : " + coinUnit[i] + "개");
				System.out.println("남은 금액 : " + money + "원");
			} else if(money >= 10) {
				coinUnit[i] = money / 10;
				money = money % 10;
				System.out.println("10원 개수 : " + coinUnit[i] + "개");
				System.out.println("남은 금액 : " + money + "원");
			}
			
		}
	}
}
