package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/fantasy-football");
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("send-sms-iframe");
		WebElement ele = driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("1234097891");
		driver.findElement(By.xpath("//a[@id='regUser']")).click();
		driver.quit();
	}

}
