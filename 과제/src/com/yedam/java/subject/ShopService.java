package com.yedam.java.subject;

public class ShopService {
	// 책 285페이지 3번
	// getInstance() 메소드로 싱글톤을 얻을 수 있도록 작성하세요.
	
	//필드
	static ShopService instance = new ShopService();
	
	//생성자
	private ShopService() {}
	
	//메소드
	static ShopService getInstance() {
		return instance;
	}
}
