package com.yedam.java.a;

public class TossCard extends Card {


	private String company = "Toss";
	private String cardStaff;
	
	public TossCard(String cardNo, int validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}

	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card NO, " + getcardNo());
		System.out.println("담당직원 - " + cardStaff + ", " + company);
	}
	


	
}
