package mypackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//launch application
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("ebay");
	Thread.sleep(2000);
	driver.findElement(By.name("btnK")).click();
	driver.findElement(By.className("LC20lb")).click();
	driver.findElement(By.id("gh-ac")).sendKeys("book");
	driver.findElement(By.id("gh-btn")).click();
	driver.findElement(By.xpath("//h3[@class = 's-item__title s-item__title--has-tags']")).click();

	}

}
