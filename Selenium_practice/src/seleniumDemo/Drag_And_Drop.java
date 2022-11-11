package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        Thread.sleep(3000);
	        
	        WebElement Madrid = driver.findElement(By.id("box7"));
	        WebElement Spain = driver.findElement(By.id("box107"));
	        Thread.sleep(3000);
	        
	        WebElement Wishington = driver.findElement(By.id("box3"));
	        WebElement UnitedStates = driver.findElement(By.id("box103"));
	        Thread.sleep(3000);
	        
	        Actions act=new Actions(driver);
	        act.dragAndDrop(Wishington, UnitedStates).perform();
	        Thread.sleep(3000);
	        act.dragAndDrop(Madrid, Spain).perform();
	        
	        
	        
	        
	}

}
