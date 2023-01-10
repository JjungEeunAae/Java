package com.yedam.variable;

public class Varuable04 {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		
		System.out.println(name);
		System.out.println(job);
		
		//이스케이프 문자(console 출력할 때)
		//문자열(String)에 사용
		//\t : tab만큼 벌려라
		//\n : enter
		//\r : 맨 앞줄로 이동
		
		System.out.println("번호\t이름\t직업");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다 "); //문자의 ""를 출력하고자 하면 앞에 \를 입력해야한다.
		System.out.println("봄\\여름\\가을\\겨울"); // \ 뒤에는 실행하고자 하는 명령어가 나와야하기때문에 \를 문자열로 반환하고싶다면 \\으로 기재해야한다
		
		
		//실수
		//float, double
		
		//float
		float var1 = 3.14f;
		double var2 = 3.14; // float var2 = 3.14;로 적으면 기본 double로 인식
		
		float var3 = 0.132546465478f; //자동 반올림이 되어 값을 출력함
		double var4 = 0.156465154; // 기재한 값 그대로 출력
		
		System.out.println("var3 : " + var3);
		System.out.println("var3 : " + var4);
		
		double var6 = 3e6;
		float var7 = 3e6F;
		float var8 = 3e-3F;
		
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
		
		//논리타입(Boolean)
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다");
		}else {
			System.out.println("시작합니다");
		}
	}
}
