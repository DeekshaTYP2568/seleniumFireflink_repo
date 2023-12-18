package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass{
	
	@Test
	public void addProductToCart() {
		driver.findElement(By.xpath("//a[@id='men']")).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//h3")));
		driver.findElement(By.xpath("(//button[@tabindex='0'])[2]")).click();
		Reporter.log("Product added to cart successfully",true);
	}
	
}
