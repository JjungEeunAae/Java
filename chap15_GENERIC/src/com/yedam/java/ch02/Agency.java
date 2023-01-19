package com.yedam.java.ch02;
//구현클래스
public class Agency implements Rentable<Home, RentalList> {

	@Override
	public Home rent() {
		return new Home();
	}

	@Override
	public RentalList getCount() {
		return new RentalList();
	}

}
