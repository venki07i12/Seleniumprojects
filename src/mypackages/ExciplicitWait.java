package mypackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExciplicitWait {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// Launch application
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://accounts.google.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("venkatesh.ippa");
	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	WebDriverWait w = new WebDriverWait(driver, 30);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	//driver.findElement(By.xpath("//input[@name='password']")).clear();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("venkatesh@34");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}

}
