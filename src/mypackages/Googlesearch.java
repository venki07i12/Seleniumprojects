package mypackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	public static WebDriver driver;
	public static void setup()
	{
		// launch application
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	}
	//Implicit wait
	public static void linklanguages()
	{
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.linkText("हिन्दी")).click();
	driver.findElement(By.linkText("తెలుగు")).click();
	driver.findElement(By.linkText("English")).click();

	}
	public void searchfk()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Flipkart");
		driver.findElement(By.xpath("(//input[@class='gNO89b' and @name='btnK'])[1]")).click();
	}
	//launch Flipkart application
	public static void flipkart()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//h3[@class='sA5rQ']")).click();
	}
	/*public void teardown()
	{
		driver.close();
	}*/

public static void main(String[] args) {
	Googlesearch obj = new Googlesearch();
	setup();
	linklanguages();
	obj.searchfk();
	flipkart();
	
	//obj.teardown();
}
}

