package com.yedam.java.ch03;

public class Course {
	//<?> => 종류에 상관없이 값을 받을 수 있다
	public static void registerCourse1(Applicant<?> applicant) {
		//getSimpleName() --> 이름이 뭔지?
		//getClass() --> 무슨 클래스인지?
		String message = applicant.kind.getClass().getSimpleName()
						 + "이(가) Coures1을 등록함";
		System.out.println(message);
	}
	
	//나랑 부모클래스만 가능 == Person이랑 Worker만 등록할 수 있는 장소
	//super = 기존이 되는 클래스를 기준으로 위로만 들어올 수 있다
	public static void registerCourse2(Applicant<? super Worker> applicant) {
		//getSimpleName() --> 이름이 뭔지?
		//getClass() --> 무슨 클래스인지?
		String message = applicant.kind.getClass().getSimpleName()
						 + "이(가) Coures2을 등록함";
		System.out.println(message);
	}
	
	//나랑 자식클래스만 가능 == Student, HighStudent, MiddleStudent
	//extends = 선언된 클래스 기준 뒤에 지정된 상속된 클래스까지만 들어올 수 있다
	public static void registerCourse3(Applicant<? extends Student> applicant) {
		//getSimpleName() --> 이름이 뭔지?
		//getClass() --> 무슨 클래스인지?
		String message = applicant.kind.getClass().getSimpleName()
						 + "이(가) Coures3을 등록함";
		System.out.println(message);
	}
	
	
	
}
