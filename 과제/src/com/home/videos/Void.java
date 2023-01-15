package com.home.videos;

public class Void {
	public static void main(String[] args) {
		Void_Class vc = new Void_Class();
		
		vc.setGas(5);
		
		boolean gasState = vc.isLeftGas();
		
		//가스가 남아있을 때(isLeftGas가 true가 return되면)
		if(gasState) {
			System.out.println("출발합니다");
			//gas가 0이 되면 return된다(멈춘다)
			vc.run();
		}
		
		//위의 if에서 gas가 0이 될 때까지 돌아가기 때문에 else 값만 나온다.
		if(vc.isLeftGas()) {
			System.out.println("가스 주입이 필요 없습니다");
		} else {
			System.out.println("주입해주세요");
		}
	}
}
