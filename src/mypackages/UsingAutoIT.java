package mypackages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsingAutoIT {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public static void setup()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.timesjobs.com/candidate/register.html?siteparams=3p9901&utm_source=google&utm_medium=cpc&utm_campaign=search&outSource=versionA_B&gclid=EAIaIQobChMIiLrejsi35AIVj4BwCh23qgxAEAAYASAAEgLkcfD_BwE");
		
			
	}

	@Test
	public static void upload() throws InterruptedException, IOException
	{
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id=\"emailAdd\"]")).sendKeys("venkatesh.ippa@gmail.com");
		driver.findElement(By.xpath("(//input[@name='resumeFile_basic'])[1]")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("F:\\Autoit001.exe");
	}
	
	@AfterMethod
	public static void teardown()
	{
		//driver.close();
	}
}
