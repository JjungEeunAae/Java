package jungeunae;

public class Num03 {
	public static void main(String[] args) {
		int[] coinUnit = new int[4];
		int money = 2680;
		System.out.println("money = " + money);
		for(int i = 0 ; i < coinUnit.length ; i++) {
			if(money%2==0){
				System.out.println(".");
			}
		}
	}
}
