package com.yedam.variable;

public class Variable03 {
	public static void main(String[] args) {
		int var1 = 0b1011; //2진수
		int var2 = 0206; //8진수
		int var3 = 365; //10진수
		int var4 = 0xB3; //16진수
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
		int bVar1 = 125; //저장되는 값의 허용 범위 : -128~127
		int bVar2 = 200; //200은 담을 수 없다.
		
		System.out.println("bVar1 : " + bVar1);
		System.out.println("bVar2 : " + bVar2);
		
		//Long
		long lVar1 = 2000000;
		long lVar2 = 20000000000L; //L을 붙혀야 long type으로 본다.
		
		//Char
		char c1 = 'A';
		char c2 = 65; //10진수
		char c3 = '\u0041'; //16진수
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}
}
