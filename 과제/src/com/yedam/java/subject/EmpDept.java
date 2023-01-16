package com.homework.one;
//EmpDept 클래스를 정의한다.
public class EmpDept extends Employee {
	/*
	- Employee 클래스를 상속한다.
	- 추가로 부서이름을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
	- 추가된 필드의 getter를 정의한다.
	- Employee 클래스의 메소드를 오버라이딩한다.
	*/
	//필드
	private String depName; //부서이름
	
	//생성자
	public EmpDept(String name, int salary, String depName) {
		super(name, salary);
		this.depName = depName;
	}
	
	public void Empdept(String depName) {
		this.depName = depName;
	}
	
	public String getDepName() {
		return this.depName;
	}
	
	//메소드
	@Override
	//public void getInformation() : 이름과 연봉, 부서를 출력하는 기능
	//public void print() : "수퍼클래스\n서브클래스"란 문구를 출력하는 기능
	public void getInformation() {
		System.out.println("이름 : " + name + ", 연봉 : " + salary + ", 부서 : " + depName);
	}
	
	public void print() {
		System.out.print("수퍼클래스\n서브클래스");
	}
	
}
