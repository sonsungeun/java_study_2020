package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex03;

public class Ex03_test {
	Ex03 t3;

	@Before
	public void tBefore() {
		t3 = new Ex03();
	}

	@Test
	public void test() {
		int res = t3.div(2, 7);
		assertEquals(0, res);
	}

	@After
	public void tAfter() {

	}

}
