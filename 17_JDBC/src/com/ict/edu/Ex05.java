package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05 {
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

			String sql = "update members set m_pw ='p9988' where m_name like '마이콜'";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			if (result>0) {
				System.out.println("갱신 성공");
				sql ="select * from members order by idx";
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
				System.out.println("갱신 실패");
			}
		} catch (Exception e) {
			System.out.println("삽입 실패2");
			System.out.println(e);
		} finally {
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
