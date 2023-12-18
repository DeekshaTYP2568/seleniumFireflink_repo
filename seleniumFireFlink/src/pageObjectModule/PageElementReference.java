package pageObjectModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageElementReference {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		WebDriver driver1 = driver;
		driver1.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver1.get("https://app.fireflink.com/signin");
		LoginPage lp = new LoginPage(driver1);
		lp.getEmailTextfield().sendKeys("jiopradeepvs@gmail.com");
		driver1.navigate().refresh();
		lp.getEmailTextfield().sendKeys("jiopradeepvs@gmail.com");
		LoginPage lp1 = new LoginPage(driver1);
		driver.navigate().refresh();
		lp1.getEmailTextfield().sendKeys("jiopradeepvs@gmail.com");
	}

}
