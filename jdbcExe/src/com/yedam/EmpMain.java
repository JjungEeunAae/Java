package com.yedam;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmpMain {
	static EmpDAO dao = new EmpDAO();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("1)목록조회 | 2)단건조회 | 3)입력 | 4)급여변경 | 5)삭제 | 9)종료");
			int meun = sc.nextInt();
			
			if(meun == 5) {
				remove();
			}else if(meun == 4) { //사원번호 , 급여입력. updateEmp(int id, int sal)
				modify();
			}else if(meun == 3) {
				//입력 => 사번, last_name, 이메일, 입사일자, 직무
				input();
			}else if(meun == 2) {
				//단건조회
				cearch();
			} else if(meun == 1) {
				//목록조회
				list();
			} else if(meun == 9) {
				break;
			} else {
				System.out.println("입력한 번호의 메뉴가 없습니다");
				System.out.println("재입력 해주세요");
			}
		} //end of while()
		System.out.println("end of program");
	} //end of main()
	
	public static void list() {  //static메소드 of 인스턴스메소드
	//-------전체조회
//		List<Map<String, Object>> result = dao.empList();//반환유형
//		for(Map<String, Object> map : result) {
//			System.out.println("사원번호: " + map.get("emp_id")
//								+ ", 이름: " + map.get("first_name")
//								+ "-" + map.get("last_name"));
//		}
		List<EmpVO> list = dao.empVoList();
		for(EmpVO emp : list) {
			System.out.println(emp.toString());
		}
	}
	
	public static void cearch() {
		//-------단건조회
		System.out.println("조회하고자 하는 사원번호를 입력하세요>>");
		int id = sc.nextInt();
		//사용자 입력값을 받아서 처리
		EmpVO emp = dao.getEmp(id);
		if(emp == null) {   //반환유형 : EmpVO
			System.out.println("조회된 정보가 없습니다");
			//continue;
		}; 
		System.out.println("조회된 결과 : " + emp);
	}
	
	public static void input() {
		//-------입력(등록)
		System.out.println("사번 입력>>");
		int eid = sc.nextInt();
		sc.nextLine();
		System.out.println("이름을 입력하세요>>");
		String name = sc.nextLine();
		System.out.println("이메일을 입력하세요>>");
		String email = sc.nextLine();
		System.out.println("입사일자를 입력하세요>>");
		String hDate = sc.nextLine();
		System.out.println("직무를 입력하세요>>");
		String job = sc.nextLine();
		
		EmpVO a = new EmpVO();
		a.setEmployeeId(eid);
		a.setLastName(name);
		a.setEmail(email);
		a.setHireDate(hDate);
		a.setJobId(job);
		
		if(dao.addEmp(a)>0) {
			System.out.println("입력성공");
		} else{
			System.out.println("에러발생");
		}
	}
	
	public static void modify() {
		//-------급여변경
		System.out.println("사번번호를 입력하세요>>");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("변경될 급여를 입력하세요>>");
		int sal = sc.nextInt();
		sc.nextLine();
		
		if(dao.updateEmp(id, sal) > 0) {
			System.out.println("변경성공");
		} else {
			System.out.println("변경실패");
		}
	}
	
	public static void remove() {
		//-------사원삭제
		System.out.println("삭제할 사원번호를 입력하세요");
		int eid = sc.nextInt();
		sc.nextLine();
		
		if(dao.deleteEmp(eid) > 0) {
			System.out.println("삭제성공");
		} else{
			System.out.println("삭제실패");
		}
	}
	
} // end of class
