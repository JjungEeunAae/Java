package com.yedam.java.ch01;

public class ExceptionExample {

	public static void main(String[] args) {
		//NullPointerException////
		//오류가 났을 때 위치를 알려줌
		//예외가 발생했을 때 메세지와 그게 실제로 발생한 코드를 매칭시켜보면 좀 더 찾아가기 쉽다
		//String data = null;
		//System.out.println(data.toCharArray());
		
		//ArrayIndexOutOfBoundsException
		//실행할 때 값을 주느냐 안주느냐에 따라 실행 또는 에러가 발생함
		
		//if -> 예외처리
//		if(args.length >2) {
//		String data1 = args[0];
//		String data2 = args[1];
//		
//		
//		System.out.println("args[0] : " + data1);
//		System.out.println("args[0] : " + data2);
//		}
		
		
		
		//NumberFormatException
//		String data3 = "100";
//		String data4 = "a100";
//		
//		int value3 = Integer.parseInt(data3);
//		int value4 = Integer.parseInt(data4);
//		
//		int result = value3 + value4;
//		
//		System.out.printf("%s + %s = %d\n",data3,data4,result);
		
		//ClassCastException
		changeDog(new Dog());
		changeDog(new Cat());
		
		
	}
	
	//ExceptionExampl의 클래스
	public static void changeDog(Animal animal) {
		//상속관계가 성립되기 때문에 강제타입변환이 가능함
		//에러는 밑에서부터 위로 올라간다.
		if(animal instanceof Dog) {
		Dog dog = (Dog)animal;
		}
	}
	
}

////NumberFormatException
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
