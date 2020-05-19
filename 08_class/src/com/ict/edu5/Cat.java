package com.ict.edu5;

// Tiger클래스가 있긴하지만 추상메소드를 구현하지 않았기 때문에(body를 완성하지 않았기 때문에)
// Tiger를 상속받은 Cat은 Tiger가 완성하지 않은 body를 완성해야함

class Cat extends Tiger {
	@Override
	public void like() {
		System.out.println("그루밍하기");
	};
}

class Cat2 extends Tiger2 {

	@Override
	public void sleep() {

	}

	@Override
	public void like() {
	}

}