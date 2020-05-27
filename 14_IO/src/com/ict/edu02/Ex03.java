package com.ict.edu02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//1. 바이트 스트림 : 모든 처리를 1byte씩 처리
//대상 : byte로 이루어진 모든 파일 ( 영문자, 숫자, 그림, 소리, 동영상)
//최상위 클래스 : InputStream(입력), OutputStream(출력)

//FileOutputStream 주요메소드
// - read() : int -> 결과가 숫자(아스키코드)로 하나 나옴
//					 char를 형변환해서 문자로 변경해야 한다.

// - read(byte[] b) : int -> 배열 크기를 지정해야 된다.
//							 1byte씩 배열에 저장하고, 읽은 수 만큼 반환

// - close() : open 된 스트림을 닫기 (finally로 처리)
public class Ex03 {
	public static void main(String[] args) {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "io01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		int k2 = 0;
		try {
			fis = new FileInputStream(file);

			// 한글자 읽어오기 : read() -> 숫자로 나온다.
			// int k = fis.read();
			// System.out.println(k+" : "+(char)(k));

			// 한글자씩 계속 읽는 방법 : 그림, 소리, 동영상을 읽는 방법(비영어권은 못읽음)
			/*
			 * while (true) { k2 = fis.read(); // 읽어온 숫자가 -1이면 더이상 읽을 수 없다. if(k2 ==
			 * -1)break; System.out.print(k2+":"+(char)(k2)+"    ");
			 * 
			 * }
			 */

			/*
			 * while ((k2 = fis.read()) != -1) { System.out.print((char)(k2)); }
			 */

			// 배열로 읽어오는 방법(배열 크기만큼만 넣어준다)
			//byte[] b = new byte[20];
			//비영어권 안됨
			//byte[] b = new byte[(byte)(file.length())];
			// 읽어서 byte[]에 넣어준다.(배열 크기만큼만 넣어준다)
			//fis.read(b);
			//for (byte k : b) {
			//	System.out.print((char)(k));
			//}
			
			//String 이용하는 방법 : 비영어권 사용
			byte[] b = new byte[(int)file.length()];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (Exception e2) {
			}

		}

	}
}
