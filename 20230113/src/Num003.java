
public class Num003 {
	public static void main(String[] args) {
		int[] coinUnit = new int[4];
		int money = 2680;
		
		System.out.println("money = " + money);
		
		for(int i = 0 ; i < coinUnit.length ; i++) {
			if(money >= 500) {
				
				//            2680/500 = 5
				coinUnit[i] = money / 500; //해당 동전이 몇 개인지?
				//money = money - (coinUnit[i]*500);
				money = money % 500; //나머지는 해당 금액이 동전으로 바꼈을 때 해결하지 못한 금액
				System.out.println("500원 : " + coinUnit[i] + "개");
				System.out.println("남은금액 : " + money + " 원");
				
			} else if(money >= 100) {
				coinUnit[i] = money / 100;
				money = money % 100;
				System.out.println("100원 : " + coinUnit[i] + "개");
				System.out.println("남은금액 : " + money + " 원");
				
			} else if(money >= 50) {
				coinUnit[i] = money / 50;
				money = money % 50;
				System.out.println("50원 : " + coinUnit[i] + "개");
				System.out.println("남은금액 : " + money + " 원");
				
			} else if(money >= 10) {
				coinUnit[i] = money / 10;
				money = money % 10;
				System.out.println("10원 : " + coinUnit[i] + "개");
				System.out.println("남은금액 : " + money + " 원");
				
			}
			
		}
	}
}
