package seleniumDemo;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {

	public static void main(String[] args) {
		String location = System.getProperty("user.dir") + "Downloads";

		HashMap preferences = new HashMap();
		preferences.put("download.default_directory", location);

		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", preferences);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.4.0");

		driver.findElement(By.xpath("(//a[@class='vbtn'])[2]")).click();

	}

}
