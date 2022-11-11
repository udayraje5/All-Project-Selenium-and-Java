package com.Wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Login {

	WebDriver driver;
	By username = By.id("user_login");
	By password = By.id("user_pass");
	By loginBtn = By.id("wp-submit");
	By logo   = By.xpath("//a[normalize-space()='Powered by WordPress']");
    By languageDropdown= By.id("language-switcher-locales");
	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void typeUserName(String uname) {

		driver.findElement(username).sendKeys("uname");

	}

	public void typePassword(String pass) {
		driver.findElement(password).sendKeys("pass");
	}

	public void clickOnLoginButton() {
		driver.findElement(loginBtn).click();
	}
	public boolean verifyLogo() {
		driver.findElement(logo).isDisplayed();
		return true;
	}
	
	public void chooseLanguage() {
		
//		Select s=new Select((WebElement) languageDropdown);
//	    s.selectByValue("Dansk");
	
			driver.findElement(languageDropdown).click();
			driver.findElement(languageDropdown).sendKeys(Keys.ARROW_UP);
		driver.findElement(languageDropdown).isSelected();
		
	}
}
