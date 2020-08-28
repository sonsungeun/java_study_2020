package com.ict.edu4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex05 {
public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int result = 0;
	
	try {
		// 드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");
		// 접속 정보
		String url = "jdbc:oracle:thin:@203.236.220.73:1521:xe";
		String user = "c##euni";
		String password = "1111";
		conn = DriverManager.getConnection(url,user,password);
		// sql문
		String sql = "update members set m_age =? where idx =?";
		// 구문 생성
		pstmt = conn.prepareStatement(sql);
		
		//바인딩 변수 채우기
		pstmt.setString(1, "17");
		pstmt.setString(2, "27");
		result = pstmt.executeUpdate();
		
		if (result>0) {
			System.out.println("갱신성공");
			sql = "select * from members order by idx";
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
		}else {
			System.out.println("갱신실패");
		}
		
	} catch (Exception e) {
		System.out.println("갱신실패2"+e);
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
