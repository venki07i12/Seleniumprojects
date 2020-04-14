package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class TestNGEbaysearch {

		public static WebDriver driver;
		
		@BeforeMethod
		public static void setup()  {
			// Launch application
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Application launched sucessfully");
		}
		@Test
		public static void login() throws InterruptedException {
			driver.findElement(By.name("q")).sendKeys("ebay");
			Thread.sleep(2000);
			driver.findElement(By.name("btnK")).click();
			driver.findElement(By.xpath("//h3[@class='LC20lb']")).click();
			driver.findElement(By.xpath("//div/input[@name='_nkw']")).sendKeys("tv");
			Select category = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
			category.selectByVisibleText("Consumer Electronics");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td/input[@id='gh-btn']")).click();
			System.out.println("Searched item succesfully");
			
		}
		@AfterMethod
		 public static void teardown() {
			 driver.close();
			 System.out.println("Browser closed successfully");
		 }

	}

	