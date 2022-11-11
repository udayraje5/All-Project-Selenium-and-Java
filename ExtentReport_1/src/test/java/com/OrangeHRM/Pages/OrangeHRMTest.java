package com.OrangeHRM.Pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseClass {
	@Test(priority = 3)
	public void loginTest() throws InterruptedException
	{
		test=extent.createTest("loginTest");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(5000);
		
		String actTitle=driver.getTitle();
		String expTitle="OrangeHRM";
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test(priority = 2)
	public void verifyLogo() throws Exception 
	{
		test=extent.createTest("verifyLogo");
		Thread.sleep(5000);
		boolean flag = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	@Test(priority = 1)
	public void verifyTitle() throws InterruptedException
	{
		test=extent.createTest(" verifyTitle");
		String actualTitle=driver.getTitle();
		String expectedTitle="OrangeHRM1";
		Assert.assertEquals(actualTitle, expectedTitle);
		Thread.sleep(5000);
	}

}