package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://the-internet.herokuapp.com/key_presses");
	        driver.manage().window().maximize();
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        Actions act=new Actions(driver);
	        
	        act.sendKeys(Keys.ENTER).perform();
	        Thread.sleep(3000);
	        
	        act.sendKeys(Keys.SHIFT).perform();
	        Thread.sleep(3000);
	        
	        act.sendKeys(Keys.ESCAPE).perform();
	        Thread.sleep(3000);
	        
	        act.sendKeys(Keys.TAB).perform();
	        Thread.sleep(3000);
	        
	        act.sendKeys(Keys.CONTROL).perform();
	        Thread.sleep(3000);
	        
	        driver.close();

	}

}
