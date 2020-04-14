package mypackages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownwithoutSelect {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		List<WebElement> we = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//a//label"));
		System.out.println(we.size());
		for(int i=0;i<we.size(); i++)
		{
			System.out.println(we.get(i).getText());
			if(we.get(i).getText().equals("Oracle"))
			{
					we.get(i).click();
					break;
			}
					
		}
	}

}
