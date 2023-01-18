package com.yedam.java.subject02;
//Notebook 인터페이스를 정의한다.
public interface Notebook {
	//다음과 같이 상수 필드를 정의한다.
	//상수
	public static final int NOTEBOOK_MODE = 1;
	
	
	//추상 메소드
	
	//문서를 작성하는 기능
	public abstract void writeDocumentaion();
	//임터넷을 검색하는 기능
	public abstract void searchInternet();
}
