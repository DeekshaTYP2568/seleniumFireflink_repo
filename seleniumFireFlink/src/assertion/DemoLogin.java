package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoLogin {
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("abhis@1234");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		if(driver.getTitle().equals("Demo Web Shop")) {
			Reporter.log("User Logged in Successfully");
		}
		else
			Reporter.log("User Failed to login");
	}
}
