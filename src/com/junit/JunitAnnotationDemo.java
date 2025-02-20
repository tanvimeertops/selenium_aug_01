package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotationDemo {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	
	@Before
	public void before() {
		System.out.println("before every method!!!");
	}
	
	@Test
	public void test1() {
		System.out.println("this is first test");
	}
	
	@Ignore
	@Test
	public void test2() {
		System.out.println("this is second test");
	}
	
	@After
	public void after() {
		System.out.println("after every method!!!");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
	
}
