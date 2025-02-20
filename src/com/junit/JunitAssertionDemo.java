package com.junit;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAssertionDemo {

	@Ignore
	@Test
	public void test1() {
		int a=23,b=34;
//		Assert.assertTrue(a<b);
		Assert.assertFalse(a>b);
	}
	
	@Ignore
	@Test
	public void test2() {
		String name1="tnavi";
		String name2=null;
		
//		Assert.assertNull(name2);
		Assert.assertNotNull(name1);
	}
	@Ignore
	@Test
	public void test3() {
//		int a=10,b=10;
//		Assert.assertEquals(b, a);
		String name="Pratixa",name1="pratixa";
		Assert.assertSame(name, name1);
	}
	@Ignore
	@Test
	public void test4() {
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4};
		Assert.assertArrayEquals(a, b);
	}
	
	@Test
	public void test5() {
		fail("Self failed!!!");
	}
}
