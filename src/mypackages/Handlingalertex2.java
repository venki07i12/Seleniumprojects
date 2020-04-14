package mypackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalertex2 {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// lanuch the application
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//registration
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("login1")).sendKeys("manoja");
		//click on go
		driver.findElement(By.name("proceed")).click();
		Alert a1 = driver.switchTo().alert();
		System.out.println(a1.getText());
		String str =a1.getText();
		if(str.equals("Please enter your password"))
		{
			System.out.println("alert message is correct");
		}
		else {
			System.out.println("alert msg is wrong");
		}
		a1.accept();
		driver.close();
		

	}

}
