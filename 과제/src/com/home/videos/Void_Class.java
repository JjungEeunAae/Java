package com.home.videos;

public class Void_Class {
	int gas;
	
	//method
	void setGas(int gas) {
		this.gas = gas;
	}
	
	//gas가 남아있냐 안남아있냐 논리형
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다(gas 잔량 : " + gas + ")");
				gas--;
			} else {
				System.out.println("멈춥니다(gas 잔량 : " + gas + ")");
				return;
			}
		}
	}
	
	
	
}
