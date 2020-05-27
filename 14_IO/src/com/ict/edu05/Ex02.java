package com.ict.edu05;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

// OutputStreamWriter : OutputStream -> Writer (바이트스트림을 문자스트림으로)
// OutputStream -> OutputStreamWriter -> Writer -> BufferedWriter

public class Ex02 {
	public static void main(String[] args) {
		//System.out.println("hello world");
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		

		
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			bw.write("Welcome 대한민국");
			bw.flush();
		} catch (Exception e) {
		}finally {
			try {
				bw.close();
				osw.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
