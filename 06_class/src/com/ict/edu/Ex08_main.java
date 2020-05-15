package com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		Ex08 coffee = new Ex08();
		coffee.setName("커피음료");
		coffee.setPrice(1000);

		Ex08 ion = new Ex08();
		ion.setName("이온음료");
		ion.setPrice(1500);

		Ex08 cola = new Ex08();
		cola.setName("탄산음료");
		cola.setPrice(1200);

		Ex08 juice = new Ex08();
		juice.setName("과일음료");
		juice.setPrice(2000);

		/*
		 * Ex08[]arr = new Ex08[4]; arr[0]=coffee; arr[1]=ion; arr[2]=cola;
		 * arr[3]=juice;
		 */
		Ex08[] arr = { coffee, ion, cola, juice };
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 투입해주세요 : ");
		int input = sc.nextInt();
		if (input < 1000) {
			System.out.println("금액이 부족합니다.");
		} else {
			System.out.println("커피\t이온\t탄산\t과일");
			for (int i = 0; i < arr.length; i++) {
				if (input >= arr[i].getPrice()) {
					System.out.print(" O\t");
				} else {
					System.out.print("X\t");
				}
			}
			System.out.println();
		}
		System.out.print("선택하세요 >> ");
		String choice = sc.next();
		int output = 0;

		switch (choice) {
		case "커피":
			output = input - arr[0].getPrice();
			break;
		case "이온":
			output = input - arr[0].getPrice();
			break;
		case "탄산":
			output = input - arr[0].getPrice();
			break;
		case "과일":
			output = input - arr[0].getPrice();
			break;

		}
System.out.println("잔돈 : "+output);
	}
}
