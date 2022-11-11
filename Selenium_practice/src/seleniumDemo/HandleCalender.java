package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalender {

	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver", "E:\\Soft\\BrowserDrivers\\chromedriver.exe"); 
		  WebDriver driver=new ChromeDriver(); 
		  driver.get("https://www.redbus.in/"); 
		  driver.manage().window().maximize(); 
		  driver.findElement(By.id("onward_cal")).click(); 
		  
		  Thread.sleep(2000);
		   
/*		  String year="2023"; 
		  String month="Feb"; 
		  String date="15"; 
		   
		  while(true) 
		  { 
		   String monthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText(); 
		   String arr[]=monthYear.split(" "); 
		   String mnt=arr[0];//Month 
		   String yr=arr[1];//Year 
		   
		   if(mnt.equals(month) && yr.equals(year) ) 
		   { 
		    break; 
		   } 
		   else  
		   { 
		    driver.findElement(By.xpath("//button[normalize-space()='>']")).click(); 
		   } 
		    
		    List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td")); 
		     
		    for(WebElement singleDate:allDates) 
		    { 
		     String dt = singleDate.getText(); 
		     if(dt.equals(date)) 
		     { 
		      singleDate.click(); 
		      break; 
		     } 
		      
		    } 
		     
		   }*/
		  } 
		   
		 }	
	
	