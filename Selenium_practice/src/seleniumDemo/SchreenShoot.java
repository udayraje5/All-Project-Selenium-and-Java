package seleniumDemo;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SchreenShoot {

	public static void main(String[] args) {

	    WebDriver driver= new ChromeDriver();
	    driver.get("http://www.facebook.com");
	    driver.manage().window().maximize();    
	    driver.findElement(By.xpath(".//*[@id='u_0_m']")).sendKeys("screenshot");

	    TakesScreenshot ts=(TakesScreenshot)driver;

	    File source=ts.getScreenshotAs(OutputType.FILE);    
	    FileHandler.copy(source,new File("*./Screenshots/facebook.png"));

	    driver.quit();
	  }
	

	}


