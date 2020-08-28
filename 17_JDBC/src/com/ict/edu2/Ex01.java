package com.ict.edu2;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("선택하십시오");
	System.out.println("1. 테이블 데이터 보기");
	System.out.println("2. 테이블 데이터 삽입");
	System.out.println("3. 테이블 데이터 삭제");
	System.out.println("4. 테이블 데이터 갱신");
	System.out.print(">>>>    ");
	int su = sc.nextInt();
	
	switch (su) {
	case 1:
		DAO.getInstance().getSelect();
		break;
	case 2:
		System.out.println("정보를 입력하세요");
		System.out.println("아이디 : ");
		String m_id = sc.next();
		System.out.println("패스워드 : ");
		String m_pw = sc.next();
		System.out.println("이름 : ");
		String m_name = sc.next();
		System.out.println("나이 : ");
		String m_age = sc.next();
		DAO.getInstance().getInsert(m_id, m_pw, m_name, m_age);
		break;
	case 3:
		DAO.getInstance().getSelect();
		System.out.println();
		System.out.print("삭제할 IDX : ");
		System.out.println();
		String idx = sc.next();
		DAO.getInstance().getDelete(idx);
		break;
	case 4:
		DAO.getInstance().getSelect();
		System.out.println();
		System.out.print("갱신할 IDX : ");
		System.out.println();
		String idx2 = sc.next();
		System.out.print("갱신할 나이 : ");
		System.out.println();
		String age = sc.next();
		DAO.getInstance().getUpdate(idx2, age);
		
		break;
	}
}
}
