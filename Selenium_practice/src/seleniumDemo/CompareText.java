package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompareText {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.text-compare.com/");
	        driver.manage().window().maximize();
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        WebElement text1 = driver.findElement(By.className("text1"));
	        text1.sendKeys("Good morning Sir");
	        Thread.sleep(5000);
	        
	        WebElement text2 = driver.findElement(By.className("text2"));
	        Thread.sleep(5000);
	        
	        Actions act=new Actions(driver);
	        Thread.sleep(5000);
	        
	        act.keyDown(Keys.CONTROL);
	        act.sendKeys("a");
	        act.keyUp(Keys.CONTROL);
	        act.perform();
	        Thread.sleep(5000);
	        
	        act.keyDown(Keys.CONTROL);
	        act.sendKeys("c");
	        act.keyUp(Keys.CONTROL);
	        act.perform();
	        Thread.sleep(5000);
	        
	        act.sendKeys(Keys.TAB).perform();
	        
	        act.keyDown(Keys.CONTROL);
	        act.sendKeys("v");
	        act.keyUp(Keys.CONTROL);
	        act.perform();
	        Thread.sleep(5000);
	        
	        driver.findElement(By.className("compareButtonText")).click();
	        

	}

}
