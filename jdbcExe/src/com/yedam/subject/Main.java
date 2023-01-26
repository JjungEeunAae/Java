package com.yedam.subject;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static MemberDAO dao = new MemberDAO();
	public static void main(String[] args) {
		while(true) {
			System.out.println("1) 회원가입 2) 로그인 | 88) 회원탈퇴 | 99) 종료");
			System.out.println("메뉴 선택 >>");
			
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				signUp();
			} else if(select == 2) {
				
			} else if(select == 88) {
				System.out.println("회원탈퇴를 실행합니다");
				System.out.print("아이디>");
				String id = sc.nextLine();
				System.out.print("비번>");
				String pw = sc.nextLine();
				System.out.print("이름>");
				String name = sc.nextLine();
				
				//무한입력이 되어벌임....^_ㅜ...
				if(dao.deleteMember(id) > 0 && dao.deleteMemberTwo(pw) > 0) {
					System.err.println("탈퇴완료");
				} else {
					System.out.println("탈퇴실패");
				}

			} else if(select == 99) {
				break;
			}
			
		} //end of while()
		System.out.println("프로그램 종료");
		
	} //end of main()
	
	public static void signUp() {
		System.out.println("회원가입을 진행하겠습니다");
		System.out.println("순서대로 입력해주세요!");
		System.out.print("아이디>");
		String id = sc.nextLine();
		System.out.print("비번>");
		String pw = sc.nextLine();
		System.out.print("이름>");
		String name = sc.nextLine();
		System.out.print("주소>");
		String addr = sc.nextLine();
		System.out.print("전화번호>");
		String tel = sc.nextLine();
		System.out.print("생일>");
		int birth = Integer.parseInt(sc.nextLine());
		System.out.print("이메일>");
		String email = sc.nextLine();
		
		MemberVO m = new MemberVO();
		m.setMemberId(id);
		m.setMemberPw(pw);
		m.setMemberName(name);
		m.setMemberAddr(addr);
		m.setMemberTel(tel);
		m.setMemberBirth(birth);
		m.setMemberEmail(email);
		
		//데이터베이스의 아이디와 입력한 아이디가 같다면
		//중복이라고 안내하기
//		if(id == m.getMemberId()) {
//			System.out.println("중복된 아이디입니다");
//		}
		
		if(dao.addMember(m)>0) {
			System.out.println("회원가입을 축하합니다");
		} else {
			System.out.println("에러발생!!");
		}
	}
	
} //end of class()
