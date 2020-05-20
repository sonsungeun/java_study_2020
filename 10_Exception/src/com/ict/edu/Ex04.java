package com.ict.edu;

import java.util.Scanner;

// throws : 예외전가, 예외양도
//	-  	예외가 발생하면 예외처리를 하지않고, 자신을 호출한곳으로
//		예외객체를 전달한다.
//	-	나중에라도 예외처리(try~catch~)를 하는 것이 좋다.

public class Ex04 {
public void setData(String msg)throws NumberFormatException {
	
	// 인자인 msg의 값이 있으면 
	if (msg.length()>=1) {
		//msg의 첫번째자리의 데이터를 str에 저장해라
		String str = msg.substring(0,1);
		//다른메소드
		prnData(str);
	}
}
public void prnData(String str) throws NumberFormatException {
	int dan = Integer.parseInt(str);
	System.out.println(dan+"단");
	for (int i = 0; i < 10; i++) {
		System.out.println(dan+" * "+i+" = "+dan*i);
	}
}
	public static void main(String[] args)   {
	Ex04 test = new Ex04();
	Scanner sc = new Scanner(System.in);
	try {
		System.out.print("정수를 입력하세요 >> ");
		String msg = sc.next(); 
		test.setData(msg);		
	} catch (Exception e) {
System.out.println("제대로 입력하세요");	}
	
}
}
