package sampleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
	static WebDriver driver;

	@Test(priority = 1)

	public static void OpenBroser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test(priority = 2)

	public static void getPageUrl() {

		String pageURL = driver.getCurrentUrl();
		System.out.println(pageURL);
	}
	@Test(priority = 3)
	public static void getCurrentURL() {
		 String currentURL = driver.getCurrentUrl();
		 System.out.println("currentURL");
	}
	@Test(priority = 4,invocationCount = 3)
	public static void getPageTitle() {
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
	}
}
