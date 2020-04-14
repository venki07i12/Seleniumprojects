package facebookPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Facebookpageobject {
	
	public static WebElement loginuname(WebDriver driver)
	{
		return driver.findElement(By.name("email"));
	}
	
	public static WebElement loginpwd(WebDriver driver)
	{
		return driver.findElement(By.name("pass"));
	}
	
	public static WebElement loginclick(WebDriver driver)
	{
		return driver.findElement(By.id("u_0_b"));
	}
}
