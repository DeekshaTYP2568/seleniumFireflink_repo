package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethods {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapp.skillrary.com/");
		driver.findElement(By.xpath("//option[@value='99']")).click();
		driver.quit();
		
	}

}
