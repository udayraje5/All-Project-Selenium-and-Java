package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementsMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/login/");
	        driver.manage().window().maximize();
	        driver.findElement(By.name("email")).sendKeys("uday.arsolikar@gmail.com");
	        Thread.sleep(3000);
	        boolean enable = driver.findElement(By.name("login")).isEnabled();
	        System.out.println(enable);
	        
	        boolean dispaly = driver.findElement(By.id("loginbutton")).isDisplayed();
		     System.out.println(dispaly);
		     Thread.sleep(3000);
		     
	       driver.findElement(By.id("loginbutton")).click();
	       Thread.sleep(3000);
	       
	       driver.findElement(By.linkText("Forgotten password?")).click();
	       Thread.sleep(3000);
	       
	     boolean enable1 = driver.findElement(By.name("reset_action")).isEnabled();
	     System.out.println(enable1);
	     
	   
	     driver.close();
	        
	        
	       
	}

}
