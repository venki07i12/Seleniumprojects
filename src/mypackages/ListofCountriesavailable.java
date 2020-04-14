package mypackages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListofCountriesavailable {

	public static WebDriver driver;
	public static void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	public static void search()
	{
		WebElement list1 = driver.findElement(By.name("country"));
		List<WebElement> lc = list1.findElements(By.tagName("option"));
		boolean status = false;
		for(int i=0; i<lc.size();i++) {
		String country = lc.get(i).getText();
		if(country.equals("ANDORRA ")) {
			Select select = new Select(list1);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			select.selectByVisibleText("ANDORRA ");
			System.out.println("Option with 'ANDORRA' is available in Dropdown");
			status = true;
			break;
		}
		}
		if (status != true) {
			System.out.println("Option with ' ANDORRA ' is  not available in Dropdown");
		}
	}
	
	
	public static void main(String[] args) {
		setup();
		search();

	}

}
