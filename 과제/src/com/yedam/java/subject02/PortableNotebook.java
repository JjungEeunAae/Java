package com.yedam.java.subject02;
//PortableNotebook 클래스를 정의한다.
//Notebook 인터페이스와 Tablet 인터페이스를 구현한 클래스.
//구현클래스
public class PortableNotebook implements Notebook, Tablet {
	//필드
	//MODE, 문서 프로그램, 인터넷 브라우저, 영상종류, 앱종류를 필드로 가지며
	private int mode;			//MODE
	private String document;	//문서 프로그램
	private String browser;		//인터넷 브라우저
	private String video;		//영상종류
	private String app;			//앱종류
	
	//생성자
	//생성자를 이용하여 값을 초기화한다.
	//( 단, MODE 필드는 매개변수를 이용하지 않으며 NOTEBOOK_MODE를 초기값으로 가지며 현재 모드를 출력해준다. )
	public PortableNotebook(String document, String browser, String video, String app) {
		this.mode = Notebook.NOTEBOOK_MODE;
		this.document = document;
		this.browser = browser;
		this.video = video;
		this.app = app;
		System.out.println("NOTEBOOK_MODE");
	}
	
	//메소드
	@Override
	public void watchVideo() {
		System.out.println(video + "를 시청");
	}

	@Override
	//NOTEBOOK_MODE : 현재 모드를 바꾸고 "'앱종류'를 실행."를 출력한다.
	//TABLET_MODE : "'앱종류'를 실행."을 출력한다.
	public void useApp() {
		if(mode == NOTEBOOK_MODE) {
			changeMode();
		}
		System.out.println(app + "을 실행");
	}

	@Override
	public void writeDocumentaion() {
		System.out.println(document + "을 통해 문서를 작성");
	}

	@Override
	public void searchInternet() {
		System.out.println(browser + "를 통해 인터넷을 검색");
	}

	//오버라이딩 한 곳 아님
	//모드를 바꾸고 현재 모드를 출력하는 기능
	//( NOTEBOOK_MODE -> TABLET_MODE / TABLET_MODE -> NOTEBOOK_MODE)
	public void changeMode() {
		if(mode == NOTEBOOK_MODE) {
			mode = TABLET_MODE;
			System.out.println("TABLET_MODE");
		} else {
			System.out.println("NOTEBOOK_MODE");
		}
	}
}
