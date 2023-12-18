package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttribute {
	@Test(priority =2, invocationCount = 5,threadPoolSize = 5)
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		Reporter.log("User login successfully",true);
	}
	
	@Test(priority=-1,invocationCount = 3,enabled = false)
	public void register() {
		Reporter.log("User registered successfully",true);
	}
	
}
