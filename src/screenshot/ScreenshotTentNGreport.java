package screenshot;




import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ScreenshotTentNGreport {
	
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeMethod
	public void setup()
	{
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	@Test
	public void screencapture() throws IOException
	{
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File screenshot = new File("D:\\Selenium Testing\\MindQ\\seleniumprojects\\screenshots\\sample2.png");
		FileUtils.copyFile(srcFile, screenshot);
		Reporter.log("<br><img src='" +screenshot+"'height = '400' width = '400'/><br>");
		
	}
	
}
