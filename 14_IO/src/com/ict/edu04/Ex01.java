package com.ict.edu04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

// 문자스트림 : 모든 처리를 2byte씩 처리
// 		 대상 : 세계 모든 언어로 구성된 문서파일을 출력할 때 적합
// 최상위클래스 : Reader(입력), Writer(출력)

// FileOutputStream : 1byte처리, write(int b아스키코드), write(byte[] b)
// FileWriter		: 2byte처리, write(int b유니코드)  , write(char[] b), write(String str)

public class Ex01 {
public static void main(String[] args) {
	String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io06.txt";
	File file = new File(pathname);
	FileWriter fw = null;
	
	try {
	fw = new FileWriter(file);
	fw.write(97);
	fw.write('c');
	char[] c = {'j','a','v','a'};
	fw.write(c);
	fw.write("korea\n안녕하세요\n大韓\n12345");
	fw.flush();
	} catch (Exception e) {
	}finally {
		try{
			
			fw.close();
		
		} catch (Exception e2) {
		}
		
	}
	
}
}
