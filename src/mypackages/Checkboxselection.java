package mypackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxselection {

	public static WebDriver driver;
	public static void main(String[] args) {
		// Launch application
	System.setProperty("werbdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://www.echoecho.com/htmlforms09.htm");
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//input[@name='Checkbox'])[1]")).click();
	boolean x = driver.findElement(By.xpath("(//input[@name='Checkbox'])[2]")).isSelected();
	if(x==true)
	
		driver.findElement(By.xpath("(//input[@name='Checkbox'])[2]")).click();
	driver.findElement(By.xpath("(//input[@name='Checkbox'])[3]")).click();

	}

}
