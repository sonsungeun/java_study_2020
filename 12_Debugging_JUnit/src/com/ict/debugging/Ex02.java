package com.ict.debugging;

import java.util.Scanner;

public class Ex02 {
		public static void main(String[] args) {
			Ex02 test = new Ex02();
			String msg =  "4"; 
			test.setData(msg);
			System.out.println(1);
			String msg2 = test.setData2(msg);
			System.out.println(2);
			int msg3 = Integer.parseInt(msg2);
			for (int i = 1; i < 10; i++) {
				System.out.println(msg2 + "*" + i + "=" + (msg3 * i));
			}
		}
		public void setData(String msg) {
			System.out.println(msg);
		}
		public String setData2(String msg) {
			System.out.println(msg);
			String str = null;
			if(msg.length() >= 1) {
				str = msg.substring(0,1);
			}
			return str;
		}
}
