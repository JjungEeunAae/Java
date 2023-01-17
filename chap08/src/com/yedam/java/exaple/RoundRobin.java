package com.yedam.java.exaple;

public class RoundRobin implements Scheduler {
	// 상담원 한 명씩 돌아가며 동일하게 상담 업무를 배분
	
	//상담원 입장에서 다음 전화
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");

	}
	
	//배분 방법을 결정하는 곳
	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다");

	}

}
