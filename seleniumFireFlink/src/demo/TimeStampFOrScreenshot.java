package demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TimeStampFOrScreenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver r = new ChromeDriver();
		WebDriver driver = r;
		driver.manage().window().maximize();
		LocalDateTime syst = LocalDateTime.now();
		String time = syst.toString().replaceAll(":", "_");
		driver.navigate().to("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		File temp = driver.findElement(By.xpath("//b[text()='SkillRary']")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/image3 "+time+" .png");
		FileHandler.copy(temp, dest);
		driver.quit();
	}

}
