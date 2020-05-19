package com.ict.edu4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 오버로딩 : 한 클래스 안에서 같은이름의 메소드가 여러개 존재하는 것
		// ( 인자의 자료형이나 개수가 다르다)
		
		// 오버라이딩 : 상속관계에서 부모메소드와 자식메소드의 이름이 같은 것
		// 이때 자식클래스가 부모메소드를 갖다 쓰는 대신에
		// 내용은 자기에게 맞게 변경해서 사용하는 것
		// ** 부모메소드가 숨겨진다.(은닉화=캡슐화)
		// ** 같은 메소드를 호출해도 다른 내용을 실행한다.(다형성)

		Animal d = new Dog();
		Animal c = new Cat();
		System.out.println("다 형 성 : 명 령 어 는 같 은 데 실 행 방 법 多");
		System.out.println("********개");
		System.out.println(d.eyes);
		System.out.println(d.legs);
		d.sound();
		d.like();
		System.out.println("********고양이");
		System.out.println(c.eyes);
		System.out.println(c.legs);
		c.sound();
		c.like();
		System.out.println("===============================================");

		Scanner sc = new Scanner(System.in);
		System.out.print("선택하세요(1.고양이, 2.강아지) >> ");
		int res = sc.nextInt();
		/*
		 * switch (res) { case 1: Cat cat = new Cat(); cat.sound(); cat.like();
		 * cat.hobby(); break; case 2: Dog dog = new Dog(); dog.sound(); dog.like();
		 * dog.hobby(); break; }
		 */
		Animal a = null;
		if (res == 1) {
			a = new Cat();

		} else if (res == 2) {
			a = new Dog();
		}
		a.sound();//부모,자식=>오버라이딩
		a.like();//부모
//		a.hobby(); //자식*만* 가지고 있어서 사용 못함
		
		

	}
}
