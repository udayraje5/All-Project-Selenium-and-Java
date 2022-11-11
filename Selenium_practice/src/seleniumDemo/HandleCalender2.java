package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalender2 {

	public static void main(String[] args) throws InterruptedException {
		 String month="August 2023";
		   String day="10";
		  
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.makemytrip.com/");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
	       Thread.sleep(4000);
	       
	      while(true) {
	    	  
	    	 String text = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[1]/div")).getText();
	    	  
			if(text.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
			}
		}
	      
	      driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[2]/div[5]/div[1]/p[1]")).click();

	}

}
