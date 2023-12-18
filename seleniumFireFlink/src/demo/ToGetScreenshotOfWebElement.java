package demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToGetScreenshotOfWebElement {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		WebDriver driver1 = driver;
		driver1.manage().window().maximize();
		driver1.navigate().to("https://www.myntra.com/");
		File temp = driver1.findElement(By.xpath("//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo ']")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/image2.png");
		FileHandler.copy(temp, dest);
		driver1.quit();
	}

}
