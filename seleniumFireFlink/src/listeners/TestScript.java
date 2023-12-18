package listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersImplementation.class)
public class TestScript  extends BaseClass{
	@Test
	public void login() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("abc@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Assert.assertEquals(true, false);
	}
}
