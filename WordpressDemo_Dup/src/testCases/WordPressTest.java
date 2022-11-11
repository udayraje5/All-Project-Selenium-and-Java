package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.LoginPage;


public class WordPressTest {

	WebDriver driver;
	LoginPage lp;
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	     driver = new ChromeDriver();
		driver.get("https://login.wordpress.org/");
		lp=PageFactory.initElements(driver, LoginPage.class);
	}
	@Test(priority = 2)
	public void verifyLogin() throws Exception {
		
		lp.loginToWordPress("admin", "demo123");
		Thread.sleep(3000);
		lp.remember_Me();
		Thread.sleep(3000);
		
	}
	@Test(priority = 1)
	public void verifyLogo() {
	
		boolean flag = lp.verifyLogo();
		System.out.println(flag);
	}
/*	@Test(priority = 3)
	public void verifyRememberMeCheckBox() throws Exception {
		lp.remember_Me();
		Thread.sleep(3000);
		
		
	}*/
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
