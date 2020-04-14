package mypackages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Handlingwindow1 {

	public static WebDriver driver;
	
	@BeforeMethod
	public static void setup()
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/trains");
	}
	
	@Test
	public static void handlewindow() throws InterruptedException
	{
		//Click on PNR status
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		//Click on Cancellation
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		// Create object for Allwindows
		Set<String> allwindows = driver.getWindowHandles();
		// Create object for Iterator
		Iterator<String> itr = allwindows.iterator();
		//without using loops
		String mainwinsdow = itr.next();
		String cancelwindow = itr.next();
		String pnrwindow = itr.next();
		//To handle windows
		Thread.sleep(2000);
		driver.switchTo().window(mainwinsdow);
		System.out.println("Mainwindow is: " + driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().window(pnrwindow);
		System.out.println("PNR window is: " +driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().window(cancelwindow);
		System.out.println("Cancel window: " + driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().window(pnrwindow);
		driver.findElement(By.xpath("//input[@name='pnr' and @id='pnr']")).sendKeys("618390012");
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(3000);
		driver.switchTo().window(mainwinsdow);
		
	}
	
	@AfterMethod
	public static void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}

//System.out.println(mainwinsdow); //it will generate window auto ID
//System.out.println(cancelwindow); //it will generate window auto ID
//System.out.println(pnrwindow); //it will generate window auto ID
	