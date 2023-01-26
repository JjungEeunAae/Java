package com.yedam.subject;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static MemberDAO dao = new MemberDAO();
	public static void main(String[] args) {
		while(true) {
			System.out.println("1) ȸ������ 2) �α��� | 88) ȸ��Ż�� | 99) ����");
			System.out.println("�޴� ���� >>");
			
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				signUp();
			} else if(select == 2) {
				
			} else if(select == 88) {
				System.out.println("ȸ��Ż�� �����մϴ�");
				System.out.print("���̵�>");
				String id = sc.nextLine();
				System.out.print("���>");
				String pw = sc.nextLine();
				System.out.print("�̸�>");
				String name = sc.nextLine();
				
				//�����Է��� �Ǿ����....^_��...
				if(dao.deleteMember(id) > 0 && dao.deleteMemberTwo(pw) > 0) {
					System.err.println("Ż��Ϸ�");
				} else {
					System.out.println("Ż�����");
				}

			} else if(select == 99) {
				break;
			}
			
		} //end of while()
		System.out.println("���α׷� ����");
		
	} //end of main()
	
	public static void signUp() {
		System.out.println("ȸ�������� �����ϰڽ��ϴ�");
		System.out.println("������� �Է����ּ���!");
		System.out.print("���̵�>");
		String id = sc.nextLine();
		System.out.print("���>");
		String pw = sc.nextLine();
		System.out.print("�̸�>");
		String name = sc.nextLine();
		System.out.print("�ּ�>");
		String addr = sc.nextLine();
		System.out.print("��ȭ��ȣ>");
		String tel = sc.nextLine();
		System.out.print("����>");
		int birth = Integer.parseInt(sc.nextLine());
		System.out.print("�̸���>");
		String email = sc.nextLine();
		
		MemberVO m = new MemberVO();
		m.setMemberId(id);
		m.setMemberPw(pw);
		m.setMemberName(name);
		m.setMemberAddr(addr);
		m.setMemberTel(tel);
		m.setMemberBirth(birth);
		m.setMemberEmail(email);
		
		//�����ͺ��̽��� ���̵�� �Է��� ���̵� ���ٸ�
		//�ߺ��̶�� �ȳ��ϱ�
//		if(id == m.getMemberId()) {
//			System.out.println("�ߺ��� ���̵��Դϴ�");
//		}
		
		if(dao.addMember(m)>0) {
			System.out.println("ȸ�������� �����մϴ�");
		} else {
			System.out.println("�����߻�!!");
		}
	}
	
} //end of class()
