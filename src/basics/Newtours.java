package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Newtours {

	public static WebDriver driver;
	public static void main(String[] args) {
		// launch browser
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("venkat");
		driver.findElement(By.name("lastName")).sendKeys("Ippa");
		driver.findElement(By.name("phone")).sendKeys("0123456789");
		driver.findElement(By.id("userName")).sendKeys("venkatesh.ippa@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Suncity");
		driver.findElement(By.name("address2")).sendKeys("Hyderabad");
		driver.findElement(By.name("city")).sendKeys("Hyd");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("Kukatpally");
		Select Mycountry = new Select(driver.findElement(By.name("country")));
		Mycountry.selectByValue("92");
		driver.findElement(By.name("email")).sendKeys("venkatesh.ippa@gmail.com");
		driver.findElement(By.name("password")).sendKeys("venki@34");
		driver.findElement(By.name("confirmPassword")).sendKeys("venki@34");
		driver.findElement(By.name("register")).click();
	}

}