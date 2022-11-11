package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textField {

	public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
	        driver.manage().window().maximize();
	        String tagname = driver.findElement(By.name("message")).getTagName();
	        System.out.println(tagname);
	        driver.findElement(By.name("message")).clear();
	          driver.findElement(By.name("message")).sendKeys("I love my India");
	          driver.findElement(By.xpath("(//input[@type='submit'])[1]")).submit();
	       

	}

}
 