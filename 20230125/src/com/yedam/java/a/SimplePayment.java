package com.yedam.java.a;

public class SimplePayment implements Payment {
	private double simplePaymentRatio = 0;
	
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}
	
	@Override
	public int online(int price) {
		//price - price*(simplePaymentRatio+ONLINE_PAYMENT_RATIO)
		int resule = (int)((1-(simplePaymentRatio + ONLINE_PAYMENT_RATIO))*price);
		return resule;
	}

	@Override
	public int offline(int price) {
		int resule = (int)((1-(simplePaymentRatio + OFFLINE_PAYMENT_RATIO))*price);
		return resule;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : " + (ONLINE_PAYMENT_RATIO+simplePaymentRatio));
		System.out.println("오프라인 결제시 총 할인율 : " + (OFFLINE_PAYMENT_RATIO+simplePaymentRatio));
	}

}
