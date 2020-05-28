package com.ict.edu6;

public class Test_main {
	public static void main(String[] args) {
		Car car = new Car();
		
		Customer cutomer = new Customer(car);
		Producer producer = new Producer(car);
		
		new Thread(producer).start();
		new Thread(cutomer).start();
		
	}
}
