package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		driver.findElement(By.xpath("//input[contains(@class,'Pke_EE')]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'Pke_EE')]")).sendKeys("shoes");
		Thread.sleep(10000);
		driver.quit();
	}
}
