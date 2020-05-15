package com.ict.edu;

public class Ex07_main {
	public static void main(String[] args) {
		Ex07 t1 = new Ex07();

		// 이름과 가격을 출력하자
		String name = t1.getName();
		System.out.println(name);
		int price = t1.getPrice();
		System.out.println(price);
		
		// 커피우유를 딸기우유로 변경해서 출력
		t1.setName("딸기우유");
	
		name = t1.getName();
		System.out.println(name);
System.out.println("==================");

Ex07 t2 = new Ex07();
name =t2.getName();
System.out.println(name);
	}
}
