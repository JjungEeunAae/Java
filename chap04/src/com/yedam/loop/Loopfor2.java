package com.yedam.loop;

public class Loopfor2 {
	public static void main(String[] args) {
		//중첩 for문
		//for(){
		//	for(){
		//	}
		//}
		
		//2단~9단출력
		for(int i = 2 ; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.println(i + " * " + j + " = " + ( i * j ));
			}
			System.out.println();
		}
		
		//별찍기
		//*****		for (1행){
		//*****			for(1열){
		//*****			}
		//*****		}
		
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//*		1행 1개
		//**	2행 2개
		//***	3행 3개
		//****	4행 4개
		//***** 5행 5개
		
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//반복문은 i값이 1 또는 0부터 시작하라는 법은 없습니다
		//*****
		//****
		//***
		//**
		//*
		System.out.println();
		
		for(int i = 5 ; i > 0 ; i-- ) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
