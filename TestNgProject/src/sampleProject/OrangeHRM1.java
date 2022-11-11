package sampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHRM1 {
	 static WebDriver driver;
	  @Test(priority = 1)
	  public void OpenBrowser() throws Exception {
		  System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(5000);
	  }
	  @Parameters({"uname1","pass1"})
	  @Test(priority = 2)
	  public static void loginToOrangeHRM(@Optional("Admin") String username,@Optional("admin123")String password) 
	  {
		  driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("password")).sendKeys("password");
		  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  }
}
