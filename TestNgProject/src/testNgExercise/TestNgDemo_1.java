package testNgExercise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo_1 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("aftertest");

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");

	}

	@Test
	public void testMethod1() {
		System.out.println("Java");
	}
	@Test
	public void testMethod2() {
		System.out.println("Selenium");
	}
}
