package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigate {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://web.skype.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.navigate().to(new URL("https://www.fireflink.com/"));
		
		String title = driver1.getTitle();
		Thread.sleep(2000);
		System.out.println(title);
		driver1.quit();
	}

}
