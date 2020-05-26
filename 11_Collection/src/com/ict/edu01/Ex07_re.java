package com.ict.edu01;

import java.util.HashSet;
import java.util.Random;

public class Ex07_re {
	public static void main(String[] args) {
		HashSet<Integer> res = new HashSet<Integer>();
		Random ran = new Random();
		for (int i = 0; i < 6; i++) {
			if (!res.add((int) (ran.nextDouble() * 45 + 1))) {
				i--;
			}
		}
		System.out.print("당첨번호 : ");
		for (Integer k : res) {
			System.out.print(k + "   ");
		}
	}
}
