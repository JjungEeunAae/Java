package com.yedam.java.ch06.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		//생성
		Date date = new Date();
		System.out.println(date);
		
		//
		SimpleDateFormat sdf = new SimpleDateFormat("yyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow = sdf.format(date);
		System.out.println(strNow);
	}

}
