package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normalise_space {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/login/");
	        driver.manage().window().maximize();
	       WebElement click = driver.findElement(By.xpath("//a[normalize-space(text())='Sign up for Facebook']"));
	         click.click();

	}

}
