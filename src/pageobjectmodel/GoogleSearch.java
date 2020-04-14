package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class GoogleSearch {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public void texttosearch(WebDriver driver)
	{
		GooglePageObjects.txtsearchgoogle(driver).sendKeys("Selenium");
		GooglePageObjects.btnsearchgoogle(driver).click();
	}

}
