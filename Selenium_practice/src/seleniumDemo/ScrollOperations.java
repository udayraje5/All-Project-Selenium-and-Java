package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollOperations {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.automationtestinginsider.com/");
	        driver.manage().window().maximize();
	        
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        
//	        WebElement June = driver.findElement(By.xpath("//div[@id='BlogArchive1']//li[1]"));
	        
//	        js.executeAsyncScript("window.scrollBy (0,10000)");
//	        js.executeScript("arguments[0].scrollIntoView()",June );
	        
	        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

}
