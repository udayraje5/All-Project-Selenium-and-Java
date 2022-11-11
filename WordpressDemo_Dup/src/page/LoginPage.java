package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(id = "user_login") WebElement username;
	@FindBy(id = "user_pass") WebElement password;
	@FindBy(id = "wp-submit") WebElement loginBtn;
	@FindBy(xpath = "//a[normalize-space()='Powered by WordPress']")WebElement logo;
    //or
	@FindBy(how=How.XPATH,using="//input[@type='checkbox']")WebElement rememberMe;
	public LoginPage(WebDriver drive ) {
		this.driver=drive;
	}
	public void loginToWordPress(String uname,String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
	}
	public boolean verifyLogo() {
		return logo.isDisplayed();
	}
	public void remember_Me() {
		rememberMe.click();
	}
}
