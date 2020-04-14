package mypackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SDETtraining {

	public static WebDriver driver;
	public static void main(String[] args) {
		//Launch application
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		//Registration
		driver.findElement(By.name("ctl00$MainContent$txtFirstName")).sendKeys("Venkatesh");
		driver.findElement(By.name("ctl00$MainContent$txtEmail")).sendKeys("venki07i12@gmail.com");
		driver.findElement(By.name("ctl00$MainContent$txtHomePhone")).sendKeys("9553440104");
		driver.findElement(By.id("MainContent_Male")).click();
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("venki@34");
		driver.findElement(By.name("ctl00$MainContent$txtVerifyPassword")).sendKeys("venki@34");
		Select Mcountry = new Select(driver.findElement(By.name("ctl00$MainContent$menuCountry")));
		Mcountry.selectByVisibleText("India");
		driver.findElement(By.id("MainContent_checkMonthlyEmail")).click();
		driver.findElement(By.name("ctl00$MainContent$btnSubmit")).click();
				
	}

}
