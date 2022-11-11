package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.opencart.com/index.php?route=account/register");
	       driver.manage().window().maximize();
	       WebElement city = driver.findElement(By.id("input-country"));
//	       city.click();
	       Select s=new Select (city);
	       List<WebElement> alloption = s.getOptions();
//	       s.selectByVisibleText("Angola");
	       for(WebElement option:alloption)
	       {

	    	if(option.getText().equals("Angola"))
	    	{	
	    		
	    	option.click();
	    	break;
	       }
			
	    	   
	}

}
}
