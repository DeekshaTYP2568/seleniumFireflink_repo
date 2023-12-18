package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossyBrowsery {
	public WebDriver driver;

	@Parameters("browser")
	@Test
	public void demo(@Optional("edge") String bname) {
		if (bname.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (bname.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else if (bname.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.get("https://demowebshop.tricentis.com/");
	}
}
