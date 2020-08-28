package com.ict.edu5;

import java.util.ArrayList;
import java.util.Scanner;


public class Ex01 {

	// 데이터 베이스 내용 출력
	public static void listPrn(ArrayList<VO> list) {
		System.out.println();
		System.out.println("IDX\tID\tPW\tNAME\tAGE\tREG");
		for (VO vo : list) {
			System.out.print(vo.getIdx()+"\t");
			System.out.print(vo.getM_id()+"\t");
			System.out.print(vo.getM_pw()+"\t");
			System.out.print(vo.getM_name()+"\t");
			System.out.print(vo.getM_age()+"\t");
			System.out.print(vo.getM_reg()+"\n");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("선택하시오");
		System.out.println("1. 테이블 데이터 보기");
		System.out.println("2. 테이블 데이터 삽입");
		System.out.println("3. 테이블 데이터 삭제");
		System.out.println("4. 테이블 데이터 갱신");
		System.out.println("5. 로그인");
		System.out.print(">>>  ");
		int su = sc.nextInt();
		ArrayList<VO> list = null;
		switch (su) {
		case 1:
			list = DAO.getInstance().getSelect();
			listPrn(list);
			break;
		case 2:
			System.out.println("정보를 입력하세요");
			System.out.print("아이디 : ");
			String m_id = sc.next();
			System.out.print("비밀번호 : ");
			String m_pw = sc.next();
			System.out.print("이름 : ");
			String m_name = sc.next();
			System.out.print("나이 : ");
			String m_age = sc.next();
			list = DAO.getInstance().getInsert(m_id, m_pw, m_name, m_age);
			listPrn(list);
			break;
		case 3:
			list = DAO.getInstance().getSelect();
			listPrn(list);
			System.out.print("삭제할 idx >> ");
			String idx = sc.next();
			list = DAO.getInstance().getDelete(idx);
			System.out.println("갱신 후 테이블");
			listPrn(list);
			break;
		case 4:
			list = DAO.getInstance().getSelect();
			listPrn(list);
			System.out.print("갱신할 idx >> ");
			String idx1 = sc.next();
			System.out.print("갱신할 나이 >> ");
			String age = sc.next();
			list = DAO.getInstance().getUpdate(age, idx1);
			listPrn(list);
			break;
		case 5:
			System.out.println();
			System.out.print("  I D  :  ");
			String log_id = sc.next();
			System.out.print("  P W  :  ");
			String log_pw = sc.next();
			list = DAO.getInstance().getLogIn(log_id, log_pw);
			if (list.size()==1) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패");
			}
			break;
		}
		System.out.println();
		System.out.println();
		System.out.println("수고하셨습니다.");
		
	}
}
