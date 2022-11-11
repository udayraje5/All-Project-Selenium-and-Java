package seleniumDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {



	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.automationtestinginsider.com/p/blog-page.html");
	        driver.manage().window().maximize();
	        
	       String win = driver.getWindowHandle();
//	       System.out.println(win);
	       driver.findElement(By.partialLinkText("Orange HRM ")).click();
	      Set<String> winIds = driver.getWindowHandles();
//	      System.out.println(winIds);
//	      Iterator<String> it = winIds.iterator();
//	      String ParentWinId = it.next();
//	      String ChildWinId = it.next();
//	      System.out.println(ParentWinId);
//	      System.out.println(ChildWinId);
	      
	      List<String> winIdList = new ArrayList<>(winIds);
	      String parent = winIdList.get(0);
	      String child = winIdList.get(1);
	      System.out.println(parent+" "+ child);
	      
	      
	      
	        
	}

}
