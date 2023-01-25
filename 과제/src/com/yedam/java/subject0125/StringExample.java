package com.yedam.java.subject0125;

public class StringExample {

	public static void main(String[] args) {
		//Stringbuilder ==> String의 단점을 보안해준다
		//

		//메모리 5개 사용
		String a = "a";
		a += "a";
		a += "a";
		a += "a";
		a += "a";
		
		//메모리 1개 사용
		StringBuilder sb = new StringBuilder();
		sb.append("aaa");	//"aaa"
		sb.append(11);
		sb.append(false);
		
		System.out.println(sb);

	}

}
