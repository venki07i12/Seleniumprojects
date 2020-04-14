package mypackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.GeckoDriverService;

public class Handlingnotification {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--disable-notifications"); 
		  WebDriver driver = new ChromeDriver(options);
		 
		/*
		 * FirefoxOptions options = new FirefoxOptions(); 
		 * options.setProfile(new FirefoxProfile()); 
		 * options.addPreference("dom.webnotifications.enabled", false); 
		 * WebDriver driver = new FirefoxDriver(options);
		 */
		
		driver.get("https://www.novartisclinicaltrials.com/TrialConnectWeb/home.nov");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Home")).click();

	}

}
