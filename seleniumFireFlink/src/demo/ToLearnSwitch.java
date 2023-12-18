package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class ToLearnSwitch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/3");
		driver.findElement(By.className("MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-2c7buj")).click();
		java.util.Set<String> windid =driver.getWindowHandles();
		
		for(String id :windid)
		{
			driver.switchTo().window(id);
			Thread.sleep(1000);
			driver.quit();
		}
		
		/*for(String id : windid)
		{
			if(driver.getCurrentUrl().contains("flipkart"))
			{
				driver.manage().window().maximize();
			}
		}*/
		
		
	}

}
