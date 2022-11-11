package seleniumDemo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCookies1 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://stackoverflow.com/questions/49568448/take-a-screen-shot-and-copy-through-fileutils-in-selenium-webdriver-and-java");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        Set<Cookie> cooki = driver.manage().getCookies();
	        System.out.println(cooki.size());
	        
	        System.out.println(cooki);
	        Thread.sleep(5000);
	        
	        Cookie cook=new Cookie("My House","Udayraje123");
	        driver.manage().addCookie(cook);
	        Thread.sleep(5000);
	        
	        System.out.println(cooki);
	        Thread.sleep(5000);
	        
	        System.out.println(cooki.size());
	        Thread.sleep(5000);
	        
	        driver.manage().deleteAllCookies();
	        Thread.sleep(5000);
	        
	        System.out.println(cooki.size());
	        Thread.sleep(5000);
	        
	        driver.close();
	        
	        

	}

}
