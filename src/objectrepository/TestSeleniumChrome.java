package objectrepository;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestSeleniumChrome {
	
	ConfigReader config;
	
	@BeforeTest
	public void setup()
	{
		config = new ConfigReader();
		System.setProperty("webdriver.chrome.driver", config.getchromepath());
		System.out.println("=========setup is ready =============");
	}
	
	@Test
	public void Testchrome() throws Exception
	{
		System.out.println("=========Test started =============");
		WebDriver driver = new ChromeDriver();
		driver.get(config.getApplicationurl());
		driver.quit();
		
		System.out.println("=========Test closed =============");
	}
	

}
