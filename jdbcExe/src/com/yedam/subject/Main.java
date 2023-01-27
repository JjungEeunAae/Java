package com.yedam.subject;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static MemberDAO dao = new MemberDAO();
	static BoardDAO bdao = new BoardDAO();
	static String id ="";
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("1) 회원가입 2) 로그인 | 99) 종료");
			System.out.println("메뉴 선택>>");
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				//회원가입
				signUp();
			} else if(select == 2) {
				//로그인
				login();	
			} else if(select == 99) {
				//종료
				break;
			} else {
				System.out.println("Error!!!\n없는 메뉴입니다 메뉴 번호를 확인해주세요");
			}
			
		} //end of while()
		System.out.println("프로그램 종료");
		
	} //end of main()
	
	//회원가입
	public static void signUp() {
		System.out.println("⊱ ────── {.⋅ sign up ⋅.} ────── ⊰");
		System.out.println("⊱ ── {.⋅ 순서대로 입력해주세요 ⋅.} ── ⊰");
		System.out.print(" ✿ 아이디>");
		id = sc.nextLine();
		System.out.print(" ✿ 비번> ");
		String pw = sc.nextLine();
		System.out.print(" ✿ 이름> ");
		String name = sc.nextLine();
		System.out.print(" ✿ 주소> ");
		String addr = sc.nextLine();
		System.out.print(" ✿ 전화번호> ");
		String tel = sc.nextLine();
		System.out.print(" ✿ 생일> ");
		int birth = Integer.parseInt(sc.nextLine());
		System.out.print(" ✿ 이메일> ");
		String email = sc.nextLine();
		
		MemberVO m = new MemberVO();
		m.setMemberId(id);
		m.setMemberPw(pw);
		m.setMemberName(name);
		m.setMemberAddr(addr);
		m.setMemberTel(tel);
		m.setMemberBirth(birth);
		m.setMemberEmail(email);
		
		if(dao.addMember(m)>0) {
			System.out.println("-ˋˏ ༻✿༺ ˎˊ-");
			System.out.println("✿Well Come✿");
		} else {
			System.out.println("에러발생!!");
		}
	}
	
	public static void login() {
		System.out.println("⊱ ────── {.⋅ login ⋅.} ────── ⊰");
		System.out.print(" ✿ 아이디> ");
		id = sc.nextLine();
		System.out.print(" ✿ 비번> ");
		String pw = sc.nextLine();
		//당일날짜 받아오기
//		Date date = new Date();
//		SimpleDateFormat formatter = new SimpleDateFormat("MMdd");
		//System.out.println(formatter.format(date));
		
		if(dao.getlogin(id, pw) > 0) {
			System.out.println("✩‧ ₊˚ * .⋆ ·ฺ⁺˚      ᘏ⑅ᘏ ₊ * ⋆ ·ฺ. ✩* . ⋆·ฺ . ⁺˚\n"
							+ "‧₊˚.⋆·ฺ . ∗̥✩⁺˚ ੈ‧˚૮꒰˵• ﻌ •˵꒱აੈ✩‧₊˚ੈ*:ﾟ*｡.⋆ ·ฺᐝ. ∗̥⁺˚");
			System.out.println("       *＊✿❀　"+id+" 님 환영합니다!　❀✿＊*");
			System.out.println();
			while(true) {
				System.out.println("게시판메뉴>  1) 게시글목록 | 2) 단건조회 | 3) 게시글등록 | 4) 게시글수정\n"
									+ "마이페이지> 0) 로그아웃 | 88) 회원탈퇴 | 99) 종료");
				System.out.println("메뉴선택> ");
				int meun = Integer.parseInt(sc.nextLine());
				if(meun == 1) {
					//게시글목록조회
					board();
				}else if(meun == 2) {
					//단건조회
					oneBoard();
				}else if(meun == 3) {
					//게시글등록
					postadd();
				}else if(meun == 4) {
					//게시글수정
					postModify();
				}else if(meun == 0) {
					//로그아웃
					System.out.println("로그아웃 하시겠습니까?");
					System.out.println("y 또는 n을 입력해주세요");
					String yesORno = sc.nextLine();
					if(yesORno.equals("y")) {
						System.out.println("로그아웃 완료되었습니다\n또 들려주세요!");
						break;
					} else if(yesORno.equals("n")) {
						System.out.println("다시 게시판으로 돌아가시겠습니까?");
						System.out.println("y 또는 n을 입력해주세요");
						String yesORno2 = sc.nextLine();
						if(yesORno2.equals("y")) {
							continue;
						}
					}
				}else if(meun == 88) {
					remove();
					break;
				}else if(meun == 99) {
					System.out.println("게시판종료");
					break;
				}
			}
		} else {
			System.out.println("로그인 실패!");
			System.out.println("다시 로그인 해주세요");
		}
	}
	
	//게시글 전체목록
	public static void board() {
		System.out.println("                         전체 게시글ヽ(✿ﾟ▽ﾟ)ノ");
		System.out.println("»—————————————–—————————–—————————–—————————–—————–—————————–«");
		List<BoardVO> list = bdao.boardVoList();
		for(BoardVO b : list) {
			System.out.println(b.toString());
			System.out.println("»—————————————–—————————–—————————–—————————–—————–—————————–«");
		}
		System.out.println("맨 아래입니다");
		System.out.println();
	}
	
	//게시글 단건조회
	public static void oneBoard() {
		System.out.print("조회하고자 하는 글번호를 입력하세요>");
		int num = Integer.parseInt(sc.nextLine());
		BoardVO bSelect = bdao.getBoard(num);
		if(bSelect != null) {
			System.out.println(bSelect);
		} else {
			System.out.println("조회할 정보가 없습니다");
		}
	}
	
	//게시글 작성
	public static void postadd() {
		System.out.println("====게시글 등록을 시작합니다====");
		String writer = id;
		System.out.println("작성자 : " + writer);
		System.out.print("글제목>");
		String title = sc.nextLine();
		System.out.print("글내용>");
		String content = sc.nextLine();
		
		BoardVO b = new BoardVO();
		b.setPostTitle(title);
		b.setPostContent(content);
		b.setWriter(writer);
		
		if(bdao.postInsert(b)>0) {
			System.out.println("게시글이 작성되었습니다!!");
		}else {
			System.out.println("게시글이 작성되지 않았습니다");
		}
	}
	
	//게시글 수정
	public static void postModify() {
		String writer = id;
		System.out.println("작성자 > " + writer);
		List<BoardVO> list = bdao.getSelectBoard(writer);
		if(list == null) {
			System.out.println("작성한 글이 없습니다");
		}else {
			for(BoardVO b : list) {
				System.out.println(b.toString());
				System.out.println("»—————————————–—————————–—————————–—————————–—————–—————————–«");
			}
		
			System.out.print("수정하고자 하는 글번호를 입력하세요>>");
			int num = Integer.parseInt(sc.nextLine());
			String title = null;
			String content = null;
			BoardVO b = bdao.getBoard(num);
		
			//본인 아이디의 게시글만 지우게 하기
			if(!b.getWriter().equals(id)) {
				System.out.println("--error--error--e");
				System.out.println("|본인 게시글이 아닙니다|");
				System.out.println("error--error--err");
			} else if(b.getWriter().equals(id)) {
				while(num>0) {
					System.out.println("1) 글 제목 | 2) 글 내용");
					int postSelect = Integer.parseInt(sc.nextLine());
					if(postSelect == 1) {
						System.out.println("글 제목 수정");
						title = sc.nextLine();
						break;
					}else if(postSelect == 2){
						System.out.println("글 내용 수정");
						content = sc.nextLine();
						break;
					}
				}
				if(bdao.postUpdate(title, content, writer, num) > 0) {
					System.out.println("수정되었습니다");
				} else {
					System.out.println("수정되지 않았습니다");
				}
			}
		}
	}
	
	//회원탈퇴
	public static void remove() {
		System.out.println("회원탈퇴를 진행합니다");
		String removeId = id;
		System.out.println("아이디> " + removeId);
		System.out.print("비번> ");
		String pw = sc.nextLine();
		System.out.print("이름> ");
		String name = sc.nextLine();
		
		MemberVO m = new MemberVO();
		m.setMemberId(removeId);
		m.setMemberPw(pw);
		m.setMemberName(name);
		
		if(dao.deleteMember(m)>0) {
			System.err.println("탈퇴완료");
		} else {
			System.out.println("탈퇴실패");
		}
	}
} //end of class()
