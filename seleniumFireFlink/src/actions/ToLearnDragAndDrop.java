package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.switchTo().frame("//iframe[@class='demo-frame lazyloaded']");
		WebElement from = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
		WebElement dest = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(from, dest).perform();
		driver.quit();
	}

}
