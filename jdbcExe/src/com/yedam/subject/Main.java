package com.yedam.subject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static MemberDAO dao = new MemberDAO();
	static BoardDAO bdao = new BoardDAO();
	static String id = "";
	// 당일날짜 받아오기
	static Date date = new Date();
	static SimpleDateFormat formatter = new SimpleDateFormat("MMdd");
	static SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy년 MM월 dd일");
	// System.out.println(formatter.format(date));

	public static void main(String[] args) {
		// 회원관리 메뉴
		B: while (true) {
			System.out.println(
					"──────── ❝ Member ❞ ────────\n" + "1) 회원가입 | 2) 로그인 | 99) 종료\n" + "────────────────────────────");
			System.out.print("»»메뉴선택»» ");
			int select = Integer.parseInt(sc.nextLine());
			if (select == 1) {
				// 회원가입
				signUp();
			} else if (select == 2) {
				// 로그인
				System.out.println("⊱ ────── {.⋅ login ⋅.} ────── ⊰");
				System.out.print(" ✿ 아이디> ");
				id = sc.nextLine();
				System.out.print(" ✿ 비번> ");
				String pw = sc.nextLine();

				// 로그인이 되었을 때 게시판 메뉴로 입장
				if (dao.getlogin(id, pw) > 0) {
					// 게시판 메뉴
					MemberVO m = dao.getMember(id);
					// System.out.println(m.getMemberBirth().toString());

					if (m.getMemberBirth().equals(formatter.format(date))) {
						birthday(); // 생일축하인사
					} else {
						wellCome(); // 웰컴인사
					}
					A: while (true) {
						System.out.println(
								"┍━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ⋆⋅☆⋅⋆ ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┑\n"
										+ " 1) 게시글목록 | 2) 단건조회 | 3) 게시글등록 | 4) 게시글수정 | 5) 게시글삭제 | 6) 마이페이지 | 99) 종료\n"
										+ "┕━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ⋆⋅☆⋅⋆ ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┙");
						System.out.print("»»메뉴선택»» ");
						int meun = Integer.parseInt(sc.nextLine());
						if (meun == 1) {
							// 게시글목록조회
							board();
						} else if (meun == 2) {
							// 단건조회
							oneBoard();
						} else if (meun == 3) {
							// 게시글등록
							postadd();
						} else if (meun == 4) {
							// 게시글수정
							postModify();
						} else if (meun == 5) {
							// 게시글삭제
							boardRemove();
						} else if (meun == 6) {
							// 마이페이지(로그아웃, 회원탈퇴, 이전페이지)
							System.out.println("┍━━━━━━━━━━━━━━ ⋆⋅☆⋅⋆ ━━━━━━━━━━━━━━┑\n"
									+ " 0) 로그아웃 | 8) 회원탈퇴 | 9) 이전페이지\n" + "┕━━━━━━━━━━━━━━ ⋆⋅☆⋅⋆ ━━━━━━━━━━━━━━┙");
							System.out.print("»»메뉴선택»» ");
							int myPageMenu = Integer.parseInt(sc.nextLine());
							C: while (true) {
								if (myPageMenu == 0) {
									// 로그아웃
									String logout = id;
									System.out.println("로그아웃 하시겠습니까?");
									System.out.print("»»y 또는 n을 입력해주세요»» ");
									String yesORno = sc.nextLine();
									if (yesORno.equals("y")) {
										System.out.println("로그아웃 완료되었습니다! 또 들려주세요!");
										if (id.equals(logout)) {
											break A;
										}
									} else if (yesORno.equals("n")) {
										System.out.println("다시 게시판으로 돌아가시겠습니까?");
										System.out.print("»»y 또는 n을 입력해주세요»» ");
										String yesORno2 = sc.nextLine();
										if (yesORno2.equals("y")) {
											// 게시판으로 돌아가기
											break;
										} else if (yesORno2.equals("n")) {
											// 게시판으로 안돌아가겠다고하니 다시 로그아웃할건지 안할건지 물어보기
											continue;
										} else {
											// y와 n이 아닌 다른걸 입력했을 때 안내 띄우기
											System.err.println("----------\n!error!\ny 또는 n만 입력해주세요\n----------");
											// 안내 띄우고 다시 로그아웃 할건지 안할건지 물어보기
											continue;
										}
									} else {
										// y와 n이 아닌 다른걸 입력했을 때 안내 띄우기
										System.err.println("----------\n!error!\ny 또는 n만 입력해주세요\n----------");
										// 안내 띄우고 다시 로그아웃 할건지 안할건지 물어보기
										continue;
									}
								} else if (myPageMenu == 8) {
									// 회원탈퇴
									remove();
									// 탈퇴가 완료되면 게시판 메뉴를 넘어 멤버 메뉴로 이동
									break A;
								} else if (myPageMenu == 9) {
									// 이전페이지
									System.out.println("이전 페이지로 돌아갑니다");
									// 마이페이지 메뉴 while문 break 후 게시판 메뉴로 이동
									break C;
								}
							} // 마이페이지 메뉴 while문 end
						} else if (meun == 99) {
							// 게시판 메뉴 종료
							System.out.println("게시판 메뉴가 종료되었습니다");
							// 바로 멤버 메뉴로 가서 프로그램 종료
							break B;
						} else {
							// 현재 메뉴에 있는 번호가 아니면 안내 띄우는 곳
							System.err.println("없는 메뉴 번호입니다!");
						}
					}
				} else {
					// 아이디와 비밀번호가 일치하지 않을 시 안내 띄우기
					System.err.println("로그인 실패! 다시 로그인 해주세요");
				}
			} else if (select == 99) {
				// 종료
				break;
			} else {
				// 현재 메뉴에 있는 번호가 아니면 안내 띄우는 곳
				System.err.println("Error!!!\n없는 메뉴입니다 메뉴 번호를 확인해주세요");
			}
		} // end of while()
		System.out.println("프로그램을 종료합니다");

	} // end of main()

	// 회원가입
	public static void signUp() {
		int idOverLap = dao.confirmId(id);
		System.out.println("⊱ ────── {.⋅ sign up ⋅.} ────── ⊰");
		System.out.println("⊱ ── {.⋅ 순서대로 입력해주세요 ⋅.} ── ⊰");
		System.out.print(" ✿ 아이디> ");
		id = sc.nextLine();
		// 아이디 중복체크
		if (idOverLap > 0) {
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

			if (dao.addMember(m) > 0) {
				System.out.println("-ˋˏ ༻✿༺ ˎˊ-");
				System.out.println("✿Well Come✿");
			} else {
				System.err.println("가입이 정상적으로 되지 않았습니다");
			}
		} else if (idOverLap < 0) {
			System.err.println("아이디 중복!\n" + "정상적으로 가입 진행이 되지 않았습니다\n" + "Member 메뉴로 돌아갑니다!");
		}
	}

	// 게시글 전체목록
	public static void board() {
		System.out.println("»————————————–—————–—————전체 게시글————–—————–—————–————————–«");
		List<BoardVO> list = bdao.boardVoList();
		for (BoardVO b : list) {
			System.out.println(b.toString());
			System.out.println("»————————————–—————————–—————————–————————–—————–—————————–«");
		}
		System.out.println("맨 아래입니다");
		System.out.println();
	}

	// 게시글 단건조회
	public static void oneBoard() {
		System.out.print("»»조회하고자 하는 글번호를 입력하세요»» ");
		int num = Integer.parseInt(sc.nextLine());
		BoardVO bSelect = bdao.getBoard(num);
		if (bSelect != null) {
			System.out.println(bSelect);
		} else if (bSelect == null) {
			System.err.println("조회할 정보가 없습니다");
		}
	}

	// 게시글 작성
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

		if (bdao.postInsert(b) > 0) {
			System.out.println("게시글이 작성되었습니다!!");
		} else {
			System.err.println("게시글이 작성되지 않았습니다");
		}
	}

	// 게시글 수정
	public static void postModify() {
		String writer = id;
		List<BoardVO> list = bdao.getSelectBoard(writer);
		// 해당되는 아이디가 작성한 게시글이 없다면? == 완성
		// isEmpty() --> boolean으로 비어있으면 true, 값이 있으면 false를 반환
		if (!list.isEmpty()) {
			System.out.println(" ✿ " + writer + " 님의 작성한 게시글 내역입니다\n"
					+ "»—————————————–—————————–—————————–—————————–—————–—————————–«");
			for (BoardVO b : list) {
				System.out.println(b.toString());
				System.out.println("»—————————————–—————————–—————————–—————————–—————–—————————–«");
			}

			System.out.print("»»수정하고자 하는 글번호를 입력하세요»» ");
			int num = Integer.parseInt(sc.nextLine());
			String title = null;
			String content = null;
			BoardVO post = bdao.getBoard(num);
			BoardVO b = bdao.getPostNum(num);
			// 만약 입력한 숫자가 없는 게시글 번호라면? == 완성
			if (b.getPostNum(num) > 0) {
				// 본인 글이 아니면 안내 띄우기
				if (!post.getWriter().equals(id)) {
					System.err.println("--error--error--e");
					System.err.println("|본인 게시글이 아닙니다|");
					System.err.println("error--error--err");
				} else if (post.getWriter().equals(id)) {
					while (num > -1) {
						System.out.println("1) 글 제목 | 2) 글 내용 | 9) 이전페이지");
						int postSelect = Integer.parseInt(sc.nextLine());
						if (postSelect == 1) {
							System.out.println("»»수정할 글 제목을 입력해주세요»»");
							title = sc.nextLine();
							if (bdao.postUpdate(title, content, writer, num) > 0) {
								System.out.println("︵‿︵‿୨♡୧‿︵‿︵\n" + " complete!");
							} else {
								System.err.println("error!");
							}
							break;
						} else if (postSelect == 2) {
							System.out.println("»»수정할 글 내용을 입력해주세요»»");
							content = sc.nextLine();
							if (bdao.postUpdate(title, content, writer, num) > 0) {
								System.out.println("︵‿︵‿୨♡୧‿︵‿︵\n" + " complete!");
							} else {
								System.err.println("error!");
							}
							break;
						} else if (postSelect == 9) {
							System.out.println("이전 페이지로 이동합니다");
							break;
						}
					}
				}
			} else if (b.getPostNum(num) == 0) {
				// 쿼리문을 통해 데이터가 없는 글번호를 눌렀을 때 0으로 리턴되게 했음
				System.err.println("입력한 번호는 등록된 게시글 번호가 아닙니다");
			}
		} else if (list.isEmpty()) {
			System.err.println("[ " + writer + " ] 님께서는 [수정]할 글이 없습니다\n-----이전 페이지로 돌아갑니다-----");
		}
	}

	// 게시글삭제
	public static void boardRemove() {
		String writer = id;
		List<BoardVO> list = bdao.getSelectBoard(writer);
		if (list.isEmpty()) {
			System.err.println("[ " + writer + " ] 님께서는 [삭제]할 글이 없습니다\n-----이전 페이지로 돌아갑니다-----");
		} else if (!list.isEmpty()) {
			System.out.println("====게시글 삭제를 진행합니다===");
			System.out.println(" ✿ 작성자 : " + writer + " 님");
			System.out.print("»»삭제할 게시글 번호를 입력해주세요»» ");
			int postNum = Integer.parseInt(sc.nextLine());
			BoardVO post = bdao.getBoard(postNum);
			BoardVO bNum = bdao.getPostNum(postNum);
			BoardVO b = new BoardVO();
			b.setPostNum(postNum);
			b.setWriter(writer);
			// 데이터에 없는 글번호를 입력하면 안내 띄우기
			if (bNum.getPostNum() > 0) {
				// 본인 글 아니면 안내 띄우기
				if (!post.getWriter().equals(writer)) {
					System.err.println("본인글이 아닙니다!");
				} else if (post.getWriter().equals(writer)) {
					if (bdao.deleteBoard(b) > 0) {
						System.out.println("︵‿︵‿୨♡୧‿︵‿︵\n" + " complete!");
					} else {
						System.err.println("게시글 삭제 실패!");
					}
				}
			} else if (bNum.getPostNum() == 0) {
				System.err.println("존재하지 않는 글번호입니다");
			}
		}
	}

	// 회원탈퇴
	public static void remove() {
		System.out.println("회원탈퇴를 진행합니다");
		String removeId = id;
		System.out.println("»»아이디»» " + removeId);
		System.out.print("»»비번»» ");
		String pw = sc.nextLine();
		System.out.print("»»이름»» ");
		String name = sc.nextLine();

		MemberVO m = new MemberVO();
		m.setMemberId(removeId);
		m.setMemberPw(pw);
		m.setMemberName(name);

		if (dao.deleteMember(m) > 0) {
			System.out.println("탈퇴가 완료되었습니다");
		} else {
			System.err.println("정보가 일치하지 않습니다");
		}
	}

	// 생일일 때 생일축하 띄우기
	public static void birthday() {
		System.out.println("                                                                 \r\n"
				+ "                                                                 \r\n"
				+ "|   |                        |    o     |    |        |          \r\n"
				+ "|---|,---.,---.,---.,   .    |---..,---.|--- |---.,---|,---.,   .\r\n"
				+ "|   |,---||   ||   ||   |    |   |||    |    |   ||   |,---||   |\r\n"
				+ "`   '`---^|---'|---'`---|    `---'``    `---'`   '`---'`---^`---|\r\n"
				+ "          |    |    `---'                                   `---'\r\n");
		System.out.println("   ♥오늘은 " + formatter2.format(date) + "♥\n" + "♥♥" + id + "님의 생일을 너무너무 축하드립니다♥♥\n");
	}

	// 생일이 아닐 땐 환영 띄우기
	public static void wellCome() {
		System.out.println(
				"                                            \r\n" + ". . .     |    |                            \r\n"
						+ "| | |,---.|    |        ,---.,---.,-.-.,---.\r\n"
						+ "| | ||---'|    |        |    |   || | ||---'\r\n"
						+ "`-'-'`---'`---'`---'    `---'`---'` ' '`---'\r\n" + "♥♥" + id + " 님 환영합니다♥♥\r\n");
	}
} // end of class()
