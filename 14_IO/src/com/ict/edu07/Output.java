package com.ict.edu07;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Output {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io10.txt";
		File file = new File(pathname);

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 여러개의 객체 정보를 담아보자
			VO vo1 =new VO("고길동", 34, 70.4, true);
			VO vo2 =new VO("마이콜", 50, 180.3, true);
			VO vo3 =new VO("둘리", 5000, 470, true);
			VO vo4 =new VO("희동이", 3, 15.5, false);
			VO vo5 =new VO("도우너", 21, 43.6, false);
			
			ArrayList<VO> list = new ArrayList<VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			// 객체 직렬화
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
