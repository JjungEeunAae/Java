package com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExe {
	public static void main(String[] args) {
		//jdbc 오라클 데이터 CRUD 작업
		//1. ojdbc,jar 라이브러리 추가하기
		//2. Connevtion 객체 --> db연결 쿼리 실행 또는 실행 결과를 가지고 오는 통로
		Connection conn;
		//3. Statement 겍체 --> Connection으로 연결한 객체에게, Query 작업을 실행하기 위한 객체
		Statement stmt = null;
		//4. ResultSet 객체 --> executeQuery(String sql)을 통해 쿼리 실행하면 ResultSet타입으로 반환을 해주어 결과값을 저장
		ResultSet rs = null;
		
		//jdbc driver정상.
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 에러");
			e.printStackTrace();
		} 
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "hr";
		String sql = "insert into employees(employee_id, job_id, last_name, email, hire_date)"
					+ "values(300 , 'IT_PROG' , '홍' , 'HONG' , sysdate)";
		
		//sql = "delete from employees where employee_id = 300";
		//sql = "update employees set first_name = '길동' where employee_id = 300";
		
		try {
			conn = DriverManager.getConnection(url, user, pass);  //요청URL, 유저명, 패스워드명
			System.out.println("연결성공");
			stmt = conn.createStatement(); 						  // 쿼리를 실행하고, 처리결과를 가져오는 클래스(객체)
			//변경(update), 등록(insert), 삭제(delete) 질의어를 할 수 있는 메소드
			int r = stmt.executeUpdate(sql);
			//조회만 할 수 있는 메소드
			rs = stmt.executeQuery("select * from employees order by employee_id");  //쿼리문 작성하는 메소드
																				 	//order by 칼럼 : 칼럼에 맞춰 정렬
			
			while(rs.next()) {
				//조회하고자 하는 칼럼을 기본타입에 맞춰 변환 
				System.out.println("사원번호 : " + rs.getInt("employee_id")
									+ ", 이름 : " + rs.getString("first_name")
									+ ", 이메일 : " + rs.getString("email")
									+ ", 급여 : " + rs.getInt("salary")); 
			}
			System.out.println("end of records");
		} catch (SQLException e) {
			System.out.println("연결실패");
			e.printStackTrace();
		}
		
	}
}
