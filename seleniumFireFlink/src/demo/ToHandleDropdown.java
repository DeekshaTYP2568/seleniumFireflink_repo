package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		WebDriver driver1 = driver;
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver1.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805511%7Cb%7Cfacebook%20create%20account%7C&placement=&creative=550525805511&keyword=facebook%20create%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-12091220328%26loc_physical_ms%3D9062081%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiApaarBhB7EiwAYiMwqkfaGmcN7uV5WLFfE5INgn0r_tviOl_B71g3HP69uST78NaZw1Wh1RoCbbkQAvD_BwE");
		WebElement dayDropdown = driver1.findElement(By.xpath("//select[@id='day']"));
		Select daySelect = new Select(dayDropdown);
		daySelect.selectByIndex(4);
		
		
	}

}
