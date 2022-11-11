package com.Wordpress.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Wordpress.Pages.Login;

public class LoginTest {
	WebDriver driver;
	Login lg;
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	     driver = new ChromeDriver();
		driver.get("https://login.wordpress.org/");
	}
	@Test(priority = 3)
	public void loginTest() {
		
		
		 lg=new Login(driver);
		
		lg.typeUserName("admin");
		lg.typePassword("demo123");
		lg.clickOnLoginButton();
		boolean flag=lg.verifyLogo();
		System.out.println(flag);
		
	}

@Test(priority = 1)
public void logoTest() {
	
	
	 lg=new Login(driver);
	
	
	boolean flag=lg.verifyLogo();
	System.out.println(flag);
	
}
@Test(priority = 2)
public void verifyDropDown() {
	
	 lg=new Login(driver);
	 lg.chooseLanguage();
}
//@AfterMethod
public void tearDown() {
	driver.quit();
}

}
