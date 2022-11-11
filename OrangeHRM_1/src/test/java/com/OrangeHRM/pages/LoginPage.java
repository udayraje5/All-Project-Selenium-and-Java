package com.OrangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage {
	public WebDriver driver;
	
	By username = By.name("username");
	By password = By.name("password");
	By loginBtn = By.xpath("//button[@type='submit']");
	By logo     = By.xpath("//img[@alt='company-branding']")
  @Test
  public void ValidateLogo() {
	   driver.findElement(logo);
	  
  }
}
