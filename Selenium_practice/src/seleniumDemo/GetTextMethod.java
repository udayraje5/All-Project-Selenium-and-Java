package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.manage().window().maximize();
	        String text = driver.findElement(By.xpath("//span[contains(@style,'color:red;')]")).getText();
	            System.out.println(text);
	        
	        
	        

	}

}
