package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildWindowPopup {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/3");
		String parentId = driver.getCurrentUrl();
		driver.findElement(By.xpath("//button[@type='button' and @id='compare' ]")).click();
		Set<String> allWindowId = driver.getWindowHandles();
		
		for(String id: allWindowId)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.contains("amazon")) {
				break;
			}
		}
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		driver.switchTo().window(parentId);
		driver.close();
	}

}
