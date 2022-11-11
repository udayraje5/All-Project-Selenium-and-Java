package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalender3 {

	public static void main(String[] args) throws InterruptedException {
		  
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.redbus.in/");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
	       Thread.sleep(4000);
	       
//	       String year="2023";
	       String month="August 2023";
	       String date="5";
	       
	       while(true) {
	    	   
	    	  String monthYear = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
/*	    	String arr[]=monthYear.split(" ");
	    	String mnt=arr[0];//month
	    	String yr=arr[1];//year  */
	    	
	    	if(monthYear.equals(month)) {
	    		
	    		break;
	    	}
	    	else {
	    		driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
	    		
	    	}
	       }
	    	List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
	    	for(WebElement singleDate:allDates) {
	    		
	    		String dt = singleDate.getText();
	    		if(dt.equals(date)) {
	    			
	    			singleDate.click();
	    			break;
	    		}
	    	}
	    	  
	    	  
	    	  
	    	 
	       }
	       

	}

