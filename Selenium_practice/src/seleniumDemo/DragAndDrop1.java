package seleniumDemo;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1
{

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	        driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         
          WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
           driver.switchTo().frame(iframe);
           Thread.sleep(3000);
           
           WebElement img1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]"));
           WebElement img2 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]"));
           WebElement img3 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[3]"));
           WebElement img4 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[4]"));
           WebElement trash = driver.findElement(By.xpath("//*[@id=\"trash\"]"));
          
           Actions act=new Actions(driver);
           
           act.dragAndDrop(img1, trash).perform();
           Thread.sleep(1000);
           act.dragAndDrop(img2, trash).perform();
           Thread.sleep(1000);
           act.dragAndDrop(img3, trash).perform();
           Thread.sleep(1000);
           act.dragAndDrop(img4, trash).perform();
           Thread.sleep(1000);
         
         
	}

}
