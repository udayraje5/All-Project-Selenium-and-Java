package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
	        driver.manage().window().maximize();
	        boolean select = driver.findElement(By.xpath("(//input[@name='Gender'])[1]")).isSelected();
	                System.out.println(select);
	          Thread.sleep(2000);
	          
	        boolean enable = driver.findElement(By.xpath("(//input[@name='Gender'])[1]")).isEnabled();
	               System.out.println(enable);
	               Thread.sleep(2000); 
	        
	        driver.findElement(By.xpath("(//input[@name='Gender'])[1]")).click();
	        Thread.sleep(2000); 
	          
	       boolean select1 = driver.findElement(By.xpath("(//input[@name='Gender'])[1]")).isSelected();
	          System.out.println(select1);
	          Thread.sleep(2000); 
	          
	          boolean display = driver.findElement(By.xpath("(//input[@name='Gender'])[2]")).isDisplayed();
	               System.out.println(display);
	               Thread.sleep(2000); 
	               
	               boolean enable1 = driver.findElement(By.xpath("(//input[@name='Gender'])[2]")).isEnabled();
	               System.out.println(enable1);
	               Thread.sleep(2000); 
	               
	                 boolean selected = driver.findElement(By.xpath("(//input[@name='Gender'])[2]")).isSelected();
	                 System.out.println(selected);
	                 Thread.sleep(2000); 
	                 
	               driver.findElement(By.xpath("(//input[@name='Gender'])[2]")).click();
	                Thread.sleep(2000); 
	          
		        boolean select2 = driver.findElement(By.xpath("(//input[@name='Gender'])[2]")).isSelected();
		          System.out.println(select2);
		          Thread.sleep(2000);
		          
		          boolean select3 = driver.findElement(By.xpath("(//input[@name='Gender'])[1]")).isSelected();
		          System.out.println(select3);
		          Thread.sleep(2000); 

	}

}
