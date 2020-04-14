package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Passingparameters {

public static WebDriver driver;
	
	@BeforeClass
	public static void setup()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	}
	@Test
	@Parameters({"nlaguage", "ilaguage"})
	public static void clciklinks(String nlaguage, String ilangauge)
	{
		Reporter.log("national langauge is visible for searching");
		driver.findElement(By.linkText(nlaguage)).click();
		driver.findElement(By.linkText(ilangauge)).click();
		
	}
	
	/*@Test
	public static void exe()
	{
		clciklinks("हिन्दी", "English");
	}*/
	
	@AfterClass
	public static void teardown()
	{
		driver.close();
	}
}
