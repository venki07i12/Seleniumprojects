package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GooglePageObjects {

	public static WebElement txtsearchgoogle(WebDriver driver)
	{
		return driver.findElement(By.name("q"));
	}
	
	public static WebElement btnsearchgoogle(WebDriver driver)
	{
		return driver.findElement(By.name("btnK"));
	}
	
}
