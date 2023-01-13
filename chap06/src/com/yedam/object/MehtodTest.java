package com.yedam.object;

public class MehtodTest {
	public static void main(String[] args) {
		//인스턴스 객체를 생성
		//class에 아무런 정보가 없어도 오류가 뜨지 않는다.
		//StringUtil su = new StringUtil(); 
		
		//static
		//객체 생성할 필요없이 클래스 이름으로 바로 접근이 가능하다.
		StringUtil.greet();
		
		//Integer 또한 static
		//Integer.parseInt(null);
		
		StringUtil.greet("goodDay");
		
		int result = StringUtil.grretLength("goodDay");
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
