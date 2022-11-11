package com.OrangeHRM_1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pages.HomePage;

public class LoginPageTest extends BaseClass1
{
     public HomePage hp;
     public void logoTest() 
     {
    	boolean flag = lp.validateLogo();
    	Assert.assertTrue(flag);
     }
     @Test
     public void loginTest() 
     {
    	 WebDriver driver=this.driver;
    	 hp=lp.login(prop.getProperty("username"),prop.getProperty("password"));
    	 String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    	 String actualURL=driver.getCurrentUrl();
    	 Assert.assertEquals(actualURL, expectedURL);
     }
}
