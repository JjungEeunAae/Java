package com.yedam.subject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static MemberDAO dao = new MemberDAO();
	static BoardDAO bdao = new BoardDAO();
	static String id ="";
	static Date date = new Date();
	static SimpleDateFormat formatter = new SimpleDateFormat("MMdd");
	static SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy년 MM월 dd일");
	public static void main(String[] args) {
		//회원관리 메뉴
		while(true) {
			System.out.println("──────── ❝ Member ❞ ────────\n"
								+"1) 회원가입 | 2) 로그인 | 99) 종료\n"
								+"────────────────────────────");
			System.out.print("»»메뉴선택»» ");
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
		int idOverLap = dao.confirmId(id);
		System.out.println("⊱ ────── {.⋅ sign up ⋅.} ────── ⊰");
		System.out.println("⊱ ── {.⋅ 순서대로 입력해주세요 ⋅.} ── ⊰");
		System.out.print(" ✿ 아이디> ");
		id = sc.nextLine();
		//아이디 중복체크
		if(idOverLap > 0) {
		System.out.print(" ✿ 비번> ");
		String pw = sc.nextLine();
		System.out.print(" ✿ 이름> ");
		String name = sc.nextLine();
		System.out.print(" ✿ 주소> ");
		String addr = sc.nextLine();
		System.out.print(" ✿ 전화번호> ");
		String tel = sc.nextLine();
		System.out.print(" ✿ 생일> ");
		String birth = sc.nextLine();
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
				System.out.println("가입이 정상적으로 되지 않았습니다");
				
			}
		} else if(idOverLap < 0){
			System.out.println("아이디 중복!\n"
					+"정상적으로 가입 진행이 되지 않았습니다\n"
					+"Member 메뉴로 돌아갑니다!");
		}
	}
	
	public static void login() {
		System.out.println("⊱ ────── {.⋅ login ⋅.} ────── ⊰");
		System.out.print(" ✿ 아이디> ");
		id = sc.nextLine();
		System.out.print(" ✿ 비번> ");
		String pw = sc.nextLine();
		//당일날짜 받아오기
		//System.out.println(formatter.format(date));
		
		//로그인이 되었을 때 게시판 메뉴로 입장
		if(dao.getlogin(id, pw) > 0) {
			//게시판 메뉴
			MemberVO m = dao.getMember(id);
			//System.out.println(m.getMemberBirth().toString());
			
			if(m.getMemberBirth().equals(formatter.format(date))) {
				birthday();		//생일축하인사
			} else {
				wellCome();		//웰컴인사
			}
			A:while(true) {
				System.out.println("┍━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ⋆⋅☆⋅⋆ ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┑\n"
									+" 1) 게시글목록 | 2) 단건조회 | 3) 게시글등록 | 4) 게시글수정 | 5) 마이페이지 | 99) 종료\n"
									+"┕━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ⋆⋅☆⋅⋆ ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┙");
				System.out.print("»»메뉴선택»» ");
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
				}else if(meun == 5){
					System.out.println("┍━━━━━━━━━━━━━━ ⋆⋅☆⋅⋆ ━━━━━━━━━━━━━━┑\n"
					                  +" 0) 로그아웃 | 8) 회원탈퇴 | 9) 이전페이지\n"
					                  +"┕━━━━━━━━━━━━━━ ⋆⋅☆⋅⋆ ━━━━━━━━━━━━━━┙");
					System.out.print("»»메뉴선택»» ");
					int myPageMenu = Integer.parseInt(sc.nextLine());
						while(true) {
						if(myPageMenu == 0) {
							//로그아웃
							String logout = id;
							System.out.println("로그아웃 하시겠습니까?");
							System.out.println("y 또는 n을 입력해주세요");
							String yesORno = sc.nextLine();
							if(yesORno.equals("y")) {
								System.out.println("로그아웃 완료되었습니다! 또 들려주세요!");
								break A;
							} else if(yesORno.equals("n")) {
								System.out.println("다시 게시판으로 돌아가시겠습니까?");
								System.out.println("y 또는 n을 입력해주세요");
								String yesORno2 = sc.nextLine();
								if(yesORno2.equals("y")) {
									break;
								}
							}
							if(id.equals(logout)) {
								break;
							}
						}else if(myPageMenu == 8) {
							//회원탈퇴
							remove();
							break;
						}else if(myPageMenu == 9) {
							//이전페이지
							System.out.println("이전 페이지로 돌아갑니다");
							break;
						}
					}
				}else if(meun == 99) {
					//게시판 메뉴 종료
					System.out.println("게시판 종료");
					break;
				}
			}
		} else {
			System.out.println("로그인 실패! 다시 로그인 해주세요");
		}
	}
	
	//게시글 전체목록
	public static void board() {
		System.out.println("»————————————–—————–—————전체 게시글————–—————–—————–————————–«");
		List<BoardVO> list = bdao.boardVoList();
		for(BoardVO b : list) {
			System.out.println(b.toString());
			System.out.println("»————————————–—————————–—————————–————————–—————–—————————–«");
		}
		System.out.println("맨 아래입니다");
		System.out.println();
	}
	
	//게시글 단건조회
	public static void oneBoard() {
		System.out.print("»»조회하고자 하는 글번호를 입력하세요»»");
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
		System.out.print("»»글제목»» ");
		String title = sc.nextLine();
		System.out.print("»»글내용»» ");
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
		System.out.println("»» " + writer + " 님의 작성한 게시글 내역입니다\n"
						+ "»—————————————–—————————–—————————–—————————–—————–—————————–«");
		List<BoardVO> list = bdao.getSelectBoard(writer);
		if(list == null) {
			System.out.println("작성한 글이 없습니다");
		} else {
			for(BoardVO b : list) {
				System.out.println(b.toString());
				System.out.println("»—————————————–—————————–—————————–—————————–—————–—————————–«");
			}
		
			System.out.print("»»수정하고자 하는 글번호를 입력하세요»» ");
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
				while(num > -1) {
					System.out.println("1) 글 제목 | 2) 글 내용 | 9) 이전페이지");
					int postSelect = Integer.parseInt(sc.nextLine());
					if(postSelect == 1) {
						System.out.println("»»수정할 글 제목을 입력해주세요»»");
						title = sc.nextLine();
						break;
					}else if(postSelect == 2){
						System.out.println("»»수정할 글 내용을 입력해주세요»»");
						content = sc.nextLine();
						break;
					}else if(postSelect == 9) {
						break;
					}
				}
				if(bdao.postUpdate(title, content, writer, num) > 0) {
					System.out.println("︵‿︵‿୨♡୧‿︵‿︵\n" + " complete!");
				} else {
					System.out.println("error!");
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
	
	public static void birthday() {
		System.out.println("                                                                 \r\n"
				+ "                                                                 \r\n"
				+ "|   |                        |    o     |    |        |          \r\n"
				+ "|---|,---.,---.,---.,   .    |---..,---.|--- |---.,---|,---.,   .\r\n"
				+ "|   |,---||   ||   ||   |    |   |||    |    |   ||   |,---||   |\r\n"
				+ "`   '`---^|---'|---'`---|    `---'``    `---'`   '`---'`---^`---|\r\n"
				+ "          |    |    `---'                                   `---'\r\n");
		System.out.println("   ♥오늘은 "+ formatter2.format(date) +"♥\n"
				+"♥♥"+ id +"님의 생일을 너무너무 축하드립니다♥♥\n");
	}
	
	public static void wellCome() {
		System.out.println("                                            \r\n"
							+ ". . .     |    |                            \r\n"
							+ "| | |,---.|    |        ,---.,---.,-.-.,---.\r\n"
							+ "| | ||---'|    |        |    |   || | ||---'\r\n"
							+ "`-'-'`---'`---'`---'    `---'`---'` ' '`---'\r\n"
							+ "♥♥" + id + " 님 환영합니다♥♥\r\n");
	}
} //end of class()
