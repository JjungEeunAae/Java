package com.yedam.java.ch03;

public class MainExample {

	public static void main(String[] args) {
		//Coures1
		Person person = new Person();
		Applicant<Person> applicant = new Applicant<>(person);
		Course.registerCourse1(applicant);
		// = Course.registerCourse1(new Applicant<Person>(new Person()));
		
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		System.out.println();
		
		//Course2
		//super = 기존이 되는 클래스를 기준으로 위로만 들어올 수 있다
		Course.registerCourse2(new Applicant<Person>(new Person()));
		Course.registerCourse2(new Applicant<Worker>(new Worker()));
//		Course.registerCourse2(new Applicant<Student>(new Student()));
//		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
//		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		System.out.println();
		
		//Course3
		//extends = 선언된 클래스 기준 뒤에 지정된 상속된 클래스까지만 들어올 수 있다
//		Course.registerCourse3(new Applicant<Person>(new Person()));
//		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		Course.registerCourse3(new Applicant<Student>(new Student()));
		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
	}

}
