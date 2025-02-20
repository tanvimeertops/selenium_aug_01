package com.testng;

import static org.testng.Assert.fail;

import org.testng.SkipException;
import org.testng.annotations.Test;

/*
 * 
 */
public class FirstDemo {

	@Test
	public void test1() {
		System.out.println("This Test is Passed");
	}
	
	@Test
	public void test2() {
		System.out.println("This Test is Failed");
		fail();
	}
	
	@Test
	public void test3() {
		System.out.println("this test is skipped!!!");
		throw new SkipException("Self Skipped!!!");
	}
}
