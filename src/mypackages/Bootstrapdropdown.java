package mypackages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropdown {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
		driver.findElement(By.id("dropdownMenuButton")).click();
		List<WebElement> lw= driver.findElements(By.xpath("//div[@class='dropdown-menu' and @aria-labelledby='dropdownMenuButton']//a"));
		System.out.println(lw.size());
		for(int i=0;i<lw.size(); i++)
		{
			System.out.println(lw.get(i).getText());
			
			  if(lw.get(i).getText().equals("Action")) 
			  { 
			   lw.get(i).click(); //Program is correct but it is dome site so it is not selected properly
			   break;
			  }
			 
		}
	}

}
