package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtendReports {
	
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;
	
	@Test
	public static void extendreport()
	{
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkatesh\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		report = new ExtentReports("D:\\Selenium Testing\\MindQ\\seleniumprojects\\test-output\\venkatesh.html");
		test = report.startTest("Open Browser");
		test.log(LogStatus.INFO, "browser opened");
		
		driver.get("https://www.google.com/");
		test.log(LogStatus.INFO, "google opened");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.close();
		test.log(LogStatus.INFO, "Browser closed");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		report.flush();
		report.endTest(test);
	}

}
