package com.ict.edu;

public class Ex11 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i += 3) {
			for (int j = 1; j < 10; j++) {
				for (int k = i; k < i + 3; k++) {
					if (j == 1 && i == 1)	continue;
					System.out.print(k + " * " + j + " = " + k * j + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}