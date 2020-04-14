package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


import com.google.common.io.Files;

public class Screenshotex2 {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("//input[contains(@id,'login1')]")).isDisplayed())
		{
		System.out.println("Login field is enabled to enter username");
		driver.findElement(By.xpath("//input[contains(@id,'login1')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("venki07i12");
		}
		if(driver.findElement(By.xpath("//input[contains(@id,'password')]")).isDisplayed())
		{
		System.out.println("Password field is enable to enter pwd");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("enki@34");
		}
		driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
		
		try {
				if(driver.findElement(By.xpath("//a[contains(@class,'rd_logout')]")).isDisplayed()) {
				System.out.println("Login successfully");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[contains(@class,'rd_logout')]")).click();
			}
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("Login Failed...check the screenshot as specified path");
			//File src=((RemoteWebDriver)driver).getScreenshotAs(OutputType.FILE);
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//Files.copy(src, new File("D:\\Selenium Testing\\MindQ\\seleniumprojects\\screenshots\\reddifmail.png"));
			FileUtils.copyFile(src, new File("D:\\Selenium Testing\\MindQ\\seleniumprojects\\screenshots\\reddifmail2.png"));
			System.out.println("Image saved in folder");
			
		}
			

	}

}
