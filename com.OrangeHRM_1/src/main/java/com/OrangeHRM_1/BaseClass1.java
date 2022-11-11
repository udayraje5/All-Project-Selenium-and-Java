package com.OrangeHRM_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass1<LoginPage> 
{
	public WebDriver driver;
	public LoginPage lp; 
	public Properties prop;
	public void readConfig() throws IOException 
	{
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\config.properties");
		prop.load(fis);
	}

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		lp = new LoginPage(driver);

	}

	@AfterMethod
	public void tearDown() 
	{
        driver.close();
	}

}
