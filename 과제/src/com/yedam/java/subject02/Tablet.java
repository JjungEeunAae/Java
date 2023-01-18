package com.yedam.java.subject02;
//Tablet 인터페이스를 정의한다.
public interface Tablet {
	//다음과 같이 상수 필드를 정의한다.
	//상수
	public static final int TABLET_MODE = 2;
	
	//추상 메소드
	
	//영상을 출력하는 기능
	public abstract void watchVideo();
	//앱을 사용하는 기능
	public abstract void useApp();
}
