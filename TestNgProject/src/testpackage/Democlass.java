package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Democlass {
	static WebDriver driver;
  @Test(priority = 1)
  
	  public static void OpenBroser() throws Exception {
			System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://www.automationtestinginsider.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
  }
			
			 @Test(priority = 2)
			  
			  public static void getTitle() throws Exception{
				 driver.getTitle();
				 
			 }

  }

