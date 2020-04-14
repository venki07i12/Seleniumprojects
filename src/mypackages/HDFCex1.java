package mypackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCex1 {

	public static WebDriver driver;
	public static void main(String[] args) {
		//launch application
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com/");
		//search hdfc
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hdfc bank");
	driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//center//input[@name='btnK']")).click();
		//launch hdfc application
	driver.findElement(By.xpath("(//h3[contains(text(), 'HDFC Bank - ')])[1]")).click();
	driver.findElement(By.xpath("//div[@id='popup_box']//a[@id='popupBoxClose']")).click();
	//driver.findElement(By.xpath("//li//a//span[@class='home-icon-large-off menu-icon']")).click();
	//driver.findElement(By.xpath("//div[@id='popup_box']//a[@id='popupBoxClose']")).click();
	driver.findElement(By.xpath("//div[@class='pull-right ng-scope']//button[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("(//label[@class='link-name'])[4]")).click();
	driver.findElement(By.xpath("//div[@class='login-button-options']//a[contains(text(),'Login')]")).click();
	
		

	}

}
