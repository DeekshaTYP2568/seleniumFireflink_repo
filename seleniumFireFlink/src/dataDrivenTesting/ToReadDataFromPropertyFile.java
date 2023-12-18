package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testdata/commondata.properties");

		Properties prop = new Properties();
		
		prop.load(fis);
		
		String URL = prop.getProperty("url");
		String UName = prop.getProperty("username");
		
		System.out.println(URL);
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
	}

}
