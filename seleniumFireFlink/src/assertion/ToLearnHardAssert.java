package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnHardAssert {
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("abhis@1234");
		//driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login","user failed to login");
		Reporter.log("User logged in successfully",true);
	}
}
