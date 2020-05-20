package com.ict.edu01;

public class Ex04 {
	// 내부 클래스 : 클래스 안에 다른 클래스가 정의되어있는 클래스
	// 종류 : Member, Local, static, Anonymous
	// 1. Member : 외부클래스{멤버필드, 생성자, 내부클래스{...}, 멤버메소드 }
	//			 - 내부클래스는 외부클래스의 멤버(필드, 메소드)들을 마음대로 사용할 수 있다.(상속과 유사점)
	//			 - 상속에서는 private 멤버는 접근불가, but 내부클래스에서는 private도 접근 가능하다.(상속과 차이점)
	//			 - 외부클래스를 통해서 내부클래스를 객체 생성한다.
	//			   즉, 내부클래스가 별도로 객체생성을 할 수 없다.
	
	// 2. Local : 외부클래스 메소드 안에 내부클래스가 존재(결합성빠방~커플링빠방~)
	//			  외부클래스의 지역변수처럼 사용
	//			  (메소드가 실행될때 생성가능, 메소드가 종료될때 내부클래스도 지워진다.)
	//

	// 3. static : Member내부클래스처럼 외부클래스 안에 존재하는 클래스
	//			   내부클래스의 멤버변수는 기본적으로 static을 사용할 수 없는데
	//			   어쩔수 없이 내부클래스 멤버변수에 static을 사용하고자 할때 
	//			   내부클래스에 static을 붙인다.
	//			   외부클래스{멤버필드, 생성자, static 내부클래스{static...}, 멤버메소드 }
	// 			   내부클래스 멤버는 일반 static처럼 사용하면 된다.
	
	// **4. Anonymous(익명) : 정의된 클래스의 이름이 없는 클래스
	//						  다시 호출할 수 없다.
	//						  일회용으로 한번 사용하고 다시 사용할 수 없다.

}
