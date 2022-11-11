package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Alert_Box_Pop_up {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	        driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            
            driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
            Thread.sleep(3000);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            Thread.sleep(3000);
            
            driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
            Thread.sleep(3000);
            alert.dismiss();
            Thread.sleep(3000);
            
            driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
            Thread.sleep(3000);
            String alertText = alert.getText();
            System.out.println(alertText);
            Thread.sleep(3000);
            alert.sendKeys("Hi I am an alert Box");
            Thread.sleep(3000);
            alert.accept();
            
      
      
      
      

	}

}
//*[@id="content"]/div/ul/li[1]/button