package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
	       driver.manage().window().maximize();
	      
	      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       
	       // System.out.println( driver.findElement(By.xpath("//select[@name='cars']")).isDisplayed());
	        
	         // System.out.println(driver.findElement(By.xpath("//select[@name='cars']")).isEnabled());
	          
	        //  System.out.println(driver.findElement(By.xpath("//select[@name='cars']")).isSelected());
	          
	      WebElement dropdown = driver.findElement(By.xpath("//select[@name='cars']"));
	       Select s=new Select(dropdown);
	      // s.selectByIndex(3);
	      // Thread.sleep(5000);
	       s.selectByValue("saab");
	      // s.selectByVisibleText("saab");
	       Thread.sleep(5000);
	       
	      // System.out.println(driver.findElement(By.xpath("//select[@name='cars']")).isSelected());
	       

	}

}
