package mypackages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicgooglesearch {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("testing");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']//li/descendant::div[@class='sbl1']"));
		System.out.println("total number of suggestions in searchbox:" + list.size());

		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("testing life cycle"))
			{
				list.get(i).click();
				break;
			}
		}
	}

}
