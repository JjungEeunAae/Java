package com.home.review;

public class RE0109 {
	public static void main(String[] args) {
		//문제1) 정수형 변수 2개를 선언 후 각각 37과 91의 값을 초기화 한 후 변수를 출력하시오
		int a = 37;
		int b = 91;
		System.out.println("a : " + a + ", " + "b : " + b);
		
		//문제2) 문제 1번의 변수를 이용하여 각 연산을 수행한 결과를 출력하시오
		System.out.println("a+b = " + (a+b));
		System.out.println("a-b = " + (a-b));
		System.out.println("a/b = " + (double)(a/b));
		System.out.println("a*b = " + (a*b));
		System.out.println("a%b = " + (double)(a%b));
		
		//문제3) 각 변수의 값에 맞게 변수 타입을 수정 후 값과 변수 타입을 printf()를 사용하여 출력하시오
		int var1 = 128;
		char var2 = 'B';
		String var3 = "44032";
		long var4 = 100000000000L;
		float var5 = 43.93106f;
		double var6 = 301.3;
		
		// s->문자열 d->정수 f->실수
		System.out.printf("%d\n",var1);
		System.out.printf("%s\n",var2);
		System.out.printf("%s\n",var3);
		System.out.printf("%d\n",var4);
		System.out.printf("%f\n",var5);
		System.out.printf("%5.1f\n",var6);
		
		// 문제4) 아래와 같이 변수가 초기화되어있을 경우 결과값을 저장할 변수의 타입을 지정하고 값을 변수값을 출력하세요.
		byte a1 = 35;
		byte b1 = 25;
		int c = 463;
		long d = 1000L;
		double e = 45.31;
		
		/* 4-1)
		result1 = a + c + d;
		System.out.println(result1);
		*/
		
		/* 4-2 )
		result2 = a + b + c;
		System.out.println(result2);
		*/

		/* 4-3 )
		double e = 45.31;
		result3 = c + d + e;
		System.out.println(result3);	
		*/
		
		long result1 = a1 + c + d;
		int result2 = a1 + b1 + c;
		double result3 = c + d + e;
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		
		
		// 문제5) 아래와 같이 변수가 초기화되어있을 경우 다음과 같이 명시된데로 출력하세요.
		// 출력예시) A278번지10.0
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "번지";
		
		double double1 = (double)intValue4;
		String srt1 = String.valueOf(intValue1+intValue2);
		//String srt2 = String.valueOf(charValue);
		
		// s->문자열 d->정수 f->실수
		System.out.printf("%s%s%d%s%4.1f\n",charValue,srt1,intValue3,strValue,double1);
		
	    /* 추가문제) 아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하세요. 
	    예시) 373 일 경우 3 + 7 + 3 = 13 으로 결과는 13입니다.
	    힌트) 곱하기 연산자 (*), 나누기 연산자( / ) 와 빼기 연산자 ( - ) 를 이용하세요. */
		int value = 485;
		int[] valueAry = new int[3];
		
		valueAry[0] = 4;
		valueAry[1] = 8;
		valueAry[2] = 5;
		System.out.println(valueAry[0]+valueAry[1]+valueAry[2]);
		
		int sum = 0;
		sum = (value/100)+(value%100)/10+(value%10);
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
