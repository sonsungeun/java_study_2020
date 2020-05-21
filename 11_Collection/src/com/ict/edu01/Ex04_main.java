package com.ict.edu01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

//3명, 순위(),출력()
public class Ex04_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Ex04> person = new HashSet<Ex04>();

		esc: while (true) {
			Ex04 p = new Ex04();
			System.out.print("이름 >> ");
			String name = sc.next();
			p.name(name);

			System.out.print("국어성적 >> ");
			int kor = sc.nextInt();

			System.out.print("영어성적 >> ");
			int eng = sc.nextInt();

			System.out.print("수학성적 >> ");
			int math = sc.nextInt();

			p.sum(kor, eng, math);
			p.avg();
			p.hak();
			person.add(p);
			System.out.println("계속할까요?(Y/N)");
			String str = sc.next();
			if (str.equalsIgnoreCase("n"))
				break;
		}
		/*
		 * for (int i = 0; i < 5; i++) { Ex04 test = new Ex04();
		 * System.out.print("이름 >> "); String name = sc.next(); test.name(name);
		 * 
		 * System.out.print("국어성적 >> "); int kor = sc.nextInt();
		 * 
		 * System.out.print("영어성적 >> "); int eng = sc.nextInt();
		 * 
		 * System.out.print("수학성적 >> "); int math = sc.nextInt();
		 * 
		 * test.sum(kor, eng, math); test.avg(); test.hak(); person.add(test); }
		 */
		for (Ex04 k : person) {
			for (Ex04 j : person) {
				if (k.getSum() < j.getSum()) {
					k.setRank(k.getRank() + 1);
				}
			}
		}

		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		Iterator<Ex04> it = person.iterator();
		for (Iterator iterator = person.iterator(); iterator.hasNext();) {
			Ex04 k = (Ex04) iterator.next();
			System.out.println(
					k.getName() + "\t" + k.getSum() + "\t" + k.getAvg() + "\t" + k.getHak() + "\t" + k.getRank());
		}

	}
}