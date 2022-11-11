package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Permission_Pop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
	       WebDriver driver=new ChromeDriver(option);
	       driver.get("https://www.travelyaari.com/");
	        driver.manage().window().maximize();



	}

}
