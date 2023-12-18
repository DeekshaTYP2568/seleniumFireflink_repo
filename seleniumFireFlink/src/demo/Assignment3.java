package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.switchTo().frame("//iframe[@id='iframeResult']");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		driver.quit();
	}

}
