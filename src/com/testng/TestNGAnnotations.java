package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	
	@BeforeClass
	public void beforeTest() {
		System.out.println("before test");
	}

	@BeforeMethod
	public void before() {
		System.out.println("before every method");
	}
	@Test
	public void test() {
		System.out.println("this is my test");
	}
	@Test
	public void test1() {
		System.out.println("this is my test 1");
	}
	
	@AfterMethod
	public void after() {
		System.out.println("after every method");
	}
	@AfterClass
	public void afterTest() {
		System.out.println("after test");
	}
	
}
