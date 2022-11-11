package sampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHRM {
	 static WebDriver driver;
  @Test(priority = 1)
  public void OpenBrowser() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
  }
  
  @Test(dataProvider = "login",priority = 2)
  public static void loginToOrangeHRM(String username,String password) 
  {
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys("password");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
  }
  @DataProvider(name="login")
  public static Object [] []loginCredentials()
  {
	  return new Object [] [] {{"Admin","admin123"},{"Admin","admin123"}};
  }
}
