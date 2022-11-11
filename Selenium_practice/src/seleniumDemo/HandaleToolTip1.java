package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandaleToolTip1 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://demoqa.com/tool-tips");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        WebElement btn = driver.findElement(By.id("toolTipButton"));
	        
	        Actions act=new Actions(driver);
	        
	        act.moveToElement(btn).perform();
	        
	        

	}

}
