package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigureAnnotation {
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Establish DB connection and report config",true);
	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("Close DB connectiona nd flush all reports",true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test executed...",true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("After Test executed...",true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Open Browser and navigate to URL",true);
	}
	@AfterClass
	public void afterClass() {
		Reporter.log("Close Browser",true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Codes which are related to login",true);
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("Logout",true);
	}
	@Test
	public void demoTest() {
		Reporter.log("Demo test executed...",true);
	}
	@Test
	public void sampleTest() {
		Reporter.log("Sample test executed",true);
	}
}
