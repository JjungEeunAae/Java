package com.yedam.java.ch03.String;

import java.io.UnsupportedEncodingException;

public class Example {
	public static void main(String[] args) {
		//디코딩 : byte[] -> String으로 변환
		byte[] bytes = {72 , 101 , 108 , 108 , 111 , 32 , 74 , 97 , 118 , 97};
		String str = new String(bytes);
		System.out.println(str);
		
		//별도의 문자셋(기준)을 지정하는 경우
		String str2 = "안녕하세요";
		byte[] bytesX = str2.getBytes();
		System.out.println("byteX.length : " + bytesX.length);
		
		//인코딩
		String strX = new String(bytesX);
		System.out.println("bytesX -> strX : " + strX);
		
		try {
			byte[] bytesY = str2.getBytes("UTF-8");
			System.out.println("bytesY.length : " + bytesY.length);
			String strY = new String(bytesY, "EUC-KR");
			System.out.println("bytesY -> sytY : " + strY);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
