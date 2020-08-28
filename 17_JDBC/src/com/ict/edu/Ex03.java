package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
		Class.forName("oracle.jdbc.OracleDriver");
		
		String url = "jdbc:oracle:thin:@203.236.220.73:1521:xe";
		String user = "c##euni";
		String password = "1111";
		
		conn = DriverManager.getConnection(url, user, password);
		
		String sql = "insert into members values(members_seq.nextval,'kkkk','9876','킹갓제너럴',99,sysdate)";
		
		stmt = conn.createStatement();
		
		result = stmt.executeUpdate(sql);
		if(result>0) {
			System.out.println("삽입 성공 : "+result+"행이 추가되었습니다.");
			sql = "select * from members order by idx";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
			System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getString(4)+"\t");
			System.out.print(rs.getString(5)+"\t");
			System.out.print(rs.getString(6).substring(0,10)+"\n");
			}
		}else {
			System.out.println("삽입 실패");
		}
		} catch (Exception e) {
			System.out.println("삽입 실패2");
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
