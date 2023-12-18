package demo;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionWindow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		//driver.manage().window().setPosition(new org.openqa.selenium.Point(200, 300));
		driver.manage().window().setPosition(new Point(300, 300));
	}
}