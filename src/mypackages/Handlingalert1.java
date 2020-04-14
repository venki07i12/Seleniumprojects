package mypackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalert1 {

	//CReate Object
	public static WebDriver driver;
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://secure.aponline.gov.in/CitizenPortal/UserInterface/Citizen/LoginForm.aspx");
	}
	//Login application
	public void login() {
		//login without password
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("venki07i12");
		driver.findElement(By.xpath("//input[@name='ImageButton1' and @id='ImageButton1']")).click();
		Alert a =driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
	}
	
	public static void go() {
		//enter into application without login credentials
		driver.findElement(By.xpath("//input[@name='imgBtnGo']")).click();
	}
	
	public static void main(String[] args) {
		Handlingalert1 a1 = new Handlingalert1();
		a1.setup();
		a1.login();
		go();
	}

}
