package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnToHandleHiddenPopupsCalendarPopups {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.makemytrip.com/");
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='notification-frame-317738b3']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//a[@class='close']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		driver.findElement(By.xpath("//div[text()='December 2023']/../..//p[text()='13']")).click();
		driver.findElement(By.xpath("//label[@for='return']")).click();
		while(true) {
		try {
			driver.findElement(By.xpath("//div[text()='August']/../..//p[text()='7']")).click();
			break;
		} catch (Exception e) {
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		}
		driver.quit();
	}

}
