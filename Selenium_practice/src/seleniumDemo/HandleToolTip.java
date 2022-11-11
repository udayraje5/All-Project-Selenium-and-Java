package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleToolTip {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://jqueryui.com/tooltip/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        driver.switchTo().frame(0);
	        Thread.sleep(5000);
	        
	        WebElement age = driver.findElement(By.id("age"));
	        String toolTipText = age.getAttribute("title");
	        System.out.println(toolTipText);

	}

}
