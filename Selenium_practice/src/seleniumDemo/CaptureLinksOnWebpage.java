package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CaptureLinksOnWebpage {

	public static void main(String[] args) {
		
		   ChromeOptions op=new ChromeOptions();
		   op.addArguments("headless");
		   
		
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver(op);// pass the headless object.
	       driver.get("https://www.automationtestinginsider.com/p/blog-page.html");
	        driver.manage().window().maximize();
	        
	         List<WebElement> links = driver.findElements(By.tagName("a"));
//	         System.out.print(links);
	         
	         for(int i=1;i<=links.size();i++)
	         {
	        	String Text = links.get(i).getText();
	        	 System.out.println(Text);
	        	 String actualLinks = links.get(i).getAttribute("href");
	        	 System.out.println(actualLinks);
	        	 
	         }
	        
	        

	}

}
