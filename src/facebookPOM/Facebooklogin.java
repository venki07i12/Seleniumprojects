package facebookPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Facebooklogin {

	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public void texttologin(WebDriver driver)
	{
		Facebookpageobject.loginuname(driver).sendKeys("9553440104");
		Facebookpageobject.loginpwd(driver).sendKeys("9553440104");
		Facebookpageobject.loginclick(driver).click();
	}
}
