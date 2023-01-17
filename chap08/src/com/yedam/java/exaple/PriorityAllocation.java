package com.yedam.java.exaple;

public class PriorityAllocation implements Scheduler {
	//고객의 우선 순위에 따라 상담원이 대응함
	
	//상담원 입장에서 다음 전화
	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다");

	}
	
	//배분 방법을 결정하는 곳
	@Override
	public void sendCallToAgent() {
		System.out.println("업무 Skill이 높은(업무 능력이 좋은) 상담원에게 우선적으로 배분합니다");

	}

}
