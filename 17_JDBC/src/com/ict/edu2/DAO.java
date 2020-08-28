package com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


// DAO : Data Access Object
// - Database의 data에 접근하기 위한 객체
// - CRUD 작업을 처리하는 메소드를 만들어서 제공한다.

public class DAO {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	int result;
	
	// 싱글톤 패턴 : 하나의 인스턴스만을 생성하고, 사용할 수 있다.
	// (하나의 객체만 생성하고 사용해야 할 때, 적용할 수 있는 패턴.)
	
	private static DAO dao = new DAO();
	
	public static DAO getInstance () {
		return dao;
	}
	
	// 접속
	public Connection getConnection() {
		try {
				Class.forName("oracle.jdbc.OracleDriver");
				String url = "jdbc:oracle:thin:@203.236.220.73:1521:xe";
				String user = "c##euni";
				String password = "1111";
				conn = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
		}
		return conn;
	}
	
	// select
	public void getSelect() {
		try {
			String sql = "select * from members order by idx";
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("IDX\tID\tPW\tNAME\tAGE\tREG");
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getString(5)+"\t");
				System.out.print(rs.getString(6).substring(0,10));
				System.out.println();
			}
		} catch (Exception e) {
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
	
	// insert
	public void getInsert(String m_id, String m_pw, String m_name, String m_age) {
		try {
			conn = getConnection();
			String sql = "insert into members values(members_seq.nextval,'"+m_id+"','"+m_pw+"','"+m_name+"','"+m_age+"',sysdate)";
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result>0) {
				getSelect();
			}else {
				System.out.println("삽입실패");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				conn.close();
				stmt.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	// delete
	public void getDelete(String idx) {
		try {
			String sql = "delete from members where idx ="+idx;
			conn = getConnection();
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("삭제 후 데이터");
				getSelect();
			}else {
				System.out.println("삭제실패");
			}
			
		} catch (Exception e) {
			System.out.println("삭제실패2"+e);
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
	
	// update
	public void getUpdate(String idx, String age) {
		try {
			String sql = "update members set m_age ="+age+"where idx ="+idx;
			conn = getConnection();
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result>0) {
				System.out.println("갱신 후 데이터");
				getSelect();
			}else {
				System.out.println("갱신실패");
			}
		} catch (Exception e) {
			System.out.println("갱신실패2"+e);
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
