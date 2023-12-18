package demo;

import java.time.Duration;import javax.swing.tree.ExpandVetoException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationExpilitAndImplicit {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		WebDriver driver = d;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.shoppersstack.com/products_page/7");
		driver.findElement(By.xpath("//input[@id ='Check Delivery']")).sendKeys("560010");
		WebElement checkButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(checkButton));
		checkButton.click();
		driver.quit();
	}

}
