package com.ict.edu;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		// 배열 정렬하기
		int[] su1 = { 3, 4, 9, 5, 6, 1, 7, 2, 10, 8 };
		for (int i = 0; i < su1.length - 1; i++) {
			for (int j = i + 1; j < su1.length; j++) {
				int tmp = 0;
				if (su1[i] > su1[j]) {
					// 내용 바꾸기
					tmp = su1[i];
					su1[i] = su1[j];
					su1[j] = tmp;
				}
			}
		}
		for (int k : su1) {
			System.out.print(k + "  ");
		}
		System.out.println("\n===================");
		int[] su2 = { 3, 4, 9, 5, 6, 1, 7, 2, 10, 8 };
		// Arrays 클래스는 배열 복사, 정렬, List로 변환하는 클래스
		// sort() 메소드로 오름차순만 가능
		Arrays.sort(su2); // java는 오름차순 메소드만 존재
		for (int k2 : su2) {
			System.out.print(k2+"  ");
		}
System.out.println();
		Integer[] su3 = new Integer[] { 3, 4, 9, 5, 6, 1, 7, 2, 10, 8 };
		Arrays.sort(su3, Comparator.reverseOrder());
		for (Integer k3 : su3) {
			System.out.print(k3 + "  ");
		}
	}
}
