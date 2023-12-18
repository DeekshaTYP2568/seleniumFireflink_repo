package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformActionOnDisabledElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		driver.findElement(By.xpath("(//a[@class='license-link icn-lock'])[1]")).click();
		WebElement disabledEle = driver.findElement(By.xpath("//a[text()='Download jdk-8u391-linux-aarch64.rpm']"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", disabledEle);
	}

}
