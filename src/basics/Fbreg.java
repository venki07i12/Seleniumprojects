package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbreg {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// Launch application
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Registration
		driver.findElement(By.name("firstname")).sendKeys("Rushiketh");
		driver.findElement(By.id("u_0_o")).sendKeys("Ippa");
		driver.findElement(By.name("reg_email__")).sendKeys("venkatippa2020@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("venkatippa2020@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("9553440104");
		//drop down
		Select Bday = new Select(driver.findElement(By.name("birthday_day")));
		Bday.selectByValue("13");
		Select Dmonth = new Select(driver.findElement(By.id("month")));
		Dmonth.selectByVisibleText("Jan");
		Thread.sleep(2000);
		Select Dyear = new Select(driver.findElement(By.id("year")));
		Dyear.selectByVisibleText("1986");
		//Radio button
		driver.findElement(By.id("u_0_7")).click();
		driver.findElement(By.name("websubmit")).click();
		
	}

}
