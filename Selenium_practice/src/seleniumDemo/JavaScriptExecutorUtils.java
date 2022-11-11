package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorUtils {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/demo");
		 WebElement nopcommerceLogo=driver.findElement(By.xpath("//img[@title='nopCommerce']"));
		
		JavaScriptExecutorDemo.drawBorder(nopcommerceLogo, driver);
		

	}

}
