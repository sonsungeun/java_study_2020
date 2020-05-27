package com.ict.edu04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//BufferedReader : 속도향상, readLine();->한 줄씩 읽는다. 더이상 읽을 수 없을때 null
public class Ex04 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io07.txt";
		File file = new File(pathname);
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			//한줄읽기
			/*
			 * String msg = br.readLine(); System.out.println(msg);
			 */			
			//모두읽기
			String msg = null;
			String str = "";
			// String은 원래 누적해서 저장하지 않는것이 좋다.
			StringBuffer sb = new StringBuffer();
			while ((msg=br.readLine())!=null) {
				//System.out.println(msg);//바로찍기
//				str = str.concat(msg+"\n") ;//저장하기
				
				sb.append(msg+"\n");// 쌓는 방법
				
			}//System.out.println(str);
			System.out.println(sb.toString());//볼때는 sb.toString()으로 본다.
		} catch (Exception e) {
		}finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
}
