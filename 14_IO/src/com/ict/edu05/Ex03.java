package com.ict.edu05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex03 {
public static void main(String[] args) {
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;
	
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	
	
	try {
		osw = new OutputStreamWriter(System.out);
		bw = new BufferedWriter(osw);
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		
		bw.write("원하는 문자 : ");
		bw.flush();
		String msg = br.readLine();
		
		bw.write(msg);//받은내용출력
		bw.flush();
		
	} catch (Exception e) {
	}finally {
		try {
			bw.close();
			osw.close();
			
			br.close();
			isr.close();
		} catch (Exception e2) {
		}
	}
}
}
