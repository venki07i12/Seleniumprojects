package mypackages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenelement {

	public static WebDriver driver;
	public static void main(String[] args) {
		//launch application
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement> we = driver.findElements(By.xpath("//input[@id='male']"));	 
		int count = we.size();
		System.out.println("Total Radio Buttons:" +count);
		for(int i=0; i<we.size();i++)
		{
			int x = we.get(i).getLocation().getX();
			if(x !=0)
			{
				we.get(i).click();
				break;
			}
		}

	}

}
