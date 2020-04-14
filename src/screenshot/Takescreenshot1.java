package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Takescreenshot1 {

	public static void main(String[] args) throws IOException {
		//launch application
		
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//Login application
		driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("venki07i12");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("enki@34");
		driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
		try
		{
			WebElement str = driver.findElement(By.xpath("//a[contains(@class,'rd_logout')]"));
			if(str.isDisplayed())
				System.out.println("Login succesfull");
		}
		catch(Exception e)
		{
				System.out.println(e.getMessage());
				System.out.println("Login failed");
				File src = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
				Files.copy(src, new File("D:\\Selenium Testing\\testing9.jpg"));
				//FileUtils.copyFile(src, new File("D:\\Selenium Testing\\testing9.jpg"));
				
			
		}
		
	}
	
}
