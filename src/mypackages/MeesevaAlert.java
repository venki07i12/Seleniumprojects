package mypackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeesevaAlert {

	//create object
		public static WebDriver driver;
		//setup()
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://onlineap.meeseva.gov.in/CitizenPortal/UserInterface/Citizen/Home.aspx");
		}
		public void login() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("venki07i12");
			driver.findElement(By.xpath("//input[@name='btnsubmit']")).click();
			Alert a1 = driver.switchTo().alert();
			System.out.println(a1.getText());
			String text=a1.getText();
			if(text.equals("Enter your password."))
			{
			System.out.println("correct alert message");
			}
			else
			{
			System.out.println("incorrect alert message");
			}
			a1.accept();
		
		}
		public static void main(String[] args) {
			// call method into main method
			MeesevaAlert obj = new MeesevaAlert();
			obj.setup();
			obj.login();
		}

	}
