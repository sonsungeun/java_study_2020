package com.ict.edu;

public class Ex07 {
	// this는 전역변수에만 사용할 수 있다.
	// 우선순위 : 지역->전역->상속
	private String name = "커피우유";
	private int su=100;
	private int price=1100;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		// 전역변수와 지역변수 이름이 같을 때 
		// 전역변수에 this.를 붙인다.
		// 이유 : 전역변수와 지역분수의 이름이 같으면 무조건 지역변수가 우선순위가 되므로 지역변수만 사용하게 된다.
		//		  따라서 전역변수를 구분해주어야 함.
		// 지역변수는 해당메소드를 호출할때 생성됨
		this.name = name;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


}
