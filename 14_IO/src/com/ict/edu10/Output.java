package com.ict.edu10;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Output {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io14.txt";
		File file = new File(pathname);
		Scanner sc = new Scanner(System.in);
		ArrayList<VO> list = new ArrayList<VO>();

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			while (true) {
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("국어성적 : ");
				int kor = sc.nextInt();
				System.out.print("수학성적 : ");
				int math = sc.nextInt();
				System.out.print("영어성적 : ");
				int eng = sc.nextInt();
				VO vo = new VO(name, kor, eng, math);
				list.add(vo);

				System.out.print("추가하시겠습니까?(y/n)");
				String res = sc.next();
				if (res.equalsIgnoreCase("n")) {
					break;
				}
			}
			oos.writeObject(list);
			oos.flush();

		} catch (Exception e) {
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
	}
}
