package com.ict.edu6;

public class Main {
	public static void main(String[] args) {
		// super와 super(), this와 this()
		// this : 객체 내부에서 자기 자신을 지칭하는 예약어
		// 전역변수와 지역변수의 이름이 같을때 전역변수 앞에 this.를 붙여서 전역변수임을 알 수 있다.
		// this([인자]) : 객체 생성자를 지칭하는 예약어
		// 생성자에서 다른 생성자를 호출할 때 사용
		// 생성자 첫줄에 사용해야함(반드시)
		// 없으면 생략되어있는 것이다.

		// super : 부모클래스의 멤버필드를 지칭하는 예약어
		// 자식클래스의 전역변수와 이름이 같을때 부모클래스의 멤버필드 앞에 super.을 붙여서 부모클래스의 멤버필드임을 알 수 있다.
		// super([인자]) : 부모의 생성자를 지칭하는 예약어
		// 부모 생성자를 호출할 때 사용
		// 반드시 생성자 첫줄에 존재해야 된다.
		// 없으면 생략되어있는 것이다.

		// this(), super()를 같이 사용할 수 없다.

		Person s = new Student("홍길동학생", 24, 25000);
		Person t = new Teacher("홍길동강사", 30, "자바");
		Person e = new Employee("김길동관리자", 40, "교무과");
		
		//만약에 Person에 print()가 없으면
		//아무리 Student(), Teacher(), employee()에 print()가 있어도
		//사용불가
		//이유 : 선언을 superclass로 하면 superclass에만 있는 ()사용가능
		//		 선언을 subclass로 하면 sup,subclass에 있는 () 둘다 사용가능.
		s.print();
		t.print();
		e.print();

	}
}
