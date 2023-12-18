package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGet {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.fireflink.com/");
		String title = driver.getTitle();
		
		String url = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		
		driver.close();
		
	}

}
