package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://qatechhub.com/mouse-hover-actions-selenium-webdriver/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        WebElement ele = driver.findElement(By.id("menu-item-21"));
	        Actions act=new Actions(driver);
	         act.moveToElement(ele).perform();
	         Thread.sleep(3000);
	         
	         WebElement sele = driver.findElement(By.id("menu-item-2676"));
	         act.moveToElement(sele).perform();
	         Thread.sleep(3000);
	         
	         WebElement cucumber=driver.findElement(By.id("menu-item-2352"));
	         act.moveToElement(cucumber).perform();
	         Thread.sleep(3000);
	         
	         cucumber.click();

	}

}
