package mypackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleex {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("test matches");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		String str = driver.findElement(By.id("resultStats")).getText();
		System.out.println(str);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Images")).click();
		
		
	}

}
