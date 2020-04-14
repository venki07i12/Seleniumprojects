package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassingparametersTestNG {

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
		driver.get("http://demo.actitime.com/login.do");
		
	}
	
	@Test
	@Parameters({"username","password"})
	public void launch (String username, String password)
	{
		WebElement we = driver.findElement(By.xpath("//input[@name='username']"));
		if(we.isDisplayed())
		{
		Reporter.log("Login with username is visible");
			if(we.isEnabled())
			{
				Reporter.log("Login text is enabled for typing");
				we.sendKeys(username);
				driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
				driver.findElement(By.xpath("//div[text()='Login ']")).click();
			}
				else 
					Reporter.log("Username element is disable for typing");
			}
		else
			Reporter.log("Username field is not displayed");
		}
		
	@AfterClass
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		//driver.close();
	}
	
	}
	