package seleniumDemo;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		WebElement file = driver.findElement(By.name("fileupload"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(file).perform();
		
		file.sendKeys("C:\\Users\\UDAYRAJE\\Desktop\\Abc.txt");
		

	}

}
