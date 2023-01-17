package com.yedam.java.exaple;

public class LeastJob implements Scheduler {
	//현재 상담 업무가 없거나 상담 대기가 가장 적은 상담원에게 우선 배분
	
	//상담원 입장에서 다음 전화
	@Override
	public void getNextCall() {
		System.out.println("상담 순서를 순서대로 대기열에서 가져옵니다");

	}
	
	//배분 방법을 결정하는 곳
	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당합니다");

	}

}
