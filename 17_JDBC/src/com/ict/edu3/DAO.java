package com.ict.edu3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


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
	public ArrayList<VO> getSelect() {
		// vo를 담을 컬렉션 만들기
		ArrayList<VO> list = new ArrayList<VO>();
		try {
			String sql = "select * from members order by idx";
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				// 데이터를 vo에 담는다.
				VO vo = new VO();
				vo.setIdx(rs.getString(1));
				vo.setM_id(rs.getString(2));
				vo.setM_pw(rs.getString(3));
				vo.setM_name(rs.getString(4));
				vo.setM_age(rs.getString(5));
				vo.setM_reg(rs.getString(6).substring(0,10));
				list.add(vo);
			}
			// 출력은 main메소드에서 하자
		} catch (Exception e) {
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return list;
	}
	
	// insert
	public ArrayList<VO> getInsert(String m_id, String m_pw, String m_name, String m_age) {
		ArrayList<VO> list = null;
		try {
			conn = getConnection();
			String sql = "insert into members values(members_seq.nextval,'"+m_id+"','"+m_pw+"','"+m_name+"','"+m_age+"',sysdate)";
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result>0) {
				list = getSelect();
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
			}
		}
		return list;
	}
	
	// delete
	public ArrayList<VO> getDelete(String idx) {
		ArrayList<VO> list = null;
		try {
			String sql = "delete from members where idx ="+idx;
			conn = getConnection();
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("삭제 후 데이터");
				list = getSelect();
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
		return list;
	}
	
	// update
	public ArrayList<VO> getUpdate(String idx, String age) {
		ArrayList<VO> list = null;
		try {
			String sql = "update members set m_age ="+age+"where idx ="+idx;
			conn = getConnection();
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result>0) {
				System.out.println("갱신 후 데이터");
				list = getSelect();
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
		return list;
	}
}
