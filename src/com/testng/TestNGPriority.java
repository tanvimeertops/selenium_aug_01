package com.testng;

import org.testng.annotations.Test;

public class TestNGPriority {

	@Test(priority = 1)
	public void test() {
		System.out.println("This is Test");
	}
	
	@Test(priority = 3)
	public void best() {
		System.out.println("This is best");
	}
	
	@Test(priority = 0)
	public void fest() {
		System.out.println("This is fest");
	}
	
	@Test(priority = 2)
	public void nest() {
		System.out.println("This is nest");
	}
	
}
