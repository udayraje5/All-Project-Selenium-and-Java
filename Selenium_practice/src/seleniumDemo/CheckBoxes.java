package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
	       driver.manage().window().maximize();
	      
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       
	       System.out.println(driver.findElement(By.xpath("//input[@name='Checkbox1']")).isDisplayed());
	       
	       
	       System.out.println(driver.findElement(By.xpath("//input[@name='Checkbox1']")).isEnabled());
	       
	       
	       driver.findElement(By.xpath("//input[@name='Checkbox1']")).click();
	       Thread.sleep(5000);
	       
	      System.out.println( driver.findElement(By.xpath("//input[@name='Checkbox1']")).isSelected());
	      
	      System.out.println(driver.findElement(By.xpath("//input[@name='Checkbox2']")).isDisplayed());
	     System.out.println(driver.findElement(By.xpath("//input[@name='Checkbox2']")).isEnabled());
	     driver.findElement(By.xpath("//input[@name='Checkbox2']")).click();
	    System.out.println( driver.findElement(By.xpath("//input[@name='Checkbox2']")).isSelected());
	    System.out.println(driver.findElement(By.xpath("//input[@name='Checkbox1']")).isSelected());
	     
	      

	}

}
