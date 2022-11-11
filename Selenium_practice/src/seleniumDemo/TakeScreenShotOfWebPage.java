package seleniumDemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotOfWebPage {

	public static void main(String[] args) throws IOException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.nopcommerce.com/en/demo");
	        driver.manage().window().maximize();
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        TakesScreenshot ts=(TakesScreenshot)driver;
	        
	        
	        File src=ts.getScreenshotAs(OutputType.FILE);
	        
	        File trg=new File("C:\\Users\\UDAYRAJE\\eclipse-workspace\\Selenium_practice\\ScreenShot");
	        
	        
	        FileUtils.copyFile(src, trg);
	        
	        driver.close();

	}

}
