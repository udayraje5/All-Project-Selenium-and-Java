package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrameDemo {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://demo.automationtesting.in/Frames.html");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	        
	        driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
	        
	        WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	        driver.switchTo().frame(frame1);
	        Thread.sleep(3000);
	        
	        WebElement frame2 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	        driver.switchTo().frame(frame2);
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Welcome");
	        Thread.sleep(3000);
	        
	        driver.switchTo().defaultContent();
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).click();
	        Thread.sleep(3000);
	        
	        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	        Thread.sleep(3000);
	        
	        driver.switchTo().frame(frame3);
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome in Selenium") ;
	       
	}

}
