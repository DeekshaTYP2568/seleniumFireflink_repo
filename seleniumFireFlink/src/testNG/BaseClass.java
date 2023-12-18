package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver = new ChromeDriver();
	/*@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Establish DB connection and report config",true);
	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("Close DB connection and flush all reports",true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test executed...",true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("After Test executed...",true);
	}*/
	@BeforeClass
	public void beforeClass() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		Reporter.log("Open Browser and navigate to URL",true);
	}
	@AfterClass
	public void afterClass() {
		driver.quit();
		Reporter.log("Close Browser",true);
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.xpath("//button[@name='loginBtn']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("jiopradeepvs@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Pradeepvs@879");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Reporter.log("Codes which are related to login",true);
	}
	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.xpath("//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']")).click();
		driver.findElement(By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[6]")).click();
		Reporter.log("Logout",true);
	}
}
