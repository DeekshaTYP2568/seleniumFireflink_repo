	package pageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
	}
	@FindBy(xpath="//input[@name='emailId']")
	private WebElement emailTextfield;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordTextfield;

	@FindBy(xpath ="//button[@type='submit']" )
	private WebElement loginButton;
	
	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}
	
}
