package com.yedam.java.ch04.wrapper;

public class BoxingUnboxingExample {

	public static void main(String[] args) {
		
		//Boxing
		//Integer --> 정수만 가능함
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = Integer.valueOf("200");
		//생성자는 권장하지 않는다
		Integer obj3 = new Integer(1000);
		
		//Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		
		//자동박싱
		Integer newObj1 = value1;
		Integer newObj2 = value2;
		
		//자동언박싱
		int result = newObj1 + newObj2;
		System.out.println(result);
		
		//값만 필요하다면?
		int newValue1 = newObj1;
		int newValue2 = newObj2;
		System.out.println(newValue1);
		System.out.println(newValue2);
		
		System.out.println();
		
		//Wrapper 클래스 값 비교
		//값을 넣었지만 인스턴스를 가르키는 주소값이 들어가있음
		//다른 인스턴스를 가지고 있으니까 변수값만 비교했을 땐 false가 나온다
		Integer data1 = 300;
		Integer data2 = 300;
		System.out.println(" == 결과 : " + (data1 == data2));
		
		//제대로 비교하는 방법
		System.out.println("언박싱 후 비교 / == 의 결과 : " + (data1.intValue() == data2.intValue()));
		System.out.println("equals() 결과 : " + data1.equals(data2));
		
		System.out.println();
		
		//비교할 때 특정범위 안일때는 기본 타입자와 비교할 수 있도록해준다
		//그 범위가 작을 뿐
		System.out.println("예외사항");
		Integer data3 = 30;
		Integer data4 = 30;
		System.out.println(" == 결과 : " + (data3 == data4));
		System.out.println("언박싱 후 비교 / == 의 결과 : " + (data3.intValue() == data4.intValue()));
		System.out.println("equals() 결과 : " + data3.equals(data4));
		
	}

}
