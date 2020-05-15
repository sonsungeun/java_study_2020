package com.ict.edu;

public class Ex05 {
	// 접근 제한자 : 외부에서 접근하여 사용할 수 있는 단계를 구분
	// public	 : 누구나 다 접근 가능
	// protected : 상속 또는 같은 패키지에서 접근 가능
	// 생략 	 : 같은 패키지에서 접근 가능
	// private	 : 누구나 접근할 수 없다.
	
	public int s1 = 10; 
	protected int s2 = 20; 
	 int s3 = 30; 
	private int s4 = 40; 

	public static int k1 = 10; 
	protected static int k2 = 20; 
	static int k3 = 30; 
	private static int k4 = 40; 
		
	
}
