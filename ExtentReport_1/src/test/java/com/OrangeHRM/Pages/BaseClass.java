package com.OrangeHRM.Pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.aventstack.extentreports.utils.FileUtil;

public class BaseClass {
    
	public WebDriver driver;
	public ExtentHtmlReporter htmlReporter;// reference variable
	public ExtentReports extent;
	public ExtentTest test;

	

	@BeforeSuite
	public void setExtent() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/ExtentReports/My_files.html");
		htmlReporter.config().setDocumentTitle("Automation Test Report");
		htmlReporter.config().setReportName("OgangeHRM Test Report");

		htmlReporter.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "My Host");
		extent.setSystemInfo("Project Name", "OrangeHRM");
		extent.setSystemInfo("Tester Name", "Uday Arsolikar");
		extent.setSystemInfo("Os", "Windows-10");
		extent.setSystemInfo("Browser", "chrome");
	}

	@BeforeMethod
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.PURPLE));
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.INDIGO));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
		}
		driver.close();
	}

	public static String takeScreenShot(WebDriver driver, String fileName) throws IOException, Exception {
		Thread.sleep(3000);
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
/*		String target = System.getProperty("user.dir")+"\\Screenshot\\"+fileName+"_"+dateName+".webp";
		File finalDest = new File(target);
		FileUtils.copyFile(source, finalDest);

		return target;*/
		try
		{
			
			FileUtils.copyFile((File) screenshot, new File("C:\\Users\\UDAYRAJE\\Pictures.png"));
		}
		c
	}

	@AfterSuite
	public void endReport() {
		extent.flush();

	}

}
