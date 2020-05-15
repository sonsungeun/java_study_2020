package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입금액과 메뉴를 입력받고
		// 메뉴 : 1.커피음료(3500), 2.이온음료(2500), 3.물(1500), 4.과일쥬스(4000)
		// 선택한 음료, 입금액, 잔돈 출력(부가세 10% 포함)
		esc: while (true) {
			// 정보 입력
			System.out.print("입금액 : ");
			int input = sc.nextInt();
			String drink = "";
			int dan = 0;
			int vat = 0;
			int output = 0;
			System.out.println("메뉴 :  1.커피음료(3500)\n\t2.이온음료(2500)\n\t3.물(1500)\n\t4.과일쥬스(4000)");
			System.out.print("메뉴를 선택하세요 : \n(단, 부가세 포함)");
			int num = sc.nextInt();
			
			// 정보 가공
			switch (num) {
			case 1:
				drink = "커피음료";
				dan = 3500;
				break;
			case 2:
				drink = "이온음료";
				dan = 2500;
				break;
			case 3:
				drink = "물";
				dan = 1500;
				break;
			case 4:
				drink = "과일쥬스";
				dan = 4000;
				break;
			default:
				System.out.println("잘못된입력입니다.");
				continue esc;
			}

			vat = (int) (dan * 0.1);
			output = input - (dan + vat);
			System.out.println("선택한 음료 : " + drink);
			System.out.println("입금액 : " + input);
			System.out.println("잔돈 : " + output);
			while (true) {
				System.out.println("계속하시겠습니까?(1.yes, 2.no)");
				int pick = sc.nextInt();
				if (pick == 1) {
					continue esc;
				} else if (pick == 2) {
					break esc;
				} else {
					System.out.println("잘못된입력입니다.");
				}
			}
		}
		System.out.println("이용해주셔서 감사합니다.");

	}
}
