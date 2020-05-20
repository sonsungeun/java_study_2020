package com.ict.edu01;

class Test_A {
	// 인자가 일반클래스
	public void method_A(Test_B b) {
		b.method_B();
	}

	public void method_K(Test_C c) {
		// 인자가 추상클래스
		c.method_C();
	}
}

class Test_B {
	public void method_B() {
		System.out.println("Hello World");
	}
}

abstract class Test_C {
	abstract void method_C();
}

public class Ex08 {
	public static void main(String[] args) {
		Test_A test1 = new Test_A();
		Test_B test2 = new Test_B();
		test1.method_A(test2);
System.out.println("===================");
		Test_A test3 = new Test_A();
		test3.method_A(new Test_B());// 객체생성되어서 b인자로 들어감~ method_A실행~
		System.out.println("===================");
		Test_A test4 = new Test_A();
		test4.method_K(new Test_C() {

			@Override
			void method_C() {
				System.out.println("환영합니다.");
			}
		});
	}
}
