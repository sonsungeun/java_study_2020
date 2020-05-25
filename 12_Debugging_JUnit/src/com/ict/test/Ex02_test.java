package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex02;

public class Ex02_test {
	Ex02 t2;

	@Before
	public void tBefore(){
		System.out.println("테스트 전 객체 생성");
		t2 = new Ex02();
		
	}
	@Test
	public void test() {
		int res = t2.mul(3, 8);
		assertEquals(21, res);
	}
	
	@After
	public void tAfter() {
		System.out.println("테스트 완료되었습니다.");
	}

}
