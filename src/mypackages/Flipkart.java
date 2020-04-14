package mypackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static WebDriver driver;
	public static void main(String[] args) {
		// Launch application
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		//search for flipkart
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("flipkart");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("btnK")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//h3[@class='LC20lb'])[1]")).click();
		//login flipkart
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("Login & Signup")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9553440104");
		driver.findElement(By.xpath("//input[@type='password' and@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("venki@34");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		driver.findElement(By.xpath("//div/input[@name='q']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@class='vh79eN']/*")).click();
	}

}
