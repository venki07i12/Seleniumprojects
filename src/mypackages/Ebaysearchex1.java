package mypackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebaysearchex1 {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// Launch application
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("q")).sendKeys("ebay");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//h3[@class='LC20lb']")).click();
		driver.findElement(By.xpath("//div/input[@name='_nkw']")).sendKeys("tv");
		Select category = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
		category.selectByVisibleText("Consumer Electronics");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td/input[@id='gh-btn']")).click();
		
		

	}

}
