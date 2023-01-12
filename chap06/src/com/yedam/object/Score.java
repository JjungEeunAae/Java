package com.yedam.object;

public class Score {
	//필드
	int kor;
	int math;
	int eng;
	//생성자
	Score(int kor, int math, int eng){	
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	//메소드
	//총합, 평균
	
	//총합
	int getSum() { //1번
		return kor + math + eng;
	}
	
	double getAvg() { //2번
		int sum = getSum(); //1번 호출
		return sum/3.0;
	}
	
	void getInfo() { //3번
		int sum = getSum(); //1번 호출
		double avg = getAvg(); //2번 호출
		
		System.out.println("성적 합계 : " + sum);
		System.out.println("성적 평균 : " + avg);
	}
	
	
}
