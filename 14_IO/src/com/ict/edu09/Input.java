package com.ict.edu09;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Input {
public static void main(String[] args) {
	String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io13.txt";
	File file = new File(pathname);
	
	FileInputStream fis = null;
	BufferedInputStream bis = null;
	ObjectInputStream ois = null;
	
	try {
		fis = new FileInputStream(file);
		bis = new BufferedInputStream(fis);
		ois = new ObjectInputStream(bis);
		
		VO msg = (VO) ois.readObject();
		System.out.println(msg.getName());
		System.out.println(msg.getAge());
		System.out.println(msg.getWeight());
		System.out.println(msg.isGender());
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
