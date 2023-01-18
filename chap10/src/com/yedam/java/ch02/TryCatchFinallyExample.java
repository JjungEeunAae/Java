package com.yedam.java.ch02;

import java.util.Scanner;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		//일반 예외///
		try {
			Class clazz = Class.forName("java.lang.String2");	//클래스라는 class가 있음(클래스 자체를 들고 있는 class)
		} catch (ClassNotFoundException e) {
			//catch는 모든 예외처리를 넣을 수 있다.
			
			//다른 프로그램과 통신할 때 통신이 불가한 이유가 무수하다.
			//printStackTrace() -> 가장 정확한 예외의 원인을 알고 있는 메소드
			//e.printStackTrace();
			System.out.println("해당 클래스가 존재하지 않습니다");
		}
		
		
		String data1 = null;
		String data2 = null;
		//실행 예외
		try {
			data1 = args[0];
			data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.printf("%s + %s = %d\n" , data1, data2, result);
			
			//강제로 해당 예외클래스를 생성하는 것
			//=임의로 발생시킨다?
			throw new ClassCastException();
			
		} catch(ArrayIndexOutOfBoundsException e){
			//2개의 예외 발생
			System.out.println("실행 매개값의 수가 부족합니다");
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다");
		} catch(Exception e) {
			System.out.println("정상적으로 실행되지 않습니다");
		} finally {
			//return을 하더라도 무조건 실행되는 곳
			//통신이나 다른 프로그램과 연결되는 경우에는 특히나 try-catch-finally를 사용
			//finally는 필수는 아니지만 어떤 경우에도 실행이 되어야 하는 경우에는 사용하여야 함
			System.out.println("프로그램이 종료되었습니다");
		}
		
		
		try {
			findClass();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	//TryCatchFinallyExample의 클래스
	
	//발생시키고자하는 예외클래스를 throws를 사용하여 기재한다
	public static void findClass() throws NullPointerException, ClassNotFoundException {
		String className = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("찾고자 하는 클래스 이름을 적어주세요");
		className = sc.nextLine();
		
		if(className ==null || className.equals("")) {
			throw new NullPointerException();
		}
		
		Class clazz = Class.forName(className);
		
	}
}

