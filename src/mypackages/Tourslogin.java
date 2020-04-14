package mypackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tourslogin {

	public static WebDriver driver;
	public static void main(String[] args) {
		// Login
		System.setProperty("WebDriver.Chrome.Driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("qaq");
		driver.findElement(By.name("password")).sendKeys("qaq");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//input[@type='image' and @name='login']")).click();
				
		

	}

}

