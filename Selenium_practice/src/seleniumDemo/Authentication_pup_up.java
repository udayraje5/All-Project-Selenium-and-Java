package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_pup_up {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
//	       driver.get("https://Username:password@the-internet.herokuapp.com/basic_auth");
	       driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	        driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   

	}

}
