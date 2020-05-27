package com.ict.edu03;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

// PrintStream은 모든 자료형을 출력할 수 있다.
// 보통은 화면이나 파일에 출력한다.(출력전용)

public class Ex02 {
public static void main(String[] args) {
	String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io05.txt";
	File file = new File(pathname);
	FileOutputStream fos = null;
	BufferedOutputStream bos = null;
	PrintStream ps = null;
	try {
		// 화면에 출력
		System.out.println(true);
		System.out.println(10);
		System.out.println(24.1);
		System.out.println('c');
		System.out.println("Hello");

		// 파일로 출력
		fos = new FileOutputStream(file);
		bos = new BufferedOutputStream(fos);
		ps = new PrintStream(bos);
		ps.print(true);
		ps.print(10);
		ps.print(24.1);
		ps.print('c');
		ps.print("Hello");
		ps.flush();
	} catch (Exception e) {
		// TODO: handle exception
	}finally {
		try {
			ps.close();
			bos.close();
			fos.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
}
}
