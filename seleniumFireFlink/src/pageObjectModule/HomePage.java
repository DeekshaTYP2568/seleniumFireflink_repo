package pageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver1) {
		PageFactory.initElements(driver1,this);
	}

}
