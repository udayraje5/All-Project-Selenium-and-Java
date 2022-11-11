package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/login/");
	        driver.manage().window().maximize();
	        
	      
	        
	        driver.findElement(By.partialLinkText("Facebook")).click();
	        driver.findElement(By.name("firstname")).sendKeys("Uday");
	        driver.findElement(By.name("lastname")).sendKeys("Raje");
	        driver.findElement(By.name("reg_email__")).sendKeys("uday.arsolikar@gmail.com");
	        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("uday.arsolikar@gmail.com");
	        driver.findElement(By.name("reg_passwd__")).sendKeys("uday5");
	        driver.findElement(By.xpath("//label[text()='Male']")).click();
	        boolean isSelected = driver.findElement(By.xpath("//label[text()='Male']")).isSelected();
	          System.out.println(isSelected);
	       
	        
	       
	        
	        
	       
	}

}
