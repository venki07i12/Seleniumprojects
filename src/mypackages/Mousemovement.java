package mypackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovement {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		// Launch application

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.spicejet.com/");
	//Dynamic wait
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();
	driver.findElement(By.linkText("SpiceBiz")).click();
	
	
	}

}
