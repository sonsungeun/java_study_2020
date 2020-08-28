package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex06 {
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static Scanner sc = new Scanner(System.in);

	public static void showMembers() {
		try {
			String sql = "select * from members order by idx";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("IDX\tID\tPW\tNAME\tAGE\tREG");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getString(5) + "\t");
				System.out.println(rs.getString(6).substring(0, 10));
			}
		} catch (Exception e) {
		}
	}

	public static void insertMembers() {
		try {
			System.out.println("다음을 입력하세요.");
			System.out.print("아이디 : ");
			String c_id = sc.next();
			System.out.print("비밀번호 : ");
			String c_pw = sc.next();
			System.out.print("이름 : ");
			String c_name = sc.next();
			System.out.println("나이 : ");
			String c_age = sc.next();

			String sql  = "insert into members "
					+ "values(members_seq.nextval,'"+c_id+"','"+ c_pw+"','"+c_name+"','"+c_age+"', sysdate)";
			System.out.println(sql);
			
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				showMembers();
			} else {
				System.out.println("삽입실패");
			}
		} catch (Exception e) {
			System.out.println("삽입실패2 : "+ e);
		}
	}

	public static void delMembers(String idx) {
		try {
			String sql = "delete from members where idx =" + idx;
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("========삭제후 데이터=========");
				showMembers();
			} else {
				System.out.println("삭제실패");
			}

		} catch (Exception e) {
			System.out.println("삭제실패2");
		}
	}

	public static void updateMembers(String idx, String age) {
		try {
			String sql = "update members set m_age =" + age + " where idx =" + idx;
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("========갱신후 데이터=========");
				showMembers();
			} else {
				System.out.println("갱신실패");
			}
		} catch (Exception e) {
			System.out.println("갱신실패2");
		}
	}

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@203.236.220.73:1521:xe";
			String user = "c##euni";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);

			System.out.println("메뉴를 선택하세요");
			System.out.println("1. members테이블 보기");
			System.out.println("2. members테이블에 데이터 추가");
			System.out.println("3. members테이블의 데이터 삭제");
			System.out.println("4. members테이블의 데이터 갱신");
			System.out.print(">>>>>");
			int k = sc.nextInt();
			switch (k) {
			case 1:
				showMembers();
				break;
			case 2:
				showMembers();
				insertMembers();
				break;
			case 3:
				showMembers();
				System.out.print("삭제할 데이터의 idx를 입력해주세요 >>>>");
				String idx = sc.next();
				delMembers(idx);
				break;
			case 4:
				showMembers();
				System.out.print("갱신할 데이터의 idx를 입력해주세요>>>>>");
				String idx2 = sc.next();
				System.out.print("갱신할 나이를 입력해주세요>>>>>");
				String age = sc.next();
				updateMembers(idx2, age);
				break;
			}
			System.out.println();
			System.out.println();
			System.out.println("수고하셨습니다.");

		} catch (Exception e) {
			// TODO: handle exception
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
