package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrame {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        driver.switchTo().frame("packageListFrame");
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
	        
	        driver.switchTo().defaultContent();   // Switch focus from iframe to main page
	        Thread.sleep(3000);
	        
	        driver.switchTo().frame("classFrame");
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Help']")).click();
	        Thread.sleep(3000);
	        
	        driver.switchTo().defaultContent();
	        Thread.sleep(3000);
	        
	        driver.switchTo().frame("packageFrame");
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//span[normalize-space()='WebDriver']")).click();  
	        Thread.sleep(3000);

	}

}
