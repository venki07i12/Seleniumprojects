package modulardrivenframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Repository {
	public static WebDriver driver;
	
	public static void setup()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Testdata.url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public static void login()
	{
		driver.findElement(Locators.username).sendKeys(Testdata.username_email);
		driver.findElement(Locators.password).sendKeys(Testdata.password_pwd);
		driver.findElement(Locators.login).click();
	}
	
}
