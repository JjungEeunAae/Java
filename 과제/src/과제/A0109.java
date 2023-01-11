package 과제;

public class A0109 {
	public static void main(String[] args) {
		//문제1) 정수형 변수 2개를 선언 후 각각 37과 91로 값을 초기화 후 변수를 출력하라.
		int value1 = 37;
		int value2 = 91;
		System.out.println("value1 : " + value1 + " , " + "value2 : " + value2); //1-0
		
		//문제2) 문제 1번의 변수를 이용하여 각 연산을 수행한 결과를 출력하라.
		System.out.println("덧셈 : " + (value2 + value1));   //2-1
		System.out.println("뺄셈 : " + (value2 - value1));   //2-2
		System.out.println("곱셈 : " + (value2 * value1));   //2-3
		System.out.println("나눗셈 : " + (value2 / value1)); //2-4
		
		//문제3) 각 변수의 값에 맞게 변수타입을 수정 후 값과 변수타입을 printf()를 사용하여 출력하세요.
		int var1 = 128;
		char var2 = 'B';
		String var3 = "44032";
		long var4 = 100000000000L;
		float var5 = 43.93106f;
		double var6 = 301.3;
		//printf s->문자열, d->정수, f->실수
		System.out.printf("%d, byte\n", var1);   //3-1
		System.out.printf("%s, char\n", var2);   //3-2
		System.out.printf("%s, Sting\n", var3);  //3-3
		System.out.printf("%d, long\n", var4);   //3-4
		System.out.printf("%f, float\n", var5);  //3-5
		System.out.printf("%f, double\n", var6); //3-6
		
		// 문제4) 아래와 같이 변수가 초기화되어있을 경우 결과값을 저장할 변수의 타입을 지정하고 값을 변수값을 출력하세요.
		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000L;
		double e = 45.31;
		
		long result1 = a + c + d;
		int result2 = a + b + c;
		double result3 = c + d + e;
		
		System.out.println("result1 : " + result1); //4-1
		System.out.println("result2 : " + result2); //4-2
		System.out.println("result3 : " + result3); //4-3
		
		// 문제5) 아래와 같이 변수가 초기화되어있을 경우 다음과 같이 명시된데로 출력하세요.
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "번지";
		
		int intValue5 = intValue1+intValue2; //27
		String intValue6 = String.valueOf(intValue3); //'8'
		String intValue8 = intValue5+intValue6; //'278'
		
		double intValue7 = (double)intValue4; //10.000000
		
		System.out.println(intValue5);
		System.out.println(intValue6);
		System.out.println(intValue7);
		System.out.println("278이여야해 : " + intValue8);
		
		//printf s->문자열, d->정수, f->실수
		//A278번지10.0
		System.out.printf("정답 : %s%s%s%4.1f\n", charValue,intValue8,strValue,intValue7); //5-0
		
		/*추가문제)아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하세요.
		예시) 373 일 경우 3 + 7 + 3 = 13 으로 결과는 13입니다.
		힌트) 곱하기 연산자 (), 나누기 연산자( / ) 와 빼기 연산자 ( - ) 를 이용하세요.*/
		int value = 485;
		int sum = 0;
		
		sum += (value/100)+(value%100)/10+value%10;
		System.out.println("4 + 8 + 5 = " + sum); //추가문제
		
	}
}
