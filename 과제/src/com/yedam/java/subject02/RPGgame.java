package com.yedam.java.subject02;
//RPGgame 클래스를 정의한다.
//Keypad를 구현하는 클래스.
public class RPGgame implements Keypad {
	//현재 모드를 값으로 가지는 필드를 가지며 생성자를 이용하여 값을 초기화한 후 "RPGgmae 실행"을 출력한다.
	//( 단, 매개변수를 이용하지 않으며 최초의 값은 NORMAL_MODE 이다. )
	//- Keypad 인터페이스에 정의된 추상 메서드를 다음과 같이 오버라이딩한다.
	//필드
	private int currentMode;	//현재모드
	
	//생성자
	public RPGgame() {
		//현재모드 값 초기화
		this.currentMode = Keypad.NORMAL_MODE;
		System.out.println("RPGgmae 실행");
	}
	
	//메소드
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");

	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다");

	}

	@Override
	public void rightUpButton() {
		if(currentMode == NORMAL_MODE) {
			System.out.println("캐릭터가 한 칸 단위로 점프한다.");
		} else {
			System.out.println("캐릭터가 두 칸 단위로 점프한다.");
		}
	}

	@Override
	public void rightDownButton() {
		if(currentMode == NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격");
		} else {
			System.out.println("캐릭터가 HIT 공격");
		}

	}

	@Override
	public void changeMode() {
		if(currentMode == NORMAL_MODE) {
			currentMode = HARD_MODE;
			System.out.println("현재모드 : HARD_MODE");
		} else {
			currentMode = NORMAL_MODE;
			System.out.println("현재모드 : NORMAL_MODE");
		}
	}

}
