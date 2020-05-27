package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "io03.txt";
		File file = new File(pathname);

		FileInputStream fis = null;
		// 속도향상을 위해서 사용, 혼자서는 사용할 수 없다.
		BufferedInputStream bis = null;

		try {
			// 스트림 체인방식 - 혼자서 사용할 수 없다.
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);// 체인방식

			// int m = bis.read();
			// System.out.println(m++" : "+(char)(m));

			// 파일의 모든 내용 읽기
			// 1.하나씩 읽기
			/*
			 * int k =0; while((k=bis.read())!=-1) { System.out.println((char)(k)); }
			 */
			// 2.배열
			/*
			 * byte[] b = new byte[(int)file.length()]; bis.read(b); for (byte k : b) {
			 * System.out.println((char)(k)); }
			 */
			// 3.String
			byte[] b = new byte[(int) file.length()];
			bis.read(b);
			String msg = new String(b);
			System.out.println(msg);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (bis != null)
					bis.close();
				if (fis != null)
					fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
