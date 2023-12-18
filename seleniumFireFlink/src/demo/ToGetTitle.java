package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String title =driver.getTitle();
		System.out.println(title);
	}

}
