package mypackages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassingParameters {
	
	public static WebDriver driver;
	public static void setup() {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com/");
	
	}
	public static void clicklink(String nlanguage, String ilangauge) {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.findElement(By.linkText(nlanguage)).click();
	driver.findElement(By.linkText(ilangauge)).click();
	}
	
	public void closechrome() {
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		PassingParameters obj = new PassingParameters();
		setup();
		clicklink("हिन्दी", "English");
		Thread.sleep(5000);
		obj.closechrome();
						
		
	}

}
