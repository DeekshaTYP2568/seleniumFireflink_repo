package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManage {
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillary.io/en");
		driver.manage().window().minimize();
		driver.quit();
	}
}
