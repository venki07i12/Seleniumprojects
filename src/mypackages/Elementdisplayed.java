package mypackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementdisplayed {

	//create object
	public static WebDriver driver;
	// Launch application
			public void setup()
			{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://newtours.demoaut.com");
			
			}
	//Login validation
			public void logintest()
			{
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
				if(username.isDisplayed()) {
					System.out.println("Username element found in Application and Script executing..");
					if(username.isEnabled()) {
					System.out.println("user element enabled for typing");
					username.sendKeys("qaq");
					driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qaq");
					driver.findElement(By.xpath("//input[@name='login']")).click();
					}
					else {
					System.out.println("Username element is disable for typing");
					}
				}
					else {
						System.out.println("Username element not found in Application");
					}
												
			}
			public static void close()
			{
				driver.quit();
			}
	public static void main(String[] args) {
		Elementdisplayed ed = new Elementdisplayed();
		ed.setup();
		ed.logintest();
		close();
	}

}
