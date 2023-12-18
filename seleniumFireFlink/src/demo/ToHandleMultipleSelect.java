package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultipleSelect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		WebElement select = driver.findElement(By.xpath("//select[@id='cars']"));
		Select scar = new Select(select);
		scar.selectByIndex(3);
		scar.selectByValue("99");
		scar.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		List<WebElement> all = scar.getOptions();
		for(WebElement allOption : all)
		{
			System.out.println(allOption.getText());
		}
		
		driver.quit();
	}

}
