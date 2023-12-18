package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHAndleFilePopup {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=CjwKCAiAjrarBhAWEiwA2qWdCKkT7rv05d-m4OQ7E9RI8a6Af4P09FnJyZZx1_ofvL0cuY3vpKNUURoC_Y4QAvD_BwE&gclsrc=aw.ds");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\User\\Desktop\\Mobile emulator.txt");
		driver.quit();
	}
}
