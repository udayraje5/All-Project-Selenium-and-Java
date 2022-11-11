package com.Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestClass 
{
	@Test
	public void testcase1() 
	{
		Assert.assertTrue(true);
		
	}
	@Test
	public void testcase2() 
	{
		Assert.assertTrue(false);
		
	}
	@Test(dependsOnMethods = "testcase2")
	public void testcase3() 
	{
		Assert.assertTrue(true);
		
	}
	@Test
	public void testcase4() 
	{
		Assert.assertTrue(true);
		
	}

}
