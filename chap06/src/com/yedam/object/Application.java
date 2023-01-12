package com.yedam.object;

import java.util.Scanner;

//class 외부
public class Application {
	public static void main(String[] args) {
		//클래스 생성해서 객체 만든 다음 객체 바로 사용.
		//객체를 한 곳에 모아서 관리하는 형태
		//배열
		//int[] ary = new int[4]; ->숫자 4개 넣을 수 있는 배열
		//학생 열 명을 배열의 인덱스에 넣어서 정보를 관리하는 시스템
		//student[] stdAry = new Student[10];
		
		//학생 정보 보관하는 배열
		Student[] stdAry = null;
		int stdNum = 0;
		Scanner sc = new Scanner(System.in);
		//while문을 활용하여 학생 관리 프로그램 작성
		while(true) {
			System.out.println("===================================================");
			System.out.println("1. 학생 수 | 2. 정보 입력 | 3. 정보 확인 | 4. 분석 | 5. 종료");
			System.out.println("===================================================");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				/*Student 클래스로 만들어지는 객체를
				  몇개나 배열에 넣을지에 대한 값을 받아옴*/
				System.out.println("학생 수>");
				stdNum = Integer.parseInt(sc.nextLine());
			}else if(selectNo == 2){
				stdAry = new Student[stdNum];
				for(int i = 0 ; i < stdAry.length ; i++) {
					// Student s1 = new Student();
					stdAry[i] = new Student();
					System.out.println("이름>");
					stdAry[i].name = sc.nextLine();
					System.out.println("나이>");
					stdAry[i].age = Integer.parseInt(sc.nextLine());
					System.out.println("학교>");
					stdAry[i].schoolName = sc.nextLine();
					
					//성적 입력
					System.out.println("국어>");
					stdAry[i].kor = Integer.parseInt(sc.nextLine());
					System.out.println("영어>");
					stdAry[i].eng = Integer.parseInt(sc.nextLine());
					System.out.println("수학>");
					stdAry[i].math = Integer.parseInt(sc.nextLine());
					
				}
			}else if(selectNo == 3) {
				for(Student std : stdAry) {
					std.getInfo();
				}
			}else if(selectNo == 4) {
				int total = 0;
				double avg = 0;
				System.out.println("전체 학생 총합 / 평균 조회");
				for(int i = 0 ; i < stdAry.length ; i++) {
					
					total = stdAry[i].kor + stdAry[i].eng + stdAry[i].math;
					
					avg = total / 3.0;
					System.out.println(stdAry[i].name + " 학생>");
					System.out.println("총합 : " + total +  ", " + "평균 : " + avg);
				}
				//시험 젤 잘 친 과목, 못 친 과목 확인
				int max = 0;
				int min = 0;
				for(int i = 0 ; i < stdAry.length ; i++) { //각 인덱스의 클래스를 꺼내는 for문
							max = stdAry[i].kor;
							min = stdAry[i].kor;
						
							if (stdAry[i].eng < stdAry[i].math) {
								if (max < stdAry[i].math) {
									max = stdAry[i].math;
								}
							} else {
								if (max < stdAry[i].eng) {
									max = stdAry[i].eng;
								}
							}
							System.out.println(stdAry[i].name + "최고 성적 : " + max);
						}

				
			}else if(selectNo == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		//데이터 타입에 변수를 만들고 새로운 생성자를 생성
		//s1, s2 => 인스턴스 : 클래스로부터 만들어진 객체
//		Student s1 = new Student();
//		Student s2 = new Student();
		
//		System.out.println(s1); //com.yedam.object.Student@26f0a63f
//		System.out.println(s2); //com.yedam.object.Student@4926097b
		
		//dot 연산자(점)
		
//		//s1이라는 객체(힙 영역에 있는 주소) 안에 해당 데이터가 저장됨
//		s1.age = 20;
//		s1.name = "예담";
//		s1.schoolName = "예담대학교";
//		
//		//Student class의 메소드를 가져와서 출력하는 부분
//		s1.getInfo();
//		System.out.println();
//		
//		s2.age = 30;
//		s2.name = "대예담";
//		s2.schoolName = "예담대학원";
//		
//		//Student class의 메소드를 가져와서 출력하는 부분
//		s2.getInfo();

//		s1.getInfo();
//		System.out.println();
//		
//		s1.age = 20;
//		s1.name = "대학생";
//		
//		System.out.println("학생의 나이 : " + s1.age);
//		System.out.println("학생의 이름 : " + s1.name);
//		System.out.println("학생이 재학중인 학교 : " + s1.schoolName);
//		System.out.println();
//		
//		s1.getInfo();
		
//		Korean k1 = new Korean("김김김","0000-0000");
//		
//		System.out.println("k1이 가지고 있는 필드 값 >");
//		System.out.println(k1.nation);
//		System.out.println(k1.name);
//		System.out.println(k1.ssn);

		
		
	}
}
