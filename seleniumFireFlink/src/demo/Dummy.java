package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/events/greatindianfestival?tag=googmantxtmob96-21&ascsubtag=_k_CjwKCAjw-eKpBhAbEiwAqFL0mpEXIANatR1N592Vw1XBM_EQ-tzzXmJKZ6mdgEMscqIyrPmUdzHZ5RoCssAQAvD_BwE_k_&deals-widget=%257B%2522version%2522%253A1%252C%2522viewIndex%2522%253A0%252C%2522presetId%2522%253A%2522deals-collection-see-all-deals%2522%252C%2522discountRanges%2522%253A%255B%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252210%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A10%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252225%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A25%252C%2522to%2522%253Anull%252C%2522selected%2522%253Atrue%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252250%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A50%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252270%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A70%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%255D%252C%2522sorting%2522%253A%2522FEATURED%2522%257D");
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
	}

}
