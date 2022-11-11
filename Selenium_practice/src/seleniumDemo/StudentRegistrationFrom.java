package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentRegistrationFrom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.findElement(By.xpath("//input[@value='Dancing']")).click();
	       Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@name='BCom']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@value='Female']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//input[@name='Hobby'])[1]")).click();
	}

}
