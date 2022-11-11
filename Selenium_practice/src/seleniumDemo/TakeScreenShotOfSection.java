package seleniumDemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotOfSection {

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.nopcommerce.com/en/demo");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	       WebElement section = driver.findElement(By.xpath("//h1[normalize-space()='nopCommerce Store Demo']"));
	        
	        TakesScreenshot ts=(TakesScreenshot)driver;
	        
	        File src = section.getScreenshotAs(OutputType.FILE);
	        File trg = new File(".\\ScreenShot\\header.png");
	        
	        FileUtils.copyFile(src, trg);
	        driver.close();
	        
	        

	}

}
