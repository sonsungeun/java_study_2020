package com.ict.edu04;

import java.io.File;
import java.io.FileReader;

// FileInputStream : read() ; int(아스키코드) => char형변환, read(byte[] b), String 이용
// FileReader 	   : read() ; int(유니코드)   => char형변환, read(char[] b), String 이용
public class Ex03 {
	public static void main(String[] args) {
		

	String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io06.txt";
	File file = new File(pathname);

	FileReader fr = null;

	try {
		fr = new FileReader(file);
		/*
		 * //한글자 읽기 : 모든 글자를 읽어올 수 있다. int k =0; while ((k=fr.read())!=-1) {
		 * System.out.print((char)k); }
		 */
		//char[]
		/*
		 * char[] c = new char[(int)(file.length())]; for (char k : c) {
		 * System.out.println(k); }
		 */
		
		// String
		char[] c =  new char[(int)(file.length())];
		fr.read(c);
		String msg = new String(c);
		System.out.println(msg);
	} catch (Exception e) {
	}finally {
		try {
			fr.close();
		} catch (Exception e2) {
		}
	}
	
	
	}	
}
