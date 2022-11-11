package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
	       driver.manage().window().maximize();
	       
	      
	       boolean uncheck = driver.findElement(By.xpath("//input[@name='Checkbox2']")).isSelected();
		      System.out.println(uncheck);
		     
		      
	     
	       driver.findElement(By.xpath("//input[@name='Checkbox1']")).click();
	      
	       
	       boolean check = driver.findElement(By.xpath("//input[@name='Checkbox1']")).isSelected();
	       System.out.println(check);
	      
           
	     
	}

}

