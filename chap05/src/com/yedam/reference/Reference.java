package com.yedam.reference;

public class Reference {
	public static void main(String[] args) {
		int intVal = 10;
		int[] array = {1,2,3,4,5,6};
		int[] array2 = {1,2,3,4,5,6};
		int[] array3 = null; //
		
		System.out.println(array); //[I@182decdb 참조타입이 가지고 있는 주소
		System.out.println(array2); //[I@7637f22 참조타입이 가지고 있는 주소
		System.out.println(array==array2);
		System.out.println(intVal);
		
		System.out.println(array3[0]); //정수열 배열에서 데이터를 가져올 수 없다. 왜냐하면 배열에 대한 주소가 없어서! 
	}
}
