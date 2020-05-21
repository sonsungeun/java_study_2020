package com.ict.edu01;

import java.util.TreeSet;
import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		// 로또번호 : 1 - 45 랜덤, 중복 안됨, 6자리
		TreeSet<Integer> lotto1 = new TreeSet<Integer>();
		for (int i = 0; i < 6; i++) {
			Random ran = new Random();
			int k = (int) (ran.nextDouble() * 45) + 1;
			if (!lotto1.add(k)) {
				i--;
			}

		}
		System.out.println(lotto1);
	}
}
