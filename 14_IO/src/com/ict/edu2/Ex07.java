package com.ict.edu2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex07 {
	public static void main(String[] args) {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "io03.txt";
		File file = new File(pathname);

		FileOutputStream fos = null;
		// 속도향상을 위해 Buffer 사용, 혼자서는 사용 못함
		BufferedOutputStream bos = null;

		try {
			// 스트림 체인 방식
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			// 하나 쓸 수 있다.
			bos.write(105); //i
			bos.write('c');
			bos.write('t');
			
			// 배열이용
			byte[] b = {'e','d','u'};
			bos.write(b);
			
			// String이용 
			String msg = "Hello world";
			byte[] b2 = msg.getBytes();
			bos.write(b2);
			bos.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (bos != null)
					bos.close();
				if (fos != null)
					fos.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
