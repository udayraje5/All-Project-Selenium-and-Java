package testNgExercise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class OrangeHRMDemo {
	static WebDriver driver;

	@Test(priority = 5)
	public void teatDown() {
		driver.close();

	}

	@Test(priority = 4)
	public static void grtTitle() {

		String title = driver.getTitle();
		System.out.println(title);
	}
     @Test(priority = 1)
	public static void OpenBroser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}

	@Test(priority = 3)
	public static void getcurrentPageUrl() {

		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}

	@Test(priority = 2)
	public static void loginToHRMSite() throws Exception {
		Thread.sleep(5000);
		WebElement userName = driver.findElement(By.name("username"));
		userName.clear();

		userName.sendKeys("Admin");
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.name("password"));
		password.clear();

		password.sendKeys("admin123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
