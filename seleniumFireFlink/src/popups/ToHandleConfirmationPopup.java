package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert confirmationPopup = driver.switchTo().alert();
		System.out.println(confirmationPopup.getText());
		Thread.sleep(2000);
		confirmationPopup.accept();
		//no need to again switch to alert popup
		Thread.sleep(2000);
		System.out.println(confirmationPopup.getText());
		confirmationPopup.accept();
		Thread.sleep(2000);
		driver.quit();
	}

}
