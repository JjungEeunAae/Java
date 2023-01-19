package com.yedam.java.ch03;

public class Applicant<T> {
	public T kind; //해당 대상자의 신분
	
	public Applicant(T kind) {
		this.kind = kind;
	}
}
