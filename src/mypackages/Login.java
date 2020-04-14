package mypackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//Launch application
		
	System.setProperty("WebDriver.Chrome.Driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("firstname")).sendKeys("Venkat");
	driver.findElement(By.name("lastname")).sendKeys("Ippa");
	driver.findElement(By.name("reg_email__")).sendKeys("9553440104");
	driver.findElement(By.name("reg_passwd__")).sendKeys("venki@34");
	Select Bday = new Select(driver.findElement(By.id("day")));
	Bday.selectByValue("13");
	Select Bmonth = new Select(driver.findElement(By.name("birthday_month")));
	Bmonth.selectByVisibleText("Jan");
	Thread.sleep(2000);
	Select Byear = new Select(driver.findElement(By.name("birthday_year")));
	Byear.selectByVisibleText("1986");
	driver.findElement(By.id("u_0_7")).click();
	driver.findElement(By.name("websubmit")).click();

	}

}
