package com.yedam.subject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberDAO {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "hr";
	String pass = "hr";
	Connection conn;
	
	PreparedStatement psmt = null; //�Ķ���� �ޱ� �� ���� ��ü
	Statement stmt = null;		   //��ü��ȸ �� �� ����ϱ�
	ResultSet rs = null;
	
	String sql;
	
	public void connect() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			System.out.println("�����߻�");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("�����߻�");
			e.printStackTrace();
		}
	}
	
	
	
	public MemberVO getMember(String id) {
		//�ܰ���ȸ
		sql = "select * from board_member where member_id = " + id;
		connect();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				MemberVO m = new MemberVO();
				m.setMemberId(rs.getString("member_id"));
				m.setMemberPw(rs.getString("member_pw"));
				m.setMemberName(rs.getString("member_name"));
				return m;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public int addMember(MemberVO member) {
		//ȸ�����
		connect();
		sql = "insert into board_member(member_id, member_pw, member_name, member_addr, member_tel, member_birth, member_email)"
				+"values (?,?,?,?,?,?,?)";
		int r = 0;
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getMemberId());
			psmt.setString(2, member.getMemberPw());
			psmt.setString(3, member.getMemberName());
			psmt.setString(4, member.getMemberAddr());
			psmt.setString(5, member.getMemberTel());
			psmt.setInt(6,member.getMemberBirth());
			psmt.setString(7, member.getMemberEmail());
			
			r = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
	
	
	
	public int deleteMember(String id) {
		//ȸ������
		connect();
		sql = "delete from board_member where member_id = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			r = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
	
	public int deleteMemberTwo(String pw) {
		connect();
		sql = "delete from board_member where member_pw = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pw);
			
			r = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
	
	//ID �ߺ� üũ
//	public int confirmId(String id) {
//		connect();
//		int x = -1;
//		ResultSet rs = null;
//		sql = "select * from board_member where member_id = ?";
//		try {
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, id);
//			
//			rs = psmt.executeQuery();
//			
//			if(rs.next()) {
//				x = 1; //�ش� ���̵� ����
//			} else {
//				x = -1;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return x;
//	}
	
	
	
	
	
	
	
}
