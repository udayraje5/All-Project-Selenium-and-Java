package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) throws InterruptedException {
	
		  System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/login/");
	        driver.manage().window().maximize();
	        Thread.sleep(10000);//10000=10 seconds
	        driver.navigate().to("https://www.makemytrip.com/cabs/");
	        driver.navigate().back();
	        Thread.sleep(10000);
	        driver.navigate().forward();
	       System.out.println(driver.getTitle());
	       String title = driver.getTitle();
	       System.out.println(title);
	        String url = driver.getCurrentUrl();
	        System.out.println(url);
	        String pagesource = driver.getPageSource();
	        System.out.println(pagesource);
	        driver.close();

	}

}
