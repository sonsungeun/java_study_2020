package com.ict.edu6;


import java.util.ArrayList;
import java.util.List;

// 자동차 생산 공장
public class Car {
	
	// 자동차 창고
	private List<String> carList = null;
	
	public Car() {
		carList = new ArrayList<String>();
	}
	
	// 랜덤으로 자동차 생산하기 
	public String getCat() {
		String carName = null;
		switch ((int)(Math.random()*3)) {
			case 0: carName="SM5" ; break;
			case 1: carName="매그너스"; break;
			case 2: carName="카렌스"; break;
		}
		return carName;
	}
	
	// 소비자가 자동차를 사는 메소드 
	public synchronized String pop() {
		String carName = null;
		
		// 자동차 창고 재고가 없을 때 판매하지 못함
		if(carList.size() == 0) {
			System.out.println("차가 없어요. 생산할때 까지 기다리세요");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 재고가 있을 때는 가장 나중에 들어간 차를 삭제(판매)
		carName = carList.remove(carList.size()-1);
		System.out.println("손님이 차를 사갔습니다. 판매한 차는 " + carName+"\n");
		return carName ;
	}
	
	// 자동차 창고에 차 넣기 
	public synchronized void push(String car) {
		// 받은 car를 자동차 창고(carList)에 넣기 
		carList.add(car);
		System.out.println("자동차를 만들어 창고 보관 차 이름 : " + car);
		
		// 재고가 없을 때 wait()된 스레드 다시 실행시키기 
		if(carList.size() == 5) {
			notify();
		}
		
	}
}

