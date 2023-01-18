package com.yedam.java.ch03.String;

public class DataUpdateExample {
	public static void main(String[] args) {
		
		//문자열 대치 replace()
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다 :)";
		String newStr = oldStr.replace("자바","JAVA");
		
		System.out.println(oldStr);
		
		//수정이 많아지면 수없이 많은 인스턴스가 저장된다
		System.out.println(newStr);
		
		//인스턴스가 많아지면 성능상 좋지 않기 때문에 이것을 방지하기 위한 StringBuilder가 존재함
		//타입이 다름
		//출력할땐 다르게 해야함
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());	 //Java Program Study
		
		sb.insert(4, "24");
		System.out.println(sb.toString());	 //Java24 Program Study
		
		sb.replace(7, 14, "Book ");
		System.out.println(sb.toString()); //Java24 Book Study
		
		
		String result = sb.toString();
		System.out.println(result);			//Java24 Book Study
		
		//
		sb.delete(0, 4);
		System.out.println(sb.toString()); //24 Book Study
	}
}
