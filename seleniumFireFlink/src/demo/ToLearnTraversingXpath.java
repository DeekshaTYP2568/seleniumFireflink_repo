package demo; 

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTraversingXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com/mobiles?rawQuery=mobiles");
		driver.findElement(By.xpath("//label[@class='common-customCheckbox vertical-filters-label']/..//input[@type='checkbox' and @value='Mobile Accessories']")).click();
		driver.quit();
	}

}
