package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropByGenricMethod {
	   static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	        driver=new ChromeDriver();
	       driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	       driver.manage().window().maximize();
	      driver.findElement(By.className("comboTreeArrowBtnImg")).click();
	      
	      selectChoiceValues(driver,"choice 1  ");
	      

	}
	
	public static void selectChoiceValues(WebDriver driver,String... value)
	{
		
		 List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
				 if(!value[0].equals("all"))
				 {
					 for(WebElement item:choiceList) {
						 
						String text = item.getText();
						for(String val:value)
						{
							item.click();
							break;
						}
					 }
				 }
		 
		 
				 else
				 {
					 for(WebElement item:choiceList)
					 {
						 item.click();
					 }
				 }
		
	}

}
