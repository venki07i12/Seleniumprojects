package mypackages;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayCountry {

	public static WebDriver driver;
	public static void main(String[] args) {
		// launch application
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://newtours.demoaut.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("REGISTER")).click();
		List<WebElement> countries = driver.findElements(By.tagName("option"));
		System.out.println(countries.size());
		for(int i =0; i<countries.size();i++)
		{
			System.out.println(countries.get(i).getText());
		}

	}

}
