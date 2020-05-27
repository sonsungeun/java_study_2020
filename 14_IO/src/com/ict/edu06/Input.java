package com.ict.edu06;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

// ObjectInputStream : 객체 입력 스트림, 바이트스트림
// readObject -> 역직렬화 메소드
// 받아서 읽는다. Input, VO 클래스가 필요하다.

public class Input {
public static void main(String[] args) {
	String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io09.txt";
	File file = new File(pathname);
	
	FileInputStream fis = null;
	BufferedInputStream bis = null;
	ObjectInputStream ois = null;
	
	try {
		fis = new FileInputStream(file);
		bis = new BufferedInputStream(fis);
		ois = new ObjectInputStream(bis);
		VO vo = (VO) ois.readObject();
		System.out.println(vo.getName());
		System.out.println(vo.getAge());
		System.out.println(vo.getWeight());
		System.out.println(vo.isGender()); // boolean형은 is로 만들어짐.(get안됨)
		
	} catch (Exception e) {
	}finally {
		try {
	ois.close();
	bis.close();
	fis.close();
		} catch (Exception e2) {
		}
	}
}
}
