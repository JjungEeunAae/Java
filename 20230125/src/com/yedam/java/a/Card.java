package com.yedam.java.a;

public class Card {
	private String cardNo;
	private int validDate = 0;
	private int cvc = 0;
	
	public Card(String cardNo , int validDate, int cvc) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
	}
	
	public String getcardNo() {
		return cardNo;
	}
	public int getValidDate() {
		return validDate;
	}
	public int getCvc() {
		return cvc;
	}
	
	public void showCardInfo() {
		System.out.println("카드정보 ( Card NO : " + cardNo + ", 유효기간 : " + validDate + ", CVC : " + cvc + " )");
	}
}
