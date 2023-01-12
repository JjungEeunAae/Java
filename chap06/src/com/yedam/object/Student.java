package com.yedam.object;

//class 내부
public class Student {
	//필드 : 객체의 속성( 정보, 데이터 )이 저장되는 부분
	//이름, 나이, 학교명
	//변수만 선언했을 뿐 데이터는 존재하지 않음
	String name;
	int age;
	String schoolName;
	int kor;
	int eng;
	int math;
	
	//생성자 : 객체 초기화( 생성 )할 때 사용하는 부분
	//생성자는 클래스 이름과 동일해야 함.
	Student(){
		
	}
	
	//메소드 : 객체를 생성 후에 기능을 사용할 때 정의하는 부분(동작)
	void getInfo() {
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 나이 : " + age);
		System.out.println("학생이 다니고 있는 학교 : " + schoolName);
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
	}
	
}
