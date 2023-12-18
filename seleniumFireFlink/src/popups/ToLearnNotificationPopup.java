package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToLearnNotificationPopup {

	public static void main(String[] args) {
		ChromeOptions settings = new ChromeOptions();
		//settings.addArguments("--disable-notifications");
		settings.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(settings);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.navigate().to("https://www.redbus.in/");
	}

}
