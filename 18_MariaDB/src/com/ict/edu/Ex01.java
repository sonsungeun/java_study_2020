package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex01 {
public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int result = 0;
	try {
		Class.forName("org.mariadb.jdbc.Driver");
		String url = "jdbc:mariadb://203.236.220.73/mydb?autoReconnect=true";
		String user = "euni";
		String password = "1111";
		conn = DriverManager.getConnection(url, user, password);
		
		String sql = "select * from member01 order by idx";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getString(4)+"\t");
			System.out.print(rs.getString(5)+"\t");
			System.out.println(rs.getString(6).substring(0,10));
		}
	} catch (Exception e) {
	}finally {
		try {
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e2) {
		}
	}
	
}
}
