package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalender1 {

	public static void main(String[] args) throws InterruptedException {
		   String month="August 2023";
		   String day="23";
		  
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.redbus.in/");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
	       Thread.sleep(4000);
	        
	        while(true)
	        {
	        	String text = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
	        	
	       	if(text.equals(month))
	        	{
	        		break;
	        	}
	        	else {
	        		
	        		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
	        	}
	        	
	        }	
	
	        driver.findElement(By.xpath("/html[1]/body[1]/div[5]/table[1]/tbody[1]/tr/td[contains(text(),\"23\")]")).click();	
	        
		
	        
	        
	        
	      
	}

}
