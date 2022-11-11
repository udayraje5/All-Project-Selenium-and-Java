package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
      
        
    //	  System.setProperty("webdriver.gecko.driver", "F:\\Browser Driver\\lib\\geckodriver.exe");
    //    WebDriver driver=new FirefoxDriver(); 
        
   //     System.setProperty("webdriver.edge.driver", "F:\\Browser Driver\\lib\\msedgedriver.exe");
   //     WebDriver driver=new EdgeDriver();
        
        
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        Thread.sleep(10000);//10000=10 seconds
        driver.navigate().to("https://www.makemytrip.com/cabs/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com/");
        Thread.sleep(10000);
        driver.quit();
 
	}

}
