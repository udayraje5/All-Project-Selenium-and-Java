package seleniumDemo;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RichtClickOperation {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        WebElement btn = driver.findElement(By.xpath("//span[text()='right click me']"));
	        Actions act=new Actions(driver);
	        
	        act.contextClick(btn).perform();
	        
	        

	}
}