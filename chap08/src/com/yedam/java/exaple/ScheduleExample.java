package com.yedam.java.exaple;

import java.util.Scanner;

public class ScheduleExample {
	/*
	 * 문제) 고객 센터에는 전화 상담을 하는 상담원들이 있습니다. 
	 * 		일단 고객 센터로 전화가 오면 대기열에 저장됩니다.
	 * 		상담원이 지정되기 전까지 대기 상태가 됩니다.
	 * 		각 전화를 상담원에 배분하는 정책은 다음과 같이 여러 방식으로 구현할 수 있습니다.
	 * 		1) 순서대로 배분하기 : 모든 상담원이 동일한 상담 건수를 처리하도록 들어오는 전화 순서대로 상담원에게 하나씩 배분합니다.
	 * 		2) 짧은 대기열 찾아 배분하기 : 고객 대기 시간을 줄이기 위해 상담을 하지 않는 상담원이나 가장 짧은 대기열을 보유한 상담원에게 배분합니다.
	 * 		3) 우선순위에 따라 배분하기 : 고객 등급에 따라 등급이 높은 고객의 전화를 우선 가져와서 업무 능력이 좋은 상담원에게 우선 배분합니다.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//array, Enum, interface, class만 null값을 가질 수 있다.
		//배열, 클래스, 인터페이스를 생성하여야한다.
		//배열은 괄호가 없기 때문에 배열은 아님
		Scheduler scheduler = null;
		
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당 ");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당 ");
		
		
		String ch = scanner.next();
		
		//추상클래스는 new 연산자를 사용이 불가하다.
		//인터페이스는 생성자 자체가 없기 때문에 new 연산자 사용이 불가하다.
		
		//new 연산자 총 세가지를 확인 할 수 있다.
		//일반 클래스면서 스케줄과 모종의 관계가 있다는 증거
		//자동 타입 변환이 이루어졌음
		if("R".equals(ch) || "r".equals(ch) ) {
			scheduler = new RoundRobin();		// 상담원 한 명씩 돌아가며 동일하게 상담 업무를 배분
		}else if("L".equals(ch) || "l".equals(ch) ) {
			scheduler = new LeastJob();
		}else if("P".equals(ch) || "p".equals(ch)) {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		//두개의 메소드를 호출한 것을 확인된다.
		//스케줄러 안에 있는 인스턴스는 무조건 이 두개를 정의하여야한다.
		//스케줄러라는 타입이 선언된 변수는 어떤 경우에도 이 두개의 코드가 존재한다는 것을 의미
		//공통적인 정보와 공통적인 기능이 필요 없기 때문에 추상 클래스가 아닌 인터페이스로 진행하는게 좋다.
		
		//기능에 대한 내용
		//왼쪽에 변수가 없기 때문에 리턴값이 없다는 것을 알아볼 수 있다.
		scheduler.getNextCall();		//상담원 입장에서 다음 전화
		scheduler.sendCallToAgent();	//배분 방법을 결정하는 곳
	}
}
